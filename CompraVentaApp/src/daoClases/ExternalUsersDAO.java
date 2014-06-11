/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daoClases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    private ExternalUser loginAsAgent(String pUserName, String pPassword){
        Connection connection = SQLConnector.createConnection();
        PreparedStatement sqlInstruction;
        ResultSet results;
        ArrayList <ExternalUser> agents = new ArrayList();
         try{
            String sqlWhereClause = "ENCRYPTBYPASSPHRASE('password', @Pass)";
            sqlInstruction = connection.prepareStatement("SELECT * FROM ExternalUsers"+sqlWhereClause);
            results = sqlInstruction.executeQuery();
            ExternalUser agent;
            while(results.next()){
                agent = new ExternalUser(results.getString("userName"),results.getString("password"),1);
                agents.add(agent);
            }
            connection.close();
            return agents.get(0);
        } 
        catch(SQLException e){
            return null;
        }
    }

    private ExternalUser loginAsAdministrator(String pUserName, String pPassword) {
        Connection connection = SQLConnector.createConnection();
        PreparedStatement sqlInstruction;
        ResultSet results;
        ArrayList <ExternalUser> administrators = new ArrayList();
         try{
            String sqlWhereClause = "ENCRYPTBYPASSPHRASE('password', @Pass)";
            sqlInstruction = connection.prepareStatement("SELECT * FROM ExternalUsers"+sqlWhereClause);
            results = sqlInstruction.executeQuery();
            ExternalUser admin;
            while(results.next()){
                admin = new ExternalUser(results.getString("userName"),results.getString("password"),0);
                administrators.add(admin);
            }
            connection.close();
            return administrators.get(0);
        } 
        catch(SQLException e){
            return null;
        }
        
    }
        
    

    
}
