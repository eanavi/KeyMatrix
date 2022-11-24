/*
    Systema Keymatrix
    Clase de estudiante hereda de persona
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Estudiante {
    private int idestudiante;
    private int idpersona;
    private int ru;
    private Date fecha_ingreso;
    private char tipo_estudiante;
    private char estado;
    
    
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    

    public Estudiante() {
    }
    

    public Estudiante(int idpersona, int ru, 
            Date fecha_ingreso, char tipo_estudiante, char estado) {
        this.idpersona = idpersona;
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.tipo_estudiante = tipo_estudiante;
        this.estado = estado;
    }
    
    public void Insertar(){
        String consulta = "INSERT INTO ESTUDIANTE(idpersona, ru, , fecha_ingreso, tipo, estado)"
                + " values (" + this.idpersona + "," + this.ru  + "','" + this.fecha_ingreso + "', '"
                + this.tipo_estudiante + "', 'V')";
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

    
    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public char getTipo_estudiante() {
        return tipo_estudiante;
    }

    public void setTipo_estudiante(char tipo_estudiante) {
        this.tipo_estudiante = tipo_estudiante;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
    

    
    
}
