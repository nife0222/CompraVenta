/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daoClases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sqlAccess.SQLConnector;
import sqlTables.Account;

/**
 *
 * @author Nicolas
 */
public class AccountDAO {
    
    public boolean insertrAccount(Account account) {
        Account accountToInsert = account;
        Connection conexion = SQLConnector.createConnection();
        try {
            String instruccionInsercion = "INSERT INTO Accounts";
            String columnasAModificar = "(typeOfCoin, suspendedMoney, credit, accountOwner) VALUES(?,?,?,?)";
            PreparedStatement instruccionSQL  = conexion.prepareStatement(instruccionInsercion+columnasAModificar);
            instruccionSQL.setBoolean(1, accountToInsert.isTypeOfCoin());
            instruccionSQL.setInt(2, accountToInsert.getSuspendedMoney());
            instruccionSQL.setInt(3, accountToInsert.getCredit());
            instruccionSQL.setString(4, accountToInsert.getAccountOwner());
            instruccionSQL.executeUpdate();
            conexion.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(accountToInsert.getAccountOwner());
            Logger.getLogger(ParticipantDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
