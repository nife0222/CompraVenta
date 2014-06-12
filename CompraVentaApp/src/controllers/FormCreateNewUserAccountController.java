/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import javax.swing.JOptionPane;
import logic.SQLOperator;
import presentation.FormCreateNewUserAccount;
import sqlTables.Account;
import sqlTables.Participant;

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
        try{
            String username = form.getjTextFieldUsername().getText();
            String password = form.getjTextFieldPassword().getText();
            String name = form.getjTextFieldName().getText();
            int idNumber = Integer.parseInt("12345");//(form.getjTextFieldIdNumber().getText());
            String adress = form.getjTextFieldAdress().getText();
            String email = form.getjTextFieldEmail().getText();
            Participant participant = new Participant(username,password,name,idNumber,adress,email,false);
            
            if(_operator.tryToSignUp(participant)){
                JOptionPane.showMessageDialog(form, "Congratulations, the new user was successfully created");
                //Si se creo la nueva cuenta, entonces ahora hay que crear los accounts del usuario
                Account ColonesAccount = new Account(true,0,0,participant.getUsername());
                Account DolarsAccount = new Account(false,0,0,participant.getUsername());
                _operator.createAccountsForParticipant(ColonesAccount);
                _operator.createAccountsForParticipant(DolarsAccount);
                form.dispose();
            }else{
                JOptionPane.showMessageDialog(form, "ERROR, username already in use");
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(form, "There is a mistake in the data, please make sure data is correct");
        }
    }
    
}
