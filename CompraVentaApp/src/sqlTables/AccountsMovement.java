/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlTables;

import java.sql.Date;

/**
 *
 * @author Nicolas
 */
public class AccountsMovement {
    private int _movementCode;
    private int _movementId;
    private int _moneyInvolved;
    private Date _movementDate;
    private String _accountOwner;
    private boolean _typeOfCoin;

    public AccountsMovement(int pMovementCode, int pMovementId, int pMoneyInvolved, Date pMovementDate, String pAccountOwner, boolean pTypeOfCoin) {
        this._movementCode = pMovementCode;
        this._movementId = pMovementId;
        this._moneyInvolved = pMoneyInvolved;
        this._movementDate = pMovementDate;
        this._accountOwner = pAccountOwner;
        this._typeOfCoin = pTypeOfCoin;
    }

    public int getMovementCode() {
        return _movementCode;
    }

    public void setMovementCode(int pMovementCode) {
        this._movementCode = _movementCode;
    }

    public int getMovementId() {
        return _movementId;
    }

    public void setMovementId(int pMovementId) {
        this._movementId = _movementId;
    }

    public int getMoneyInvolved() {
        return _moneyInvolved;
    }

    public void setMoneyInvolved(int pMoneyInvolved) {
        this._moneyInvolved = _moneyInvolved;
    }

    public Date getMovementDate() {
        return _movementDate;
    }

    public void setMovementDate(Date pMovementDate) {
        this._movementDate = _movementDate;
    }

    public String getAccountOwner() {
        return _accountOwner;
    }

    public void setAccountOwner(String pAccountOwner) {
        this._accountOwner = _accountOwner;
    }

    public boolean isTypeOfCoin() {
        return _typeOfCoin;
    }

    public void setTypeOfCoin(boolean pTypeOfCoin) {
        this._typeOfCoin = _typeOfCoin;
    }
    
    
    
}
