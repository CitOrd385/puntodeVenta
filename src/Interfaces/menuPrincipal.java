package Interfaces;

/**
 *
 * @author david
 */
public class menuPrincipal extends javax.swing.JFrame {

    
    public menuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnS = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bntBV = new javax.swing.JButton();
        bntRV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mRegistro = new javax.swing.JMenu();
        mRegistroClientes = new javax.swing.JMenuItem();
        mRegistroProductos = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mVentas = new javax.swing.JMenu();
        mRV = new javax.swing.JMenuItem();
        mBV = new javax.swing.JMenuItem();
        mS = new javax.swing.JMenuItem();
        mInfo = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de venta");

        btnS.setText("Salir");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));

        bntBV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bntBV.setText("Busqueda de ventas");
        bntBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBVActionPerformed(evt);
            }
        });

        bntRV.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bntRV.setText("Registro de ventas");
        bntRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntBV)
                    .addComponent(bntRV, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(bntRV)
                .addGap(31, 31, 31)
                .addComponent(bntBV)
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro "));

        btnClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClientes.setText("Registro de clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProductos.setText("Registro de productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnClientes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnProductos)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClientes)
                .addGap(31, 31, 31)
                .addComponent(btnProductos)
                .addGap(35, 35, 35))
        );

        mRegistro.setText("Registro");

        mRegistroClientes.setText("Registro de clientes");
        mRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistroClientesActionPerformed(evt);
            }
        });
        mRegistro.add(mRegistroClientes);

        mRegistroProductos.setText("Registro de productos");
        mRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistroProductosActionPerformed(evt);
            }
        });
        mRegistro.add(mRegistroProductos);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mRegistro.add(jMenuItem4);

        jMenuBar1.add(mRegistro);

        mVentas.setText("Ventas");

        mRV.setText("Registro de ventas");
        mRV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRVActionPerformed(evt);
            }
        });
        mVentas.add(mRV);

        mBV.setText("Busqueda de ventas");
        mBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBVActionPerformed(evt);
            }
        });
        mVentas.add(mBV);

        mS.setText("Salir");
        mS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSActionPerformed(evt);
            }
        });
        mVentas.add(mS);

        jMenuBar1.add(mVentas);

        mInfo.setText("Información");
        jMenuBar1.add(mInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnS)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnS)
                .addGap(14, 14, 14))
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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistroClientesActionPerformed
        frmClientes clientes = new frmClientes(this, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_mRegistroClientesActionPerformed

    private void mRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistroProductosActionPerformed
        frmProductos productos = new frmProductos(this, true);
        productos.setVisible(true);
    }//GEN-LAST:event_mRegistroProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        frmClientes clientes = new frmClientes(this, true);
        clientes.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        frmProductos productos = new frmProductos(this, true);
        productos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

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
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnS;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem mBV;
    private javax.swing.JMenu mInfo;
    private javax.swing.JMenuItem mRV;
    private javax.swing.JMenu mRegistro;
    private javax.swing.JMenuItem mRegistroClientes;
    private javax.swing.JMenuItem mRegistroProductos;
    private javax.swing.JMenuItem mS;
    private javax.swing.JMenu mVentas;
    // End of variables declaration//GEN-END:variables
}
