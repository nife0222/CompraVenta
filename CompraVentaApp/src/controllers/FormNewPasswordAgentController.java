/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import presentation.FormNewPasswordAgent;

/**
 *
 * @author Nicolas
 */
public class FormNewPasswordAgentController {
    
    
    public FormNewPasswordAgentController(){
        
    }
    
    public void tryToChangePassword(FormNewPasswordAgent form){
        String oldPassword = form.getjTextFieldOldPassword().getText();
        String newPassword1 = form.getjTextFieldNewPassword().getText();
        String newPassword2 = form.getjTextFieldConfirmNewPassword().getText();
        
        
        
    }
}
