/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Diego
 */
public class ConectorSQL {
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Ref http://technet.microsoft.com/en-us/library/ms378526.aspx
    public static final String DBURL = "jdbc:sqlserver://NICO-PC;databaseName=CompraVentaDolares;username=sa;password=ld1995"; // Ref http://technet.microsoft.com/en-us/library/ms378428.aspx

    // Method to create SQLServer connections
    public static Connection createConnection() {
        
        Connection conn = null;
        
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(DBURL);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Message: " + ex.getMessage());
            System.out.println("CAYO AQUI 1");
        } 
        catch(SQLException ex) {
            System.out.println("Message: " + ex.getMessage() + "\n" + "Code: " + ex.getErrorCode());
            System.out.println("CAYO AQUI 2");
        }
        
        return conn;
    }
    
}
