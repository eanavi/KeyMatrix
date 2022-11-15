package com.prgmtc.keymatrix.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.prgmtc.keymatrix.modelo.Persona;
import com.prgmtc.keymatrix.modelo.PersonaDAO;

/**
 *
 * @author Elvis
 */
public class Controlador implements ActionListener {
    PersonaDAO pd = new PersonaDAO();
    Persona p = new Persona();
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
}
