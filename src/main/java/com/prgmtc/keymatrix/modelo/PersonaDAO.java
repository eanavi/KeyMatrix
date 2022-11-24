
package com.prgmtc.keymatrix.modelo;
/*
Capa de Datos, programa que interactua con la base de datos
para la clase de Persona


Systema Keymattiz
Autor:  Elvis Anavi
Fecha   18/11/2022

*/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class PersonaDAO {
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Persona cargar(int idPersona){
        Persona per = new Persona();
        
        String consulta = "select idpersona, nombres, apellidos, ci, "
                + "fechanac, tipo, estado "
                + "from persona = " + String.valueOf(idPersona);
        
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                per.setIdPersona(rs.getInt("idpersona"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setCi(rs.getString("ci"));
                per.setFechaNac(rs.getDate("fechanac"));
                per.setEstado(rs.getString("estado").charAt(0));
                per.setTipo(rs.getString("tipo").charAt(0));
            }
            
        } catch(SQLException sqle){
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
        
        return per;
    }
    
    public int Insertar(Persona per){
        int resultado = 0;
        String patron = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(patron);
        
        String consulta = "INSERT INTO persona(nombres, apellidos, "
                + "ci, fechanac, tipo, estado) VALUES ('" + per.getNombres() +"', '"
                +  per.getApellidos() + "', '" + per.getCi() + "', '" + sdf.format(per.getFechaNac()) + "'"
                +  ",'" + per.getTipo() + "','" + per.getEstado() + "') returning idpersona;";
        
        try{
            con = bd.establecerConexion();

            ps = con.prepareStatement(consulta);
            ps.execute();
            ResultSet ultima = ps.getResultSet();
            ultima.next();
            
            resultado = ultima.getInt(1);
            
        } catch(SQLException sqle){
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
        return resultado;
    }
    
    public boolean modificar(Persona per){
        boolean sw = false;
        int resultado;
        String patron = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(patron);
        String consulta = "update persona set nombres='" + per.getNombres()+"', "
                + "apellidos='" + per.getApellidos() + "', ci='"+per.getCi() + "', "
                + "fechanac='" + sdf.format(per.getFechaNac()) + "', " + "tipo="
                + per.getTipo() + "', " + "estado='" + per.getEstado() 
                + "' where idpersona=" + per.getIdPersona();
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            resultado = ps.executeUpdate(consulta);
            
            if(resultado > 0) 
                sw = true;
            else 
                sw = false;
            
        } catch(SQLException sqle){
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
    
    
 
    public List listar(String ci, String nombre){     
        List<Persona> datos = new ArrayList<>();
        String condicion = " where upper(estado) = 'V'";
        if(ci != null && !ci.isEmpty() && !ci.trim().isEmpty()){
            condicion = condicion + " and ci like '%" + ci + "%'";
        }
        
        if (nombre != null && !nombre.isEmpty() && !nombre.trim().isEmpty()){
            condicion = condicion + " and upper(nombres || apellidos) like upper('%" + nombre + "%')";
        }
        
        String consulta = "select idpersona, nombres, apellidos, ci, fechanac, tipo, "
                + "estado from persona" + condicion + "order by apellidos";
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while(rs.next()){
                Persona per = new Persona();
                per.setIdPersona(rs.getInt("idpersona"));
                per.setNombres(rs.getString("nombres"));
                per.setApellidos(rs.getString("apellidos"));
                per.setCi(rs.getString("ci"));
                per.setFechaNac(rs.getDate("fechanac"));
                per.setTipo(rs.getString("tipo").charAt(0));
                per.setEstado(rs.getString("estado").charAt(0));
                datos.add(per);
            }
        } catch(SQLException sqle){
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
        return datos;   
    }
}