/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import logic.SQLOperator;
import presentation.AgentWindow;
import presentation.LoginWindow;
import sqlTables.ExternalUser;

/**
 *
 * @author LuisDiego
 */
public class LoginWindowController {
    
    
    public void login(String pUserName,String pPassword, LoginWindow pLoginWindow){
        String typeOfUser = pLoginWindow.getTypeOfUser().getSelectedItem().toString();
        SQLOperator operator = new SQLOperator();
        if(typeOfUser.equals("Administrator")){
            operator.login(pUserName, pPassword, 0);
        }
        else if (typeOfUser.equals("Agent")){
            showAgentWindow(operator.login(pUserName, pPassword, 1));
        }
        
    }
    
    

    private void showAdministratorWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void showAgentWindow(ExternalUser user) { //Estos metodos no deberian recibir por parametro el ExternalUser?
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        AgentWindow agentWindow  = new AgentWindow(user);
        agentWindow.show();
    }
    
    
}
