/*
    Systema Keymatrix
    Clase de empleado hereda de persona
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Empleado{
    private int idempleado;
    private int idpersona;
    private int codigo_marcacion;
    private String cargo;
    private char estado;
    
    
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Empleado() {
    }

    public Empleado(int idpersona, int codigo_marcacion, 
            String cargo, char estado) {
        this.idpersona = idpersona;
        this.codigo_marcacion = codigo_marcacion;
        this.cargo = cargo;
        this.estado = estado;
    }
    
    
    public void Insertar(){
        String consulta = "INSERT INTO EMPLEADO(idpersona, codigo_marcacion, cargo, estado)"
                + " values (" + this.idpersona + "," + this.codigo_marcacion  + ",'" + 
                this.cargo + "', 'V')";
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

    
    
    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getCodigo_marcacion() {
        return codigo_marcacion;
    }

    public void setCodigo_marcacion(int codigo_marcacion) {
        this.codigo_marcacion = codigo_marcacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    

    
}
