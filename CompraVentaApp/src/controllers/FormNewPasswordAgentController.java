/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import javax.swing.JOptionPane;
import logic.SQLOperator;
import presentation.FormNewPasswordAgent;
import sqlTables.ExternalUser;

/**
 *
 * @author Nicolas
 */
public class FormNewPasswordAgentController {
    private ExternalUser _user;
    private SQLOperator _operator;
    
    
    public FormNewPasswordAgentController(ExternalUser pUser){
        _user = pUser;
        _operator = new SQLOperator();
    }
    
    public void tryToChangePassword(FormNewPasswordAgent form){
        String oldPassword = form.getjTextFieldOldPassword().getText();
        String newPassword1 = form.getjTextFieldNewPassword().getText();
        String newPassword2 = form.getjTextFieldConfirmNewPassword().getText();
        
        System.out.println(_user.getUserName());
        System.out.println(_user.getPassWord());
        if(newPassword1.equals(newPassword2) && oldPassword.equals(_user.getPassWord())){
            boolean successfulChange;
            successfulChange = _operator.tryToChangePassword(_user.getUserName(), newPassword1, 1);
            if (successfulChange){
                _user.setPassWord(newPassword1);
                JOptionPane.showMessageDialog(form, "Password change was successful");
            }else{
                JOptionPane.showMessageDialog(form, "unsuccessful password change");
            }
        }else{
            JOptionPane.showMessageDialog(form, "New passwords dont match, try again or the old password is incorrect");
        }
        
    }
}
