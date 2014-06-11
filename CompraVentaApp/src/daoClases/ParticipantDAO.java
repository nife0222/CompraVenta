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
import sqlTables.Participant;

/**
 *
 * @author Nicolas
 */
public class ParticipantDAO {
    
    public ArrayList seleccionarTodasLasFilas() {
        Connection conexion = SQLConnector.createConnection();
        PreparedStatement instruccionSQL;
        ResultSet resultados;
        ArrayList <Participant> participants = new ArrayList();

        try{  
            instruccionSQL = conexion.prepareStatement("SELECT * FROM Paises");
            //instruccionSQL.setFetchSize(100);
            resultados = instruccionSQL.executeQuery();
            Participant participant;
            while(resultados.next()){
                participant = new Participant(resultados.getString("userName"),resultados.getString("userPassword"),
                                              resultados.getString("name"),resultados.getInt("personId"),resultados.getString("adress"),
                                              resultados.getString("email"),resultados.getBoolean("isDisabled"));
                participants.add(participant);
            }
            conexion.close();
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            return participants;
        }
    }
    
}
