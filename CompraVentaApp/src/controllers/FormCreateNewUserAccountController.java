/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import logic.SQLOperator;
import presentation.FormCreateNewUserAccount;

/**
 *
 * @author Nicolas
 */
public class FormCreateNewUserAccountController {
    private SQLOperator _operator;
    
    public FormCreateNewUserAccountController(){
        _operator = new SQLOperator();
    }
    
    public void tryToSignUp(FormCreateNewUserAccount form){
        String username = form.getjTextFieldUsername().getText();
        String password = form.getjTextFieldPassword().getText();
        String name = form.getjTextFieldName().getText();
        String idNumber = form.getjTextFieldIdNumber().getText();
        String adress = form.getjTextFieldAdress().getText();
        String email = form.getjTextFieldEmail().getText();
        
        
        
        _operator.tryToSignUp();
    }
    
}
