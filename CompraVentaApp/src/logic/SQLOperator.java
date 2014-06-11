/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import daoClases.ExternalUsersDAO;
import sqlTables.ExternalUser;

/**
 *
 * @author Nicolas
 */
public class SQLOperator {

    public ExternalUser loginAsAdministrator(String pUserName, String pPassword) {
        ExternalUsersDAO externalUserDAO = new ExternalUsersDAO();
        return externalUserDAO.login(pUserName,pPassword,0);
    }
    
    public ExternalUser loginAsAgent(String pUserName, String pPassword){
        ExternalUsersDAO externalUserDAO = new ExternalUsersDAO();
        return externalUserDAO.login(pUserName,pPassword,1);
    }
    
}
