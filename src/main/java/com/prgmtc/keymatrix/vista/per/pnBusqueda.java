/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.prgmtc.keymatrix.vista.per;

/**
 *
 * @author Elvis
 */
public class pnBusqueda extends javax.swing.JPanel {

    /**
     * Creates new form pnBusqueda
     */
    public pnBusqueda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        btnBuscar = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setMinimumSize(new java.awt.Dimension(800, 540));
        setPreferredSize(new java.awt.Dimension(800, 540));

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

        txtBNombre.setBackground(new java.awt.Color(255, 255, 255));
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

        txtBCi.setBackground(new java.awt.Color(255, 255, 255));
        txtBCi.setForeground(new java.awt.Color(3, 7, 71));
        txtBCi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(txtBCi);
        txtBCi.setBounds(50, 40, 110, 33);

        btnBuscarP.setBackground(new java.awt.Color(0, 213, 245));

        btnBuscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(3, 7, 71));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarPLayout = new javax.swing.GroupLayout(btnBuscarP);
        btnBuscarP.setLayout(btnBuscarPLayout);
        btnBuscarPLayout.setHorizontalGroup(
            btnBuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnBuscarPLayout.setVerticalGroup(
            btnBuscarPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.add(btnBuscarP);
        btnBuscarP.setBounds(720, 40, 60, 33);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 100);

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

    private void txtBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNombreActionPerformed

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        btnBuscarP.setBackground(new java.awt.Color(3,7,71));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        btnBuscarP.setBackground(new java.awt.Color(0,213,245));
        btnBuscar.setForeground(new java.awt.Color(3,7,71));
    }//GEN-LAST:event_btnBuscarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JPanel btnBuscarP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtBCi;
    private javax.swing.JTextField txtBNombre;
    // End of variables declaration//GEN-END:variables
}
