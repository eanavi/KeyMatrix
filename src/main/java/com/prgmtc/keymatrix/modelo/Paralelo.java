/*
    Systema Keymatrix
    Clase de Aula operaciones basicas de creacion y asignacion
    y retorno de propiedades
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

public class Paralelo {
    private int idParalelo;
    private int idMateria;
    private String Nombre_paralelo;
    private char Estado;

    public Paralelo(){
        
    }
    
    public Paralelo(int idParalelo, int idMateria, String Nombre_paralelo, 
            char Estado) {
        this.idParalelo = idParalelo;
        this.idMateria = idMateria;
        this.Nombre_paralelo = Nombre_paralelo;
        this.Estado = Estado;
    }
    
    public int getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(int idParalelo) {
        this.idParalelo = idParalelo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre_paralelo() {
        return Nombre_paralelo;
    }

    public void setNombre_paralelo(String Nombre_paralelo) {
        this.Nombre_paralelo = Nombre_paralelo;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
}
