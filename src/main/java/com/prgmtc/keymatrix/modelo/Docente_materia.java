/*
    Systema Keymatrix
    Clase Estudiante paralelo operaciones basicas de creacion y asignacion
    y retorno de propiedades

    Es esta clase se registran las clases que dicta un docente
    
    @autor Elvis Anavi
    @fecha 20/11/2022
 */
package com.prgmtc.keymatrix.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Docente_materia {
    
    
    BaseDat bd = new BaseDat();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    private int idDocente_materia;
    private int idDocente;
    private int idMateria;
    private String semestre;
    private String sigla;
    private String nombre_materia;
    private int idAula;
    private char estado;
    
    public Docente_materia(){
        
    }
    
    public List<Docente_materia> Materias_docente(int idDocente){
        List<Docente_materia> ldm = new ArrayList<>();
        
        String consulta = "select dm.iddocente_materia, d.iddocente, m.semestre, m.sigla, m.nombre_materia, dm.idaula, dm.estado " +
        " from docente_materia as dm " +
        "inner join docente as d on dm.iddocente = d.iddocente " +
        "inner join persona as p on d.idpersona = p.idpersona and p.tipo = 'D'" +
        "inner join materia as m on dm.idmateria = m.idmateria " +
        " where dm.estado = 'V' and d.iddocente = " + Integer.toString(idDocente) + " order by m.semestre, m.sigla";
        
        try{
            con = bd.establecerConexion();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Docente_materia dm = new Docente_materia();
                dm.setIdDocente_materia(rs.getInt("iddocente_materia"));
                dm.setIdDocente(rs.getInt("iddocente"));
                dm.setSemestre(rs.getString("semestre"));
                dm.setSigla(rs.getString("sigla"));
                dm.setNombre_materia(rs.getString("nombre_materia"));
                dm.setIdAula(rs.getInt("idaula"));
                dm.setEstado(rs.getString("estado").charAt(0));
                
                ldm.add(dm);
            }
            
            
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
        
        return ldm;
    }
        

    public Docente_materia(int idDocente_materia, int idDocente, int idMateria, 
            String semestre, String sigla, String nombre_materia, int idaula, char Estado) {
        this.idDocente_materia = idDocente_materia;
        this.idDocente = idDocente;
        this.idMateria = idMateria;
        this.semestre = semestre;
        this.sigla = sigla;
        this.nombre_materia = nombre_materia;
        this.idAula = idaula;
        this.estado = Estado;
        
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public char getEstado() {
        return estado;
    }

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }
    
    

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
    

}
