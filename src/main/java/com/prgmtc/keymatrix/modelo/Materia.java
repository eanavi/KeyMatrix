/*
    Systema Keymatrix
    Clase de Materia operaciones basicas de creacion y asignacion
    y retorno de propiedades
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

public class Materia {
    
    private int idMateria;
    private int idParalelo;
    private String Semestre;
    private String Sigla;
    private String Nombre_materia;
    private String Area;
    private String Prerrequisito;
    private char Estado;

    public Materia(int idMateria, int idParalelo, String Semestre, 
            String Sigla, String Nombre_materia, String Area, 
            String Prerrequisito, char Estado) {
        this.idMateria = idMateria;
        this.idParalelo = idParalelo;
        this.Semestre = Semestre;
        this.Sigla = Sigla;
        this.Nombre_materia = Nombre_materia;
        this.Area = Area;
        this.Prerrequisito = Prerrequisito;
        this.Estado = Estado;
    }
    
    

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdParalelo() {
        return idParalelo;
    }

    public void setIdParalelo(int idParalelo) {
        this.idParalelo = idParalelo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public String getNombre_materia() {
        return Nombre_materia;
    }

    public void setNombre_materia(String Nombre_materia) {
        this.Nombre_materia = Nombre_materia;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getPrerrequisito() {
        return Prerrequisito;
    }

    public void setPrerrequisito(String Prerrequisito) {
        this.Prerrequisito = Prerrequisito;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
    
    
    
}
