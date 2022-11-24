/*
    Systema Keymatrix
    Clase Estudiante paralelo operaciones basicas de creacion y asignacion
    y retorno de propiedades

    Es esta clase se registran la inscripcion de estudiantes a un paralelo
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.util.Date;

public class Estudiante_paralelo {
    
    private int IdEstudiante_paralelo;
    private int idParalelo;
    private int idEstudiante;
    private Date fecha_incripcion;
    private String encargado;
    private char Estado;

    public Estudiante_paralelo(){
        
    }
    
    public Estudiante_paralelo(int IdEstudiante_paralelo, int idParalelo, int idEstudiante, Date fecha_incripcion, String encargado, char Estado) {
        this.IdEstudiante_paralelo = IdEstudiante_paralelo;
        this.idParalelo = idParalelo;
        this.idEstudiante = idEstudiante;
        this.fecha_incripcion = fecha_incripcion;
        this.encargado = encargado;
        this.Estado = Estado;
    }
    
    

    public int getIdEstudiante_paralelo() {
        return IdEstudiante_paralelo;
    }

    public void setIdEstudiante_paralelo(int IdEstudiante_paralelo) {
        this.IdEstudiante_paralelo = IdEstudiante_paralelo;
    }

    public int getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(int idParalelo) {
        this.idParalelo = idParalelo;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Date getFecha_incripcion() {
        return fecha_incripcion;
    }

    public void setFecha_incripcion(Date fecha_incripcion) {
        this.fecha_incripcion = fecha_incripcion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
    
    
    
}
