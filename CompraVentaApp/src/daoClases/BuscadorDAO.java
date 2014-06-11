/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daoClasses;

import java.util.ArrayList;
import javax.sql.RowSet;

/**
 *
 * @author Luis Diego
 */
public interface BuscadorDAO {
     public int insertarFila(Object objetoAInsertar);
    
    // Remove a person
    public boolean eliminarFila(Object pObjeto);
    
    // Find an specific person
    public Object buscarObjeto (int pRowId);
    
    // Update a person
    public boolean actualizarFila(Object pObjeto);
    
    // Select a info row from specific person 
    public RowSet obtenerInformacionDeFila(int pId);
    
    // Select all info from table without criteria (select * from all)
    public ArrayList seleccionarTodasLasFilas();
}
