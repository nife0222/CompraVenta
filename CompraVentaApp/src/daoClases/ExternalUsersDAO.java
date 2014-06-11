/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daoClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sqlAccess.SQLConnector;
import sqlTables.ExternalUser;

/**
 *
 * @author LuisDiego
 */
public class ExternalUsersDAO {

    public ExternalUser login(String pUserName, String pPassword, int pTypeOfUser) {
        if(pTypeOfUser == 0){
            return loginAsAdministrator(pUserName,pPassword);
        }
        else if(pTypeOfUser == 1){
            return loginAsAgent(pUserName,pPassword);
        }
        return null;
        
    }
    
    private ExternalUser loginAsAdministrator(String pUserName, String pPassword) {
        if(validateLogin (pUserName,pPassword,0)){
            return new ExternalUser (pUserName,pPassword,0);
        }
        else{
            return null;
        }
        
     
    }
    
    private ExternalUser loginAsAgent(String pUserName, String pPassword){
        if(validateLogin (pUserName,pPassword,1)){
            return new ExternalUser (pUserName,pPassword,1);
        }
        else{
            return null;
        }
    }

    
    private boolean validateLogin(String pUsername,String pPassword, int pTypeOfUser){
        
        try {
            Connection connection = SQLConnector.createConnection();
            CallableStatement procedure = connection.prepareCall("{call validatePassword(?,?,?)}");
            procedure.setString(1, pPassword);
            procedure.setString(2, pUsername);
            procedure.setInt(3,0);
            procedure.registerOutParameter(1, Types.INTEGER);
            procedure.execute();
            int returnValue = procedure.getInt(1);
            connection.close();
            return returnValue == 0;
        } catch (SQLException ex) {
            return false;
        }
        
    }
        
    public boolean tryToChangePassword(String pUsername,String pPassword,int pTypeOfUser){
        try {
            Connection connection = SQLConnector.createConnection();
            
            //Aqui debo buscar en la BD este ususario y cambiar su contrasena por pPassword
            
            connection.close();
            return 0 == 0;
        } catch (SQLException ex) {
            return false;
        }
    }

    
}
