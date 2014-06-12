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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sqlAccess.SQLConnector;
import sqlTables.Participant;

/**
 *
 * @author Nicolas
 */
public class ParticipantDAO {
    
    public ArrayList getAllParticipants() {
        Connection conexion = SQLConnector.createConnection();
        PreparedStatement instruccionSQL;
        ResultSet resultados;
        ArrayList <Participant> participants = new ArrayList();

        try{  
            instruccionSQL = conexion.prepareStatement("SELECT * FROM Participants");
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
    
    public boolean insertParticipant(Participant participant) {
        Participant participantToInsert = participant;
        Connection conexion = SQLConnector.createConnection();
        try {
            Connection connection = SQLConnector.createConnection();
            CallableStatement procedure = connection.prepareCall("{call ddbo.insertNewParticipant(?,?,?,?,?,?,?)}");
            procedure.setString(1, participantToInsert.getUsername());
            procedure.setString(2, participantToInsert.getPassword());
            procedure.setString(3, participantToInsert.getName());
            procedure.setInt(4, participantToInsert.getId());
            procedure.setString(5, participantToInsert.getAdress());
            procedure.setString(6, participantToInsert.getEmail());
            procedure.setBoolean(7, participantToInsert.isIsDisabled());
            procedure.executeUpdate();
            procedure.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(participantToInsert.getUsername());
            Logger.getLogger(ParticipantDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean changeStateOfParticipant(String pUserName){
        try {
            Connection connection = SQLConnector.createConnection();
            CallableStatement procedure = connection.prepareCall("{call ddbo.changeStateParticipant(?)}");
            procedure.setString(1, pUserName);
            procedure.executeUpdate();
            procedure.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
}
