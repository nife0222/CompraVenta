/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import daoClases.ExternalUsersDAO;
import daoClases.ParticipantDAO;
import java.util.ArrayList;
import sqlTables.ExternalUser;
import sqlTables.Participant;

/**
 *
 * @author Nicolas
 */
public class SQLOperator {

    public ExternalUser login(String pUserName, String pPassword, int pTypeOfUser) {
        ExternalUsersDAO externalUserDAO = new ExternalUsersDAO();
        return externalUserDAO.login(pUserName,pPassword,pTypeOfUser);
    }
    
    public boolean tryToChangePassword(String pUserName, String pPassword, int pTypeOfUser){
        ExternalUsersDAO externalUserDAO = new ExternalUsersDAO();
        return externalUserDAO.tryToChangePassword(pUserName,pPassword,pTypeOfUser);
    }
    
    public boolean tryToSignUp(Participant participant){
        ParticipantDAO participantDAO = new ParticipantDAO();
        return participantDAO.insertarFila(participant); // false si no se inserto porque ya existia el usuario.
    }
    
    public ArrayList<Object> getAllParticipants(){
        ParticipantDAO participantDAO = new ParticipantDAO();
        return participantDAO.getAllParticipants();
    }
    
}
