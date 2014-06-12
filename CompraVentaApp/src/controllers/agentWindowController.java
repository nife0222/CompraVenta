/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.sql.Array;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logic.SQLOperator;
import presentation.AgentWindow;
import presentation.FormCreateNewUserAccount;
import presentation.FormNewPasswordAgent;
import sqlTables.ExternalUser;

/**
 *
 * @author Nicolas
 */
public class agentWindowController {
    
    private SQLOperator _operator;
    private ExternalUser _user;
            
    public agentWindowController(ExternalUser user){
        _user = user;
    }
    
    public void createNewUserAccount (AgentWindow window){
        window.setVisible(false);
        FormCreateNewUserAccount forma = new FormCreateNewUserAccount(window,true);
        forma.setVisible(true);
        window.setVisible(true);
    }
    
    public void changePassword(AgentWindow window){
        window.setVisible(false);
        FormNewPasswordAgent forma = new FormNewPasswordAgent(null,true, _user);
        forma.setVisible(true);
        window.setVisible(true);
    }
    
    public void makeUserMoneyDeposit(AgentWindow window){
        Object participant = preguntarPorOpcionDeLista(_operator.getAllParticipants().toArray());
        
        //Aqui, preguntar por el tipo de moneda, y dependiendo, traer una de las cuentas del usuario
        
        
    }
    
    private Object preguntarPorOpcionDeLista(Object[] posibilidades) {
        Object element = new Object();
        try{
            element =      JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opcion",
                    "",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    posibilidades,posibilidades[0]);
                    

        }catch (Exception E){
            element = null;
        }
        return element;   
    }
}
