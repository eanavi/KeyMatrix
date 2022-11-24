/*
    Systema Keymatrix
    Clase de usuario operaciones basicas de creacion y asignacion
    y retorno de propiedades

    Existe un metodo de cifrado en base al algoritmo MD5 para 
    la escritura de la clave
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Usuario {
    
    private int idUsuario;
    private int idPersona;
    private String Nombre_usuario;
    private String Clave;
    private String Email;
    private char Estado;
    
    public Usuario(){
        
    }
    
    public Usuario(int idPersona, String Nombre_usuario, 
            String Clave, String Email, char Estado) {
        this.idPersona = idPersona;
        this.Nombre_usuario = Nombre_usuario;
        this.Clave = Clave;
        this.Email = Email;
        this.Estado = Estado;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    public void setClaveEnc(String Clave){
        char[] CONST_HEX = {'0', '1', '2', '3', '4', '5',
        '6','7','8','9','a','b','c','d','e','f'};
        try{
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(Clave.getBytes());
            StringBuilder strb = new StringBuilder(2*bytes.length);
            for(int i=0;i<bytes.length;i++){
                int bajo = (int)(bytes[i]&0x0f);
                int alto = (int)((bytes[i]&0xf0)>>4);
                strb.append(CONST_HEX[alto]);
                strb.append(CONST_HEX[bajo]);
            }
            this.Clave = strb.toString();
        } catch(NoSuchAlgorithmException e){
            this.Clave = null;
        }
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
    
    public boolean usuario_valido(String usuario, String clave){
        boolean sw = false;
        this.setClaveEnc(clave);
        String consulta = "select nombre_usuario, clave "
                + "from usuario where nombre_usuario = " + usuario + " and "
                + "clave = " + this.Clave + "and estado = 'V'";
        
        
        
        
        
        return sw;
    }
    
   
    
}
