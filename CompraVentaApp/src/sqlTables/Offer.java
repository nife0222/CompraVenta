/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqlTables;
import java.sql.Date;

/**
 *
 * @author Luis Diego
 */
public class Offer {
    private boolean _OfferType;
    private int _OfferId;
    private int _AcceptableChange;
    private int _MoneyOnTransaction;
    private String _OfferOwner;
    private int _Transaction;
    private boolean _IsActive;
    private Date _TransactionDate;
    private int _SessionId;

    public Offer(boolean _OfferType, int _OfferId, int _AcceptableChange, int _MoneyOnTransaction, String _OfferOwner, int _Transaction, boolean _IsActive, Date _TransactionDate, int _SessionId) {
        this._OfferType = _OfferType;
        this._OfferId = _OfferId;
        this._AcceptableChange = _AcceptableChange;
        this._MoneyOnTransaction = _MoneyOnTransaction;
        this._OfferOwner = _OfferOwner;
        this._Transaction = _Transaction;
        this._IsActive = _IsActive;
        this._TransactionDate = _TransactionDate;
        this._SessionId = _SessionId;
    }
    

    public boolean isOfferType() {
        return _OfferType;
    }

    public void setOfferType(boolean _OfferType) {
        this._OfferType = _OfferType;
    }

    public int getOfferId() {
        return _OfferId;
    }

    public void setOfferId(int _OfferId) {
        this._OfferId = _OfferId;
    }

    public int getAcceptableChange() {
        return _AcceptableChange;
    }

    public void setAcceptableChange(int _AcceptableChange) {
        this._AcceptableChange = _AcceptableChange;
    }

    public int getMoneyOnTransaction() {
        return _MoneyOnTransaction;
    }

    public void setMoneyOnTransaction(int _MoneyOnTransaction) {
        this._MoneyOnTransaction = _MoneyOnTransaction;
    }

    public String getOfferOwner() {
        return _OfferOwner;
    }

    public void setOfferOwner(String _OfferOwner) {
        this._OfferOwner = _OfferOwner;
    }

    public int getTransaction() {
        return _Transaction;
    }

    public void setTransaction(int _Transaction) {
        this._Transaction = _Transaction;
    }

    public boolean isIsActive() {
        return _IsActive;
    }

    public void setIsActive(boolean _IsActive) {
        this._IsActive = _IsActive;
    }

    public Date getTransactionDate() {
        return _TransactionDate;
    }

    public void setTransactionDate(Date _TransactionDate) {
        this._TransactionDate = _TransactionDate;
    }

    public int getSessionId() {
        return _SessionId;
    }

    public void setSessionId(int _SessionId) {
        this._SessionId = _SessionId;
    }
    public String toString(){
        String information = "Offer Type: ";
        if(_OfferType ==false){
            information += "Buying Offer ";
        }
        else{
            information += "Sale ";
        }
        information += "Offer Id: ";
        information += _OfferId + " ";
        information += "Acceptable Change: ";
        information += _AcceptableChange+" ";
        information += "Money On Transaction: " + _MoneyOnTransaction + " ";
        information += "Offer Owner: "+_OfferOwner+ " ";
        
        if(_Transaction!=0){
            information += "Dealed transactions id: "+_Transaction+" ";
            information += "Dealed transactions date: "+_TransactionDate.toString()+" ";
        }
        information += "Is Active: ";
        if(_IsActive){
            information += "Yes ";
            
        }
        else{
            information+="No ";
            
        }
        information += "Session id "+_SessionId+" ";
        return information;
        
    }
    
    
    
}
