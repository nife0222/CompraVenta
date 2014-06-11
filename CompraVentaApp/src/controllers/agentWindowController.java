/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import logic.SQLOperator;
import presentation.FormNewPasswordAgent;
import sqlTables.ExternalUser;

/**
 *
 * @author Nicolas
 */
public class agentWindowController {
    
    private SQLOperator _operator;
    //private ExternalUser _user;
            
    public agentWindowController(ExternalUser user){
        ///_user = user;
    }
    
    public void changePassword(){
        FormNewPasswordAgent forma = new FormNewPasswordAgent(null,true);
        forma.setVisible(true);
    }
    
    
}
