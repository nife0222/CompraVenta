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
    
    public boolean insertrParticipant(Participant participant) {
        Participant participantToInsert = participant;
        Connection conexion = SQLConnector.createConnection();
        try {
            
            String instruccionInsercion = "INSERT INTO Participants";
            String columnasAModificar = "(userName, userPassword, name, personId, adress, email, isDisabled) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement instruccionSQL  = conexion.prepareStatement(instruccionInsercion+columnasAModificar);
            instruccionSQL.setString(1, participantToInsert.getUsername());
            instruccionSQL.setString(2, participantToInsert.getPassword());
            instruccionSQL.setString(3, participantToInsert.getName());
            instruccionSQL.setInt(4, participantToInsert.getId());
            instruccionSQL.setString(5, participantToInsert.getAdress());
            instruccionSQL.setString(6, participantToInsert.getEmail());
            instruccionSQL.setBoolean(7, participantToInsert.isIsDisabled());
            instruccionSQL.executeUpdate();
            conexion.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(participantToInsert.getUsername());
            Logger.getLogger(ParticipantDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
