/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import javax.swing.JOptionPane;
import logic.SQLOperator;
import presentation.AdminMainWindow;
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
            ExternalUser user = operator.login(pUserName, pPassword, 0);
            if(user != null){
                showAdministratorWindow(user);
                pLoginWindow.dispose();
            }
            else{
                JOptionPane.showMessageDialog(pLoginWindow, "Wrong user or password, try again");
            }
        }
        else if (typeOfUser.equals("Agent")){
            ExternalUser user = operator.login(pUserName, pPassword, 1);
            if(user != null){
                showAgentWindow(user);
                pLoginWindow.dispose();
            }
            else{
                JOptionPane.showMessageDialog(pLoginWindow, "Wrong user or password, try again");
            }
        }
        
    }
    
    

    private void showAdministratorWindow(ExternalUser pAdmin) {
        AdminWindowController controller = new AdminWindowController (pAdmin);
        AdminMainWindow adminWindow = new AdminMainWindow(controller);
        adminWindow.setVisible(true);
    }
    
     private void showAgentWindow(ExternalUser user) { //Estos metodos no deberian recibir por parametro el ExternalUser?
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        AgentWindow agentWindow  = new AgentWindow(user);
        agentWindow.show();
    }

    private void loginAsAdmin(String pUserName, String pPassword, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
