/*
    Systema Keymatrix
    Clase de docente hereda de persona
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Docente {
    private int iddocente;
    private int idpersona;
    private String contrato;
    private char estado;
    
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Docente() {
    }
    
    
    public Docente(int idpersona, String contrato, char estado) {
        this.idpersona = idpersona;
        this.contrato = contrato;
        this.estado = estado;
    }
    
    /*
    Insercion de un registro en la base de datos con la informacion del docente
    */
    
    public void Actualizar(){
        String consulta = "update docente set contrato = '" + this.contrato + "' where iddocente = " + this.iddocente;
        
        try{
            con = bd.establecerConexion();

            ps = con.prepareStatement(consulta);
            ps.execute();
            
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
    }
    
    public void Insertar(){
        String consulta = "INSERT INTO DOCENTE(idpersona, contrato, estado)"
                + " values (" + this.idpersona + ",'" + this.contrato + "','" + this.estado + "')";
        try{
            con = bd.establecerConexion();

            ps = con.prepareStatement(consulta);
            ps.execute();
            
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
    }
    
    /*
    Recuperacion de datos de un docente 
    */
    public void Cargar(int idpersona){
        String  consulta = "select iddocente, idpersona, contrato, estado "
                + "from docente where estado = 'V' and idpersona = " + idpersona + ";";
        
        try{
            con = bd.establecerConexion();

            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                this.iddocente = rs.getInt("iddocente");
                this.idpersona = rs.getInt("idpersona");
                this.contrato = rs.getString("contrato");
                this.estado = rs.getString("estado").charAt(0);
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
    }
    
    
    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
