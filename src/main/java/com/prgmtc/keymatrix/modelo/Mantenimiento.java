/*
    Systema Keymatrix
    Clase Mantenimiento operaciones basicas de creacion y asignacion
    y retorno de propiedades

    Es esta clase se registran el mantenimiento de aulas
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.sql.Time;
import java.util.Date;


public class Mantenimiento {
    
    private int idMantenimiento;
    private int idAula;
    private int idEmpleado;
    private Date Fecha_mantenimiento;
    private Time Hora_mantenimiento;
    private char Estado;

   public Mantenimiento(){
       
   }
    
    public Mantenimiento(int idMantenimiento, int idAula, int idEmpleado, 
            Date Fecha_mantenimiento, Time Hora_mantenimiento, char Estado) {
        this.idMantenimiento = idMantenimiento;
        this.idAula = idAula;
        this.idEmpleado = idEmpleado;
        this.Fecha_mantenimiento = Fecha_mantenimiento;
        this.Hora_mantenimiento = Hora_mantenimiento;
        this.Estado = Estado;
    }

    
    
    
    public int getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(int idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFecha_mantenimiento() {
        return Fecha_mantenimiento;
    }

    public void setFecha_mantenimiento(Date Fecha_mantenimiento) {
        this.Fecha_mantenimiento = Fecha_mantenimiento;
    }

    public Time getHora_mantenimiento() {
        return Hora_mantenimiento;
    }

    public void setHora_mantenimiento(Time Hora_mantenimiento) {
        this.Hora_mantenimiento = Hora_mantenimiento;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
    
    
    
    
}
