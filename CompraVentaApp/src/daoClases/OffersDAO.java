/** To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daoClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import sqlAccess.SQLConnector;
import sqlTables.Offer;

/**
 *
 * @author Luis Diego
 */
public class OffersDAO {
    
    public ArrayList getBoard(int orderBy){
        ArrayList <Offer> offers = new ArrayList();
        Connection conexion = SQLConnector.createConnection();
        try {
            CallableStatement listBoardProcedure = conexion.prepareCall("{ call dbo.listBoard(?)}");
            ResultSet results = listBoardProcedure.executeQuery();
            while (results.next()){
                Offer offer = new Offer(results.getBoolean("offerType"), results.getInt("offerId"), results.getInt("acceptableChange"), 
                                        results.getInt("moneyOnTransaction"), results.getString("offerOwner"), results.getInt("transaction"),
                                        results.getBoolean("isActive"), results.getDate("transactionDate"), results.getInt("sessionId"));
                offers.add(offer);
            }
        }catch(Exception e){
            offers = null;
        }
            
        return offers;
      
    }
               
    
}

