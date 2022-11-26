/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.prgmtc.keymatrix.vista;

/**
 *
 * @author eanav
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAulas = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAulas.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnAulas.setText("Asignación de Aulas");
        btnAulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAulasMouseClicked(evt);
            }
        });
        getContentPane().add(btnAulas);
        btnAulas.setBounds(420, 10, 280, 80);

        btnAdministracion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnAdministracion.setText("Administración");
        btnAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseClicked(evt);
            }
        });
        getContentPane().add(btnAdministracion);
        btnAdministracion.setBounds(120, 10, 280, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseClicked
        // TODO add your handling code here:
        frmPersona fpm = new frmPersona();
        fpm.setVisible(true);
        
    }//GEN-LAST:event_btnAdministracionMouseClicked

    private void btnAulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAulasMouseClicked
        // TODO add your handling code here:
        frmAdministra fpa = new frmAdministra(1);
        fpa.setVisible(true);

        
    }//GEN-LAST:event_btnAulasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnAulas;
    // End of variables declaration//GEN-END:variables
}
