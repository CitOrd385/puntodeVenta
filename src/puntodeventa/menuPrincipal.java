package puntodeventa;

/**
 *
 * @author david
 */
public class menuPrincipal extends javax.swing.JFrame {

    
    public menuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntRV = new javax.swing.JButton();
        bntBV = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mM = new javax.swing.JMenu();
        mRV = new javax.swing.JMenuItem();
        mBV = new javax.swing.JMenuItem();
        mS = new javax.swing.JMenuItem();
        mInfo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de venta");

        bntRV.setText("Registro de ventas");
        bntRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRVActionPerformed(evt);
            }
        });

        bntBV.setText("Busqueda de ventas");
        bntBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBVActionPerformed(evt);
            }
        });

        btnS.setText("Salir");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        mM.setText("Menu");

        mRV.setText("Registro de ventas");
        mRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRVActionPerformed(evt);
            }
        });
        mM.add(mRV);

        mBV.setText("Busqueda de ventas");
        mBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBVActionPerformed(evt);
            }
        });
        mM.add(mBV);

        mS.setText("Salir");
        mS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSActionPerformed(evt);
            }
        });
        mM.add(mS);

        jMenuBar1.add(mM);

        mInfo.setText("Información");
        jMenuBar1.add(mInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntRV, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnS)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(bntBV)
                            .addGap(131, 131, 131)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(bntRV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(bntBV)
                .addGap(58, 58, 58)
                .addComponent(btnS)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRVActionPerformed
        frmRegistro registro = new frmRegistro(this, true);
        registro.setVisible(true);
    }//GEN-LAST:event_mRVActionPerformed

    private void mBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBVActionPerformed
        frmBusqueda busqueda = new frmBusqueda(this, true);
        busqueda.setVisible(true);
    }//GEN-LAST:event_mBVActionPerformed

    private void mSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSActionPerformed

    private void bntRVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRVActionPerformed
        frmRegistro registro = new frmRegistro(this, true);
        registro.setVisible(true);
    }//GEN-LAST:event_bntRVActionPerformed

    private void bntBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBVActionPerformed
        frmBusqueda busqueda = new frmBusqueda(this, true);
        busqueda.setVisible(true);
    }//GEN-LAST:event_bntBVActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBV;
    private javax.swing.JButton bntRV;
    private javax.swing.JButton btnS;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mBV;
    private javax.swing.JMenu mInfo;
    private javax.swing.JMenu mM;
    private javax.swing.JMenuItem mRV;
    private javax.swing.JMenuItem mS;
    // End of variables declaration//GEN-END:variables
}
