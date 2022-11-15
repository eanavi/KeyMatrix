
package com.prgmtc.keymatrix.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        List<Persona>datos=new ArrayList<>();  
        String consulta = "select * from persona where upcase(estado) = 'V';";
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                Persona per = new Persona();
                per.setIdPersona(rs.getInt(1));
                per.setNombres(rs.getString(2));
                per.setApellidos(rs.getString(3));
                per.setCi(rs.getString(4));
                per.setFechaNac(rs.getDate(5));
                per.setEstado(rs.getString(6).charAt(1));
                datos.add(per);
            }
        } catch(Exception e){
            System.err.println(e);
        }
        return datos;
    }
}
