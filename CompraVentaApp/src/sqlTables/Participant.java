/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlTables;

/**
 *
 * @author Nicolas
 */
public class Participant {
    private String _username;
    private String _password;
    private String _name;
    private int _id;
    private String _adress;
    private String _email;
    private boolean _isDisabled;
    
    public Participant(String pUsername, String pPassword, String pName, int pId,
                       String pAdress, String pEmail, boolean pIsDisabled){
        this._username = pUsername;
        this._password = pPassword;
        this._name = pName;
        this._id = pId;
        this._adress = pAdress;
        this._email = pEmail;
        this._isDisabled = pIsDisabled;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getAdress() {
        return _adress;
    }

    public void setAdress(String _adress) {
        this._adress = _adress;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public boolean isIsDisabled() {
        return _isDisabled;
    }

    public void setIsDisabled(boolean _isDisabled) {
        this._isDisabled = _isDisabled;
    }
    public String toString(){
        String information = "Username:  "+_username+" ";
        information += "Name: "+_name+" ";
        information += "Person Id: "+_id+" ";
        return information;
    }
    
    
}
