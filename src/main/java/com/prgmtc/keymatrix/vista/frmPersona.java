package com.prgmtc.keymatrix.vista;

import com.prgmtc.keymatrix.vista.per.pnBusqueda;

/**
 *
 * @author Elvis
 */
public class frmPersona extends javax.swing.JFrame {

    /**
     * Creates new form frmPersona
     */
    public frmPersona() {
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

        pnlGlobo = new javax.swing.JPanel();
        lblGlobo = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        pnlOp1 = new javax.swing.JPanel();
        lblOp1 = new javax.swing.JLabel();
        pnlOp2 = new javax.swing.JPanel();
        lblOp2 = new javax.swing.JLabel();
        pnlOp3 = new javax.swing.JPanel();
        lblOp3 = new javax.swing.JLabel();
        pnlOp4 = new javax.swing.JPanel();
        lblOp4 = new javax.swing.JLabel();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblGlobo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Globo.png"))); // NOI18N

        javax.swing.GroupLayout pnlGloboLayout = new javax.swing.GroupLayout(pnlGlobo);
        pnlGlobo.setLayout(pnlGloboLayout);
        pnlGloboLayout.setHorizontalGroup(
            pnlGloboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGloboLayout.createSequentialGroup()
                .addComponent(lblGlobo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlGloboLayout.setVerticalGroup(
            pnlGloboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGlobo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlGlobo);
        pnlGlobo.setBounds(0, 0, 200, 200);

        pnlTitulo.setBackground(new java.awt.Color(3, 7, 71));

        lblTitulo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Título de la Ventana");

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 213, 245));
        lblUsuario.setText("Usuario");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTitulo);
        pnlTitulo.setBounds(200, 0, 800, 60);

        pnlMenu.setBackground(new java.awt.Color(3, 7, 71));
        pnlMenu.setLayout(null);

        pnlOp1.setBackground(new java.awt.Color(0, 213, 245));
        pnlOp1.setForeground(new java.awt.Color(0, 213, 245));
        pnlOp1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        pnlOp1.setLayout(null);

        lblOp1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblOp1.setForeground(new java.awt.Color(3, 7, 71));
        lblOp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp1.setText("Búsqueda");
        lblOp1.setToolTipText("");
        lblOp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOp1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOp1MouseExited(evt);
            }
        });
        pnlOp1.add(lblOp1);
        lblOp1.setBounds(0, 0, 180, 60);

        pnlMenu.add(pnlOp1);
        pnlOp1.setBounds(10, 0, 180, 60);

        pnlOp2.setBackground(new java.awt.Color(0, 213, 245));
        pnlOp2.setForeground(new java.awt.Color(3, 7, 71));
        pnlOp2.setRequestFocusEnabled(false);
        pnlOp2.setLayout(null);

        lblOp2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblOp2.setForeground(new java.awt.Color(3, 7, 71));
        lblOp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp2.setText("Nuevo");
        lblOp2.setToolTipText("");
        lblOp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOp2MouseExited(evt);
            }
        });
        pnlOp2.add(lblOp2);
        lblOp2.setBounds(0, 0, 180, 60);

        pnlMenu.add(pnlOp2);
        pnlOp2.setBounds(10, 80, 180, 60);

        pnlOp3.setBackground(new java.awt.Color(0, 213, 245));
        pnlOp3.setForeground(new java.awt.Color(3, 7, 71));
        pnlOp3.setRequestFocusEnabled(false);
        pnlOp3.setLayout(null);

        lblOp3.setBackground(new java.awt.Color(3, 7, 71));
        lblOp3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblOp3.setForeground(new java.awt.Color(3, 7, 71));
        lblOp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp3.setText("Editar");
        lblOp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOp3MouseExited(evt);
            }
        });
        pnlOp3.add(lblOp3);
        lblOp3.setBounds(0, 0, 180, 60);

        pnlMenu.add(pnlOp3);
        pnlOp3.setBounds(10, 160, 180, 60);

        pnlOp4.setBackground(new java.awt.Color(0, 213, 245));

        lblOp4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblOp4.setForeground(new java.awt.Color(3, 7, 71));
        lblOp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOp4.setText("Eliminar");
        lblOp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOp4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOp4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlOp4Layout = new javax.swing.GroupLayout(pnlOp4);
        pnlOp4.setLayout(pnlOp4Layout);
        pnlOp4Layout.setHorizontalGroup(
            pnlOp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOp4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlOp4Layout.setVerticalGroup(
            pnlOp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOp4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        pnlMenu.add(pnlOp4);
        pnlOp4.setBounds(10, 240, 180, 60);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 200, 200, 400);

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(pnlContenido);
        pnlContenido.setBounds(200, 60, 800, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblOp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp1MouseClicked
        // TODO add your handling code here:
        pnBusqueda pb = new pnBusqueda();
        pb.setSize(800, 840);
        pb.setLocation(0,0);
        
        pnlContenido.removeAll();
        pnlContenido.add(pb);
        pnlContenido.revalidate();
        pnlContenido.repaint();
        
        
    }//GEN-LAST:event_lblOp1MouseClicked

    private void lblOp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp1MouseEntered
        // TODO add your handling code here:
        pnlOp1.setBackground(new java.awt.Color(255,153,0));
        lblOp1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lblOp1MouseEntered

    private void lblOp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp1MouseExited
        pnlOp1.setBackground(new java.awt.Color(0,213,245));
        lblOp1.setForeground(new java.awt.Color(3,7,71));
    }//GEN-LAST:event_lblOp1MouseExited

    private void lblOp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp2MouseEntered
        pnlOp2.setBackground(new java.awt.Color(255,153,0));
        lblOp2.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lblOp2MouseEntered

    private void lblOp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp2MouseExited
        pnlOp2.setBackground(new java.awt.Color(0, 213, 245));
        lblOp2.setForeground(new java.awt.Color(3, 7, 71));
    }//GEN-LAST:event_lblOp2MouseExited

    private void lblOp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp3MouseEntered
        pnlOp3.setBackground(new java.awt.Color(255,153,0));
        lblOp3.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lblOp3MouseEntered

    private void lblOp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp3MouseExited
        pnlOp3.setBackground(new java.awt.Color(0, 213, 245));
        lblOp3.setForeground(new java.awt.Color(3, 7, 71));
    }//GEN-LAST:event_lblOp3MouseExited

    private void lblOp4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp4MouseEntered
        pnlOp4.setBackground(new java.awt.Color(255,153,0));
        lblOp4.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lblOp4MouseEntered

    private void lblOp4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOp4MouseExited
        pnlOp4.setBackground(new java.awt.Color(0, 213, 245));
        lblOp4.setForeground(new java.awt.Color(3, 7, 71));
    }//GEN-LAST:event_lblOp4MouseExited

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
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblGlobo;
    private javax.swing.JLabel lblOp1;
    private javax.swing.JLabel lblOp2;
    private javax.swing.JLabel lblOp3;
    private javax.swing.JLabel lblOp4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlGlobo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlOp1;
    private javax.swing.JPanel pnlOp2;
    private javax.swing.JPanel pnlOp3;
    private javax.swing.JPanel pnlOp4;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
