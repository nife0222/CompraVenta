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
public class NegotiationSession {
    private int _SessionId;
    private int _Comission;
    private Date _DateOpened;
    private boolean _IsActive;

    public NegotiationSession(int _SessionId, int _Comission, Date _DateOpened, boolean _IsActive) {
        this._SessionId = _SessionId;
        this._Comission = _Comission;
        this._DateOpened = _DateOpened;
        this._IsActive = _IsActive;
    }

    public int getSessionId() {
        return _SessionId;
    }

    public void setSessionId(int _SessionId) {
        this._SessionId = _SessionId;
    }

    public int getComission() {
        return _Comission;
    }

    public void setComission(int _Comission) {
        this._Comission = _Comission;
    }

    public Date getDateOpened() {
        return _DateOpened;
    }

    public void setDateOpened(Date _DateOpened) {
        this._DateOpened = _DateOpened;
    }

    public boolean isIsActive() {
        return _IsActive;
    }

    public void setIsActive(boolean _IsActive) {
        this._IsActive = _IsActive;
    }

    
}
