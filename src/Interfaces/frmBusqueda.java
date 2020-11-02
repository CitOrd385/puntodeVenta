/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import daos.ClienteDAO;
import daos.VentaDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Cliente;
import objetosNegocio.RelProductoVentas;
import objetosNegocio.Venta;

public class frmBusqueda extends javax.swing.JDialog {

        private ClienteDAO clientedao;
        private VentaDAO ventadao;
    
    public frmBusqueda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.clientedao= new ClienteDAO();
        this.ventadao= new VentaDAO();
        cargarCombo();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBV = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        lblFechas = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        lblFechas1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        pDV2 = new javax.swing.JPanel();
        lblid2 = new javax.swing.JLabel();
        lblCliente4 = new javax.swing.JLabel();
        lblSubtotal2 = new javax.swing.JLabel();
        lblDescuento2 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        txtID2 = new javax.swing.JTextField();
        txtCliente2 = new javax.swing.JTextField();
        txtSubtotal2 = new javax.swing.JTextField();
        txtDescuento2 = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        pP = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pBV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        panelBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBusquedaMouseClicked(evt);
            }
        });

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Venta", "Cliente", "Fecha", "Subtotal", "Descuento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
        });
        panelBusqueda.setViewportView(tablaVentas);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblCliente.setText("Cliente:");

        lblFechas.setText("Fechas:");

        lblFechas1.setText("a");

        javax.swing.GroupLayout pBVLayout = new javax.swing.GroupLayout(pBV);
        pBV.setLayout(pBVLayout);
        pBVLayout.setHorizontalGroup(
            pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBVLayout.createSequentialGroup()
                .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pBVLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechas)
                            .addComponent(lblCliente))
                        .addGap(18, 18, 18)
                        .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pBVLayout.createSequentialGroup()
                                .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lblFechas1)
                                .addGap(18, 18, 18)
                                .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pBVLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pBVLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pBVLayout.setVerticalGroup(
            pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechas)
                    .addGroup(pBVLayout.createSequentialGroup()
                        .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechas1))))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(27, 27, 27)
                .addComponent(panelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        pDV2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de venta"));

        lblid2.setText("ID");

        lblCliente4.setText("Cliente");

        lblSubtotal2.setText("Subtotal");

        lblDescuento2.setText("Descuento");

        lblTotal2.setText("Total");

        javax.swing.GroupLayout pDV2Layout = new javax.swing.GroupLayout(pDV2);
        pDV2.setLayout(pDV2Layout);
        pDV2Layout.setHorizontalGroup(
            pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDV2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescuento2)
                    .addComponent(lblTotal2)
                    .addComponent(lblCliente4)
                    .addComponent(lblid2)
                    .addComponent(lblSubtotal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDescuento2)
                        .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCliente2)
                        .addComponent(txtSubtotal2)
                        .addComponent(txtID2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        pDV2Layout.setVerticalGroup(
            pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDV2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDV2Layout.createSequentialGroup()
                        .addComponent(lblid2)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente4)
                    .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDV2Layout.createSequentialGroup()
                        .addComponent(txtSubtotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescuento2)
                            .addComponent(txtDescuento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSubtotal2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDV2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal2)
                    .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pP.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Precio actual", "Cantidad", "Monto total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        javax.swing.GroupLayout pPLayout = new javax.swing.GroupLayout(pP);
        pP.setLayout(pPLayout);
        pPLayout.setHorizontalGroup(
            pPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pPLayout.setVerticalGroup(
            pPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pBV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pDV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pDV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pBV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void panelBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBusquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBusquedaMouseClicked

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked
        this.cargarFormulario();
        this.cargarProductos();
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.cargarVentas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void cargarProductos() {

        DefaultTableModel modelo = (DefaultTableModel) tablaProductos.getModel();
        modelo.setRowCount(0);
        int idVenta = Integer.parseInt(txtID2.getText());
        Venta venta = ventadao.constultarPorId(idVenta);
        List<RelProductoVentas> productos = venta.getProductos();

        for (RelProductoVentas producto : productos) {
            Object[] lista = new Object[]{
                producto.getProducto().getId(),
                producto.getProducto().getNombre(),
                producto.getProducto().getPrecioActual(),
                producto.getCantidad(),
                producto.getImporte()
            };
            modelo.addRow(lista);
        }

    }
    
    public void cargarCombo() {
        cbClientes.removeAllItems();
        List<Cliente> clientes = this.clientedao.consultar();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Todos");
        for (Cliente cliente : clientes) {
            modelo.addElement(cliente);
        }

        this.cbClientes.setModel(modelo);
    }
    
    private void cargarFormulario() {
        int fila = this.tablaVentas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una venta", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tablaVentas.getModel();
            int idVenta = (int) modelo.getValueAt(fila, 0);
            Venta venta = ventadao.constultarPorId(idVenta);
            if (venta != null) {
                txtID2.setText(String.valueOf(idVenta));
                int idCliente = (int) modelo.getValueAt(fila, 1);
                txtCliente2.setText(String.valueOf(idCliente));
                float subTotal = (float) modelo.getValueAt(fila, 3);
                txtSubtotal2.setText(String.valueOf(subTotal));
                String descuento = (String) modelo.getValueAt(fila, 4);
                txtDescuento2.setText(descuento);
                float total = (float) modelo.getValueAt(fila, 5);
                txtTotal2.setText(String.valueOf(total));

            }
        }
    }
    
    public void cargarJCalendar() {
        Date fecha1 = new Date();
        fechaDesde.setDate(fecha1);
        
        Date fecha2 = new Date();
        fechaHasta.setDate(fecha2);
    }
    
    public void cargarVentas(){
        String format= "yyyy-MM-dd";
        if(fechaDesde.getDate() != null && fechaHasta.getDate()!= null){
          SimpleDateFormat sdf= new SimpleDateFormat(format);  
          String fechaInicio= sdf.format(this.fechaDesde.getDate());
          String fechaFin= sdf.format(this.fechaHasta.getDate());
          Integer idCliente;
          try{
              Cliente cliente = (Cliente) cbClientes.getSelectedItem();
               idCliente= cliente.getId();
              
          }catch(Exception e){
              idCliente= -1;
          }
          List<Venta> ventas= this.ventadao.consultarVentasPorRango(fechaInicio, fechaFin, idCliente);
          
          if(ventas != null){
              DefaultTableModel modelo = (DefaultTableModel) tablaVentas.getModel();
                modelo.setRowCount(0);
                
                for (Venta venta : ventas) {
                  String fechaVenta = sdf.format(venta.getFecha());
                    float subTotal = 0f;
                  
                    for (int i = 0; i < venta.getProductos().size(); i++) {
                        subTotal += venta.getProductos().get(i).getPrecio() * venta.getProductos().get(i).getCantidad();
                    }
                    
                    Object[] lista = new Object[]{
                        venta.getId(),
                        venta.getCliente().getId(),
                        fechaVenta,
                        subTotal,
                        venta.getDescuento() + "%",
                        venta.getMontoTotal()
                    };

                    modelo.addRow(lista);
              }
                
          }
          
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmBusqueda dialog = new frmBusqueda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbClientes;
    private com.toedter.calendar.JDateChooser fechaDesde;
    private com.toedter.calendar.JDateChooser fechaHasta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente4;
    private javax.swing.JLabel lblDescuento2;
    private javax.swing.JLabel lblFechas;
    private javax.swing.JLabel lblFechas1;
    private javax.swing.JLabel lblSubtotal2;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JLabel lblid2;
    private javax.swing.JPanel pBV;
    private javax.swing.JPanel pDV2;
    private javax.swing.JPanel pP;
    private javax.swing.JScrollPane panelBusqueda;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JTextField txtDescuento2;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtSubtotal2;
    private javax.swing.JTextField txtTotal2;
    // End of variables declaration//GEN-END:variables
}
