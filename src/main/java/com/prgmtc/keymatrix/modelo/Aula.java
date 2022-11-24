/*
    Systema Keymatrix
    Clase de Aula operaciones basicas de creacion y asignacion
    y retorno de propiedades
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

public class Aula {
    
    private int idAula;
    private String Nombre_aula;
    private String Bloque;
    private String Piso;
    private int Capacidad;
    private char Estado;

    public Aula(int idAula, String Nombre_aula, String Bloque, String Piso, 
            int Capacidad, char Estado) {
        this.idAula = idAula;
        this.Nombre_aula = Nombre_aula;
        this.Bloque = Bloque;
        this.Piso = Piso;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }

    
    
    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getNombre_aula() {
        return Nombre_aula;
    }

    public void setNombre_aula(String Nombre_aula) {
        this.Nombre_aula = Nombre_aula;
    }

    public String getBloque() {
        return Bloque;
    }

    public void setBloque(String Bloque) {
        this.Bloque = Bloque;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
}
