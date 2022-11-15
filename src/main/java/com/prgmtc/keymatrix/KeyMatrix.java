package com.prgmtc.keymatrix;

import com.prgmtc.keymatrix.vista.*;
import com.prgmtc.keymatrix.modelo.BaseDat;



/**
 *
 * @author Elvis
 */
public class KeyMatrix {

    public static void main(String[] args) {
        frmPersona pe = new frmPersona();
        pe.setVisible(true);
        BaseDat objC = new BaseDat();
        objC.establecerConexion();

    }

}
