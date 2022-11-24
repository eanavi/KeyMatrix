/*
    Systema Keymatrix
    Clase Estudiante paralelo operaciones basicas de creacion y asignacion
    y retorno de propiedades

    Es esta clase se registran las clases que dicta un docente
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;


public class Docente_materia {
    
    private int idDocente_materia;
    private int idDocente;
    private int idMateria;
    private char Estado;
    
    public Docente_materia(){
        
    }

    public Docente_materia(int idDocente_materia, int idDocente, 
            int idMateria, char Estado) {
        this.idDocente_materia = idDocente_materia;
        this.idDocente = idDocente;
        this.idMateria = idMateria;
        this.Estado = Estado;
    }
    
    
    public int getIdDocente_materia() {
        return idDocente_materia;
    }

    public void setIdDocente_materia(int idDocente_materia) {
        this.idDocente_materia = idDocente_materia;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
}
