/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import presentation.LoginWindow;

/**
 *
 * @author LuisDiego
 */
public class LoginWindowController {
    
    
    public void login(String pUserName,String pPassword, LoginWindow pLoginWindow){
        String typeOfUser = pLoginWindow.getTypeOfUser().getSelectedItem().toString();
        if(typeOfUser.equals("Administrator")){
            loginAsAdministrator();
            
        }
        
    }

    private void loginAsAdministrator() {
        Ope
        
        
    }
    
    
    
    
}
