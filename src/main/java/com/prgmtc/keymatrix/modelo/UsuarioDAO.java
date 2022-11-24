/**
 * Clase que implementa la interaccion con la base de datos
 * para la clase usuario
 * 
 * Realizado por    Elvis Anavi
 * Fecha            22/11/2022
 * 
 */

package com.prgmtc.keymatrix.modelo;
import com.prgmtc.keymatrix.modelo.BaseDat;
import com.prgmtc.keymatrix.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean valida(String usuario, String clave){
        boolean sw = false;
        Usuario us = new Usuario();
        us.setClaveEnc(clave);
        us.setNombre_usuario(usuario);
        
        String consulta = "select nombre_usuario, clave from usuario"
                + " where nombre_usuario = '" + usuario + "' and clave = '"
                + us.getClave() + "' and estado = 'V'";
        
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            sw = rs.next();
           
        }catch(SQLException sqle){
            System.out.println("SQLState: "  + sqle.getSQLState());
            System.out.println("SQLErrorCode: "  + sqle.getErrorCode());
        } finally{
            if(con != null ){
                try{
                    ps.close();
                    con.close();
                } catch(SQLException e){
                    System.out.println("Error " + e.getMessage());
                }
            }
        }
        return sw;
    }
}
