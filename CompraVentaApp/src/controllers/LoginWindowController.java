/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import logic.SQLOperator;
import presentation.LoginWindow;

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
        
    }

    

    private void loginAsAdministrator(String pUserName, String pPassword) {
        SQLOperator operator = new SQLOperator();
        boolean success = operator.loginAsAdministrator(pUserName,pPassword);
        if(success == true){
            showAdministratorWindow(); 
        }
        else{
            System.out.println("Error");
        }
        
        
    }

    private void showAdministratorWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
