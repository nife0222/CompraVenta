/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlTables;

/**
 *
 * @author LuisDiego
 */
public class ExternalUsers {
    private String _UserName;
    private String _PassWord;
    private int _TypeOfUser;

    public ExternalUsers(String pUserName, String pPassWord, int pTypeOfUser) {
        this._UserName = pUserName;
        this._PassWord = pPassWord;
        this._TypeOfUser = pTypeOfUser;
    }

    public String getUserName() {
        return _UserName;
    }

    public void setUserName(String pUserName) {
        this._UserName = pUserName;
    }

    public String getPassWord() {
        return _PassWord;
    }

    public void setPassWord(String pPassWord) {
        this._PassWord = pPassWord;
    }

    public int getTypeOfUser() {
        return _TypeOfUser;
    }

    public void setTypeOfUsers(int pTypeOfUser) {
        this._TypeOfUser = pTypeOfUser;
    }
    
   
    
}
