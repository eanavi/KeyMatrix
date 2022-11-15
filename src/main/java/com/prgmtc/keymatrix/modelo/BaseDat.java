
package com.prgmtc.keymatrix.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */
public class BaseDat {
    Connection cnx = null;
    
    String usuario = "usrbdkeym";
    String clave = "salesia3010";
    
    String cadenaConex = "jdbc:postgresql://localhost:5432/bdkeymatrix";
    
    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            cnx = DriverManager.getConnection(cadenaConex, usuario, clave);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al realizar la conexion" + e.toString());
        }
        
        return cnx; 
    }
}
