/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import logic.SQLOperator;
import presentation.formNewPasswordAgent;

/**
 *
 * @author Nicolas
 */
public class agentWindowController {
    
    private SQLOperator _operator;
    
    public void changePassword(){
        formNewPasswordAgent forma = new formNewPasswordAgent(null,true);
        forma.setVisible(true);
    }
    
    
}
