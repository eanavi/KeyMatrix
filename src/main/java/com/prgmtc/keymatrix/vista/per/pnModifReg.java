
package com.prgmtc.keymatrix.vista.per;

import com.prgmtc.keymatrix.modelo.Docente;
import com.prgmtc.keymatrix.modelo.Empleado;
import com.prgmtc.keymatrix.modelo.Estudiante;
import com.prgmtc.keymatrix.modelo.PersonaDAO;
import com.prgmtc.keymatrix.modelo.Persona;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class pnModifReg extends javax.swing.JPanel {
    private int idPer;

    public pnModifReg(int idPersona) {
        this.idPer = idPersona;
        initComponents();
        
        Persona per = new Persona();
        PersonaDAO perD = new PersonaDAO();
        
        per = perD.cargar(idPer);
        
        this.txtApellidos1.setText(per.getApellidos());
        this.txtNombres.setText(per.getNombres());
        this.txtCi.setText(per.getCi());
        this.txtFecha_nacimiento.setDate(per.getFechaNac());
        switch(per.getTipo()){
            case 'A'://Empleado
                    this.cmbTipoPer.setSelectedIndex(2);
                break;
            case 'E'://Estudiante
                    this.cmbTipoPer.setSelectedIndex(1);
    
                break;
            case 'D'://Docente
                    this.cmbTipoPer.setSelectedIndex(0);
                break;
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblApellidos = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos1 = new javax.swing.JLabel();
        lblApellidos2 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos1 = new javax.swing.JTextField();
        txtFecha_nacimiento = new com.toedter.calendar.JDateChooser();
        cmbTipoPer = new javax.swing.JComboBox<>();
        pnTipo = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(800, 540));
        setPreferredSize(new java.awt.Dimension(800, 540));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        lblApellidos.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidos.setText("Fecha de Nacimiento");
        lblApellidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblApellidos);
        lblApellidos.setBounds(110, 230, 240, 22);

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Modificar Registro");
        lblTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTitulo1);
        lblTitulo1.setBounds(280, 20, 240, 29);

        lblNombres.setBackground(new java.awt.Color(255, 255, 255));
        lblNombres.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombres.setText("Nombres:");
        lblNombres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblNombres);
        lblNombres.setBounds(110, 80, 240, 22);

        lblApellidos1.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidos1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblApellidos1.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidos1.setText("Apellidos:");
        lblApellidos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblApellidos1);
        lblApellidos1.setBounds(110, 130, 240, 22);

        lblApellidos2.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidos2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lblApellidos2.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidos2.setText("C.I.:");
        lblApellidos2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblApellidos2);
        lblApellidos2.setBounds(110, 180, 240, 22);

        txtCi.setBackground(new java.awt.Color(255, 255, 255));
        txtCi.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCi.setForeground(new java.awt.Color(51, 51, 51));
        txtCi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtCi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCiFocusLost(evt);
            }
        });
        jPanel1.add(txtCi);
        txtCi.setBounds(360, 170, 250, 40);

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(51, 51, 51));
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombres.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtNombres);
        txtNombres.setBounds(360, 70, 250, 40);

        txtApellidos1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtApellidos1.setForeground(new java.awt.Color(51, 51, 51));
        txtApellidos1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidos1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtApellidos1);
        txtApellidos1.setBounds(360, 120, 250, 40);

        txtFecha_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha_nacimiento.setToolTipText("");
        txtFecha_nacimiento.setAutoscrolls(true);
        txtFecha_nacimiento.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtFecha_nacimiento.setOpaque(false);
        jPanel1.add(txtFecha_nacimiento);
        txtFecha_nacimiento.setBounds(360, 220, 250, 40);

        cmbTipoPer.setBackground(new java.awt.Color(255, 255, 255));
        cmbTipoPer.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        cmbTipoPer.setForeground(new java.awt.Color(0, 0, 0));
        cmbTipoPer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docente", "Estudiante", "Empleado" }));
        cmbTipoPer.setBorder(null);
        cmbTipoPer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoPerItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbTipoPer);
        cmbTipoPer.setBounds(360, 280, 250, 40);

        pnTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Docente"));

        javax.swing.GroupLayout pnTipoLayout = new javax.swing.GroupLayout(pnTipo);
        pnTipo.setLayout(pnTipoLayout);
        pnTipoLayout.setHorizontalGroup(
            pnTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        pnTipoLayout.setVerticalGroup(
            pnTipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jPanel1.add(pnTipo);
        pnTipo.setBounds(40, 340, 720, 120);

        btnGrabar.setBackground(new java.awt.Color(0, 213, 245));
        btnGrabar.setBorder(null);
        btnGrabar.setForeground(new java.awt.Color(3, 7, 71));
        btnGrabar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGrabarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrabarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrabarMouseExited(evt);
            }
        });
        btnGrabar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 7, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grabar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        btnGrabar.add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 50);

        jPanel1.add(btnGrabar);
        btnGrabar.setBounds(510, 470, 250, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCiFocusLost
        // Verificar si existe un registro con ese carnet de identidad
        
    }//GEN-LAST:event_txtCiFocusLost

    private void cmbTipoPerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoPerItemStateChanged
        // TODO add your handling code here:
        if (evt.getSource() == cmbTipoPer){
            int selec = (Integer)cmbTipoPer.getSelectedIndex();
            
            switch(selec){
                case 0://Docente Cargado de datos a la pantalla
                    pnDocente pnd = new pnDocente();
                    pnd.setSize(720, 120);
                    this.pnTipo.removeAll();
                    Docente dc = new Docente();
                    dc.Cargar(idPer);
                    JTextField txCn = (JTextField)pnd.getComponent(1);
                    txCn.setText(dc.getContrato());
                    this.pnTipo.add(pnd);
                    this.pnTipo.revalidate();
                    this.pnTipo.repaint();
                    break;
                case 1://Estudiante cargado de datos a la pantalla
                    pnEstudiante pne = new pnEstudiante();
                    pne.setSize(720,120);
                    this.pnTipo.removeAll();
                    Estudiante st = new Estudiante();
                    st.Cargar(this.idPer);
                    JTextField txru = (JTextField)pne.getComponent(1);
                    txru.setText(String.valueOf(st.getRu()));
                    JDateChooser dci = (JDateChooser)pne.getComponent(3);
                    dci.setDate(st.getFecha_ingreso());
                    pnTipo.add(pne);
                    pnTipo.revalidate();
                    pnTipo.repaint();
                    break;
                case 2://Empleado cargado de datos a la pantalla
                    pnEmpleado pna = new pnEmpleado();
                    pna.setSize(720,120);
                    this.pnTipo.removeAll();
                    Empleado emp = new Empleado();
                    emp.Cargar(this.idPer);
                    JTextField txcm = (JTextField)pna.getComponent(1);
                    txcm.setText(String.valueOf(emp.getCodigo_marcacion()));
                    JTextField txco = (JTextField)pna.getComponent(3);
                    txco.setText(emp.getCargo());
                    pnTipo.add(pna);
                    pnTipo.revalidate();
                    pnTipo.repaint();
                    break;
            }

        }
    }//GEN-LAST:event_cmbTipoPerItemStateChanged

    private void btnGrabarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseEntered
        btnGrabar.setBackground(new java.awt.Color(255,153,0));
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarMouseEntered

    private void btnGrabarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseExited
        btnGrabar.setBackground(new java.awt.Color(0,213,245));
        btnGrabar.setForeground(new java.awt.Color(3,7,71));        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarMouseExited

    private void btnGrabarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrabarMouseClicked
        // TODO add your handling code here:
        int selec = (Integer)cmbTipoPer.getSelectedIndex();
        char tipop;
        tipop = switch (selec) {
            case 0 -> 'D'; //Docente
            case 1 -> 'E'; //Estudiante
            case 2 -> 'A'; //Empleado
            default -> 'N'; //No determinado
        }; 
        Persona per = new Persona(txtNombres.getText(), txtApellidos1.getText(), 
                txtCi.getText(), txtFecha_nacimiento.getDate(), tipop, 'V' );
        PersonaDAO pda = new PersonaDAO();
        int idpe = -1;
        idpe = pda.Insertar(per);
        
        JPanel pn = (JPanel)this.pnTipo.getComponent(0);
        
        if (selec == 0){
        
        JTextField tex = (JTextField)pn.getComponent(1);
        Docente dc = new Docente(idpe,tex.getText(),'V');
        dc.Insertar();
        }
        
        if (selec == 1){
            JTextField txtRu = (JTextField)pn.getComponent(1);
            JDateChooser dtFI = (JDateChooser)pn.getComponent(3);
            JComboBox cmb = (JComboBox)pn.getComponent(5);
            char tipoe;
            tipoe = switch(cmb.getSelectedIndex()){
                case 0 -> 'B';
                case 1 -> 'M';
                case 2 -> 'S';
                default -> 'N';
            };

            Estudiante estu = new Estudiante(idpe, Integer.parseInt(txtRu.getText()),
                    dtFI.getDate(), tipoe, 'V');
            estu.Insertar();
        }
        
        if (selec == 2){
            JTextField txtcm = (JTextField)pn.getComponent(1);
            JTextField txtcargo = (JTextField)pn.getComponent(3);
            
            Empleado emp = new Empleado(idpe, Integer.parseInt(txtcm.getText()), 
                    txtcargo.getText(), 'V');
            emp.Insertar();
        }
        
        this.setVisible(false);    
    }//GEN-LAST:event_btnGrabarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Persona per = new Persona();
        PersonaDAO perD = new PersonaDAO();
        per = perD.cargar(this.idPer);
        
        //Recuperamos el tipo de datos para comprobar que haya
        //cambiado el perfil de la persona
        int selec = (Integer)cmbTipoPer.getSelectedIndex();
        char tipop;
        tipop = switch (selec) {
            case 0 -> 'D'; //Docente
            case 1 -> 'E'; //Estudiante
            case 2 -> 'A'; //Empleado
            default -> 'N'; //No determinado
        };
        
        if(per.getTipo() == tipop){
            //no cambio
            per.setNombres(this.txtNombres.getText());
            per.setApellidos(this.txtApellidos1.getText());
            per.setCi(this.txtCi.getText());
            per.setFechaNac(this.txtFecha_nacimiento.getDate());
            
            //Registramos los cambios en la persona
            perD.modificar(per);
            
            JPanel pn = (JPanel)this.pnTipo.getComponent(0);
            switch(tipop){
                case 'D'://Docente
                    Docente doce = new Docente();
                    doce.Cargar(idPer);
                    JTextField jtc = (JTextField)pn.getComponent(1);
                    doce.setContrato(jtc.getText());
                    doce.Actualizar();
                    break;
                case 'E'://Estudiante
                    Estudiante est = new Estudiante();
                    est.Cargar(idPer);
                    JTextField jtr = (JTextField)pn.getComponent(1);                    
                    est.setRu(Integer.parseInt(jtr.getText()));
                    JDateChooser dtch = (JDateChooser)pn.getComponent(3);
                    est.setFecha_ingreso(dtch.getDate());
                    JComboBox cmb = (JComboBox)pn.getComponent(5);
                    char tipoe;
                    tipoe = switch(cmb.getSelectedIndex()){
                        case 0 ->  'B';
                        case 1 -> 'M';
                        case 2 -> 'S';
                        default -> 'X';
                    };
                    est.setTipo_estudiante(tipoe);
                    est.Actualizar();
                    break;
                case 'A'://Empleado
                    Empleado emp = new Empleado();
                    emp.Cargar(idPer);
                    JTextField txcod = (JTextField)pn.getComponent(1);
                    emp.setCodigo_marcacion(Integer.parseInt(txcod.getText()));
                    
                    JTextField txtcar = (JTextField)pn.getComponent(3);
                    emp.setCargo(txtcar.getText());
                    
                    emp.Actualizar();
                    
                    break;
            }
            
            
            
            
        } else {
            
        }
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        btnGrabar.setBackground(new java.awt.Color(255,153,0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));    
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:        
        btnGrabar.setBackground(new java.awt.Color(0,213,245));
        jLabel1.setForeground(new java.awt.Color(3,7,71));   
        
    }//GEN-LAST:event_jLabel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnGrabar;
    private javax.swing.JComboBox<String> cmbTipoPer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidos1;
    private javax.swing.JLabel lblApellidos2;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnTipo;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtCi;
    private com.toedter.calendar.JDateChooser txtFecha_nacimiento;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
