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
        if(typeOfUser.equals("Administrator")){
            loginAsAdministrator(pUserName,pPassword);
        }
        else if (typeOfUser.equals("Agent")){
            loginAsAgent(pUserName,pPassword);
        }
        
    }
    
    private void loginAsAgent(String pUserName, String pPassword) {
        SQLOperator operator = new SQLOperator();
        ExternalUser agent = operator.loginAsAgent(pUserName,pPassword);
        if(agent != null){
            showAgentWindow();
        }
        else{
            System.out.println("Error");
        }
        
        
    }

    private void loginAsAdministrator(String pUserName, String pPassword) {
        SQLOperator operator = new SQLOperator();
        ExternalUser administrator = operator.loginAsAdministrator(pUserName,pPassword);
        if(administrator != null){
            showAdministratorWindow(); 
        }
        else{
            System.out.println("Error");
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
