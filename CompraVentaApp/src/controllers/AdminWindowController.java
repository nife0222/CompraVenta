/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logic.SQLOperator;
import presentation.AdminMainWindow;
import presentation.ShowListForm;
import sqlTables.ExternalUser;

/**
 *
 * @author Luis Diego
 */
public class AdminWindowController {
    private ExternalUser _Admin;
    private SQLOperator _Operator;
    
    public AdminWindowController(ExternalUser pAdmin){
        _Admin = pAdmin;
        _Operator = new SQLOperator();
    }

    public void changePassword() {
        
        String pWindowTitle = "Change Password";
        String pOrder = "Write your oldPassword";
        String password = askForInput(pWindowTitle,pOrder);
        if(!"".equals(password)){
            ExternalUser admin = _Operator.login(_Admin.getUserName(), password, 0);
            if(admin!=null ){
                String newPassword = askForInput(pWindowTitle, "Write your new password");
                if(!"".equals(newPassword)){
                    String confirmPass = askForInput(pWindowTitle,"Write again your new password");
                    if(newPassword.equals(confirmPass)){
                        _Operator.tryToChangePassword(_Admin.getUserName(),newPassword,0);
                        return;
                    }
                    
                
                }

            }
        }
        JOptionPane.showMessageDialog(null, "Wrong password, try again");
      
    }
    
    
    
    
    
    
    public String askForInput(String pWindowTitle,String pOrder){
        try{
            String input = (String)JOptionPane.showInputDialog(
            null,
            pOrder,
            pWindowTitle,
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            "");
            return input;
        }catch(Exception e){
            return "";
        }
    }

    public void suspendUser() {
        String suspendedUserId = askForInput("Suspend User","Write the Username ");
        if(!suspendedUserId.equals("")){
            if(!_Operator.changeStateOfParticipant(suspendedUserId)){
                JOptionPane.showMessageDialog(null, "An error ocurred when trying to process data, try again");
            }
        }
    }

    public void listUsers(JFrame pParent) {
        ShowListForm list = new ShowListForm(pParent,true,_Operator.getAllParticipants());
        list.setVisible(true);
    }

    public void listBoard(JFrame pFrame) {
        Object [] orderBy = {"Consecutive number","By amount of money","By acceptable change","Only sales","Only buying offers"};
        String selectedOrder = getInputByList(orderBy,"List Offers","Select the order");
        int order = 0;
        for (int indexOrder =0;indexOrder<orderBy.length;indexOrder++){
            if(orderBy[indexOrder]==selectedOrder){
                order = indexOrder;
                break;
            }
        }
        ShowListForm list = new ShowListForm(pFrame,true,_Operator.listBoard(order));
        list.setVisible(true);
       
    }
    public String getInputByList(Object []pPosibilities,String pWindowTitle,String pOrder){
        try{
            String s = (String)JOptionPane.showInputDialog(
                                null,
                                pOrder,
                                pWindowTitle,
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                pPosibilities,
                                0);
            return s;
        }catch(Exception e){
            return "";
        }

        
    }
    
}
