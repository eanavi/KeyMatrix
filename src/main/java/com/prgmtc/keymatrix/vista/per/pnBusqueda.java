
package com.prgmtc.keymatrix.vista.per;

import javax.swing.table.DefaultTableModel;
import com.prgmtc.keymatrix.modelo.PersonaDAO;
import com.prgmtc.keymatrix.modelo.Persona;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class pnBusqueda extends javax.swing.JPanel {


    public pnBusqueda() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBCi = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        jToolBar1.setRollover(true);

        setMinimumSize(new java.awt.Dimension(800, 540));
        setPreferredSize(new java.awt.Dimension(800, 540));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "  Criterios de Búsqueda  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(3, 7, 71))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 7, 71));
        jLabel1.setText("C.I.");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(7, 40, 40, 33);

        txtBNombre.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtBNombre.setForeground(new java.awt.Color(3, 7, 71));
        txtBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtBNombre);
        txtBNombre.setBounds(370, 40, 340, 33);

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 7, 71));
        jLabel2.setText("Nombres, Apellidos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(190, 40, 170, 30);

        txtBCi.setForeground(new java.awt.Color(3, 7, 71));
        txtBCi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtBCi);
        txtBCi.setBounds(50, 40, 110, 33);

        btnBuscarP.setBackground(new java.awt.Color(0, 213, 245));
        btnBuscarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPMouseClicked(evt);
            }
        });

        lblBuscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(3, 7, 71));
        lblBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscar.setText("Buscar");
        lblBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarPLayout = new javax.swing.GroupLayout(btnBuscarP);
        btnBuscarP.setLayout(btnBuscarPLayout);
        btnBuscarPLayout.setHorizontalGroup(
            btnBuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnBuscarPLayout.setVerticalGroup(
            btnBuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.add(btnBuscarP);
        btnBuscarP.setBounds(720, 40, 60, 33);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 100);

        tblDatos.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nombres", "Apellidos", "Ci", "Fecha Nac", "tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setRowHeight(20);
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jPanel1.add(pnlDatos);
        pnlDatos.setBounds(0, 100, 800, 440);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 834, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNombreActionPerformed

    private void lblBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscarP.setBackground(new java.awt.Color(3,7,71));
        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lblBuscarMouseEntered

    private void lblBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseExited
        // TODO add your handling code here:
        btnBuscarP.setBackground(new java.awt.Color(0,213,245));
        lblBuscar.setForeground(new java.awt.Color(3,7,71));
    }//GEN-LAST:event_lblBuscarMouseExited

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DefaultTableModel modelo =  (DefaultTableModel)tblDatos.getModel();
        
        modelo.setNumRows(0);
        Object[] fila;
        List<Persona> lp = new ArrayList<>();
        PersonaDAO pd = new PersonaDAO();
        lp = pd.listar(txtBCi.getText(), txtBNombre.getText());
        
        for(Persona per : lp){
            fila = new Object[6];
            fila[0] = String.valueOf( per.getIdPersona());
            fila[1] = per.getNombres();
            fila[2] = per.getApellidos();
            fila[3] = per.getCi();
            fila[4] = sdf.format( per.getFechaNac());
            switch (per.getTipo()){
                case 'E':
                    fila[5] = "Estudiante";
                    break;
                case 'A':
                    fila[5] = "Empleado";
                    break;
                case 'D':
                    fila[5] = "Docente";
                    break;
                default:
                    fila[5] = "Nd";
            }
            
            modelo.addRow(fila);
        }
        
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_lblBuscarMouseClicked

    private void btnBuscarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPMouseClicked
        //Busqueda con criterios 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DefaultTableModel modelo =  (DefaultTableModel)tblDatos.getModel();
        
        modelo.setNumRows(0);
        Object[] fila;
        List<Persona> lp = new ArrayList<>();
        PersonaDAO pd = new PersonaDAO();
        lp = pd.listar(txtBCi.getText(), txtBNombre.getText());
        
        for(Persona per : lp){
            fila = new Object[6];
            fila[0] = String.valueOf( per.getIdPersona());
            fila[1] = per.getNombres();
            fila[2] = per.getApellidos();
            fila[3] = per.getCi();
            fila[4] = sdf.format( per.getFechaNac());
            switch (per.getTipo()){
                case 'E':
                    fila[5] = "Empleado";
                    break;
                case 'A':
                    fila[5] = "Estudiante";
                    break;
                case 'D':
                    fila[5] = "Docente";
                    break;
                default:
                    fila[5] = "Nd";
            }
            
            modelo.addRow(fila);
        }
        
        tblDatos.setModel(modelo);
    }//GEN-LAST:event_btnBuscarPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lblBuscar;
    private javax.swing.JPanel pnlDatos;
    public javax.swing.JTable tblDatos;
    public javax.swing.JTextField txtBCi;
    public javax.swing.JTextField txtBNombre;
    // End of variables declaration//GEN-END:variables
}
