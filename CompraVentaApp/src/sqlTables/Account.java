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
public class Account {
    private boolean _typeOfCoin;
    private int _suspendedMoney;
    private int _credit;
    private String _accountOwner;

    public Account(boolean pTypeOfCoin, int pSuspendedMoney, int pCredit, String pAccountOwner) {
        this._typeOfCoin = pTypeOfCoin;
        this._suspendedMoney = pSuspendedMoney;
        this._credit = pCredit;
        this._accountOwner = pAccountOwner;
    }

    public boolean isTypeOfCoin() {
        return _typeOfCoin;
    }

    public void setTypeOfCoin(boolean _typeOfCoin) {
        this._typeOfCoin = _typeOfCoin;
    }

    public int getSuspendedMoney() {
        return _suspendedMoney;
    }

    public void setSuspendedMoney(int _suspendedMoney) {
        this._suspendedMoney = _suspendedMoney;
    }

    public int getCredit() {
        return _credit;
    }

    public void setCredit(int _credit) {
        this._credit = _credit;
    }

    public String getAccountOwner() {
        return _accountOwner;
    }

    public void setAccountOwner(String _accountOwner) {
        this._accountOwner = _accountOwner;
    }
    
    
}
