package com.prgmtc.keymatrix.modelo;

import java.util.Date;

public class Persona {
    private int idPersona;
    private String Nombres;
    private String Apellidos;
    private String Ci;
    private Date FechaNac;
    private char Estado;
    
    public Persona(){
        
    }

    public Persona(int idPersona, String Nombres, String Apellidos, 
            String Ci, Date FechaNac, char Estado) {
        this.idPersona = idPersona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Ci = Ci;
        this.FechaNac = FechaNac;
        this.Estado = Estado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
        this.Ci = Ci;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
}
