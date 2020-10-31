/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import daos.ClienteDAO;
import daos.ProductoDAO;
import daos.VentaDAO;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Cliente;
import objetosNegocio.Producto;
import objetosNegocio.Venta;

/**
 *
 * @author david
 */
public class frmRegistro extends javax.swing.JDialog {

    private ProductoDAO productoDAO;
    private ClienteDAO clienteDAO;
    DefaultTableModel modeloCompras;
    private VentaDAO ventaDAO;
    private List<Producto> productosSeleccionados;
    private List<Integer> cantidades;

    static float total;
    float subtotal, Desc;
    
    
    public frmRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.productoDAO = new ProductoDAO();
        this.clienteDAO = new ClienteDAO();
        this.cargarProductos();
        setLocationRelativeTo(null);
        cargarCombo();
        Productos.setLocationRelativeTo(null);
        
        this.total=0;
        this.subtotal=0;
        this.Desc=0;
        this.tablaCompra.getTableHeader().setReorderingAllowed(false);
        this.tablaRProductos.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        this.tablaRProductos.getColumnModel().getColumn(0).setCellRenderer(alinear);
        this.tablaRProductos.getColumnModel().getColumn(1).setCellRenderer(alinear);
        this.tablaRProductos.getColumnModel().getColumn(2).setCellRenderer(alinear);
        this.tablaRProductos.getColumnModel().getColumn(3).setCellRenderer(alinear);
        
      
    }

    private void cargarProductos() {
        ArrayList<Producto> listaProductos = this.productoDAO.consultar();
        DefaultTableModel modelo = (DefaultTableModel) this.tablaRProductos.getModel();
        modelo.setRowCount(0);
        for (Producto producto : listaProductos) {
            Object[] fila = new Object[4];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[3] = producto.getStock();
            fila[2] = producto.getPrecioActual();
            modelo.addRow(fila);
        }
    }

    private void buscarProductos() {
        String nombre = this.txtBuscar.getText();
        ArrayList<Producto> productos = new ArrayList<>();
        DefaultTableModel xmodelo = (DefaultTableModel) this.tablaRProductos.getModel();
        productos = this.productoDAO.buscar(nombre);
        xmodelo.setRowCount(0);
        for (Producto producto : productos) {
            Object[] fila = new Object[4];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[2] = producto.getStock();
            fila[3] = producto.getPrecioActual();
            xmodelo.addRow(fila);
        }
    }

    public void cargarCombo() {
        cbClientes.removeAllItems();
        List<Cliente> clientes = this.clienteDAO.consultar();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Todos");
        for (Cliente cliente : clientes) {
            modelo.addElement(cliente);
        }

        this.cbClientes.setModel(modelo);
    }

    public void insertarVenta() {
        if (!txtSubtotal.getText().equals("") && !txtTotal.getText().equals("")
                && productosSeleccionados.size() > 0 && cbClientes.getSelectedItem() != null) {
            Venta venta = new Venta();
            Calendar fecha = new GregorianCalendar();
            venta.setFecha(fecha);
            Cliente cliente = (Cliente) cbClientes.getSelectedItem();
            venta.setCliente(cliente);
            if (!txtDescuento.getText().equals("")) {
                venta.setDescuento(Float.parseFloat(txtDescuento.getText()));
            } else {
                venta.setDescuento(0.0f);
            }
            
            venta.setMontoTotal(Float.parseFloat(txtTotal.getText()));
            this.ventaDAO.agregar(venta);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Productos = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scrpProductos = new javax.swing.JScrollPane();
        panelBuscador = new javax.swing.JScrollPane();
        tablaRProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bntRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        lblSubtotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        btnAgregarProductos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        scrllProductosSeleccionados = new javax.swing.JScrollPane();
        panelProductosSeleccionados = new javax.swing.JScrollPane();
        tablaCompra = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        Productos.setMinimumSize(new java.awt.Dimension(570, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        tablaRProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Precio actual", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaRProductosMousePressed(evt);
            }
        });
        panelBuscador.setViewportView(tablaRProductos);

        scrpProductos.setViewportView(panelBuscador);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(scrpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        javax.swing.GroupLayout ProductosLayout = new javax.swing.GroupLayout(Productos.getContentPane());
        Productos.getContentPane().setLayout(ProductosLayout);
        ProductosLayout.setHorizontalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ProductosLayout.setVerticalGroup(
            ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(ProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ProductosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        bntRegistrar.setText("Registrar");
        bntRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        lblTotal.setText("Total");

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });

        lblSubtotal.setText("Subtotal");

        lblDescuento.setText("Descuento");

        lblCliente.setText("Cliente");

        cbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClientesActionPerformed(evt);
            }
        });

        btnAgregarProductos.setText("Agregar al carrito");
        btnAgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescuento)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCliente)
                                .addComponent(lblSubtotal))
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbClientes, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnAgregarProductos)
                        .addGap(29, 29, 29)
                        .addComponent(bntRegistrar)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar)))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(bntRegistrar)
                    .addComponent(btnAgregarProductos))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos seleccionados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tablaCompra.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCompraMouseClicked(evt);
            }
        });
        panelProductosSeleccionados.setViewportView(tablaCompra);

        scrllProductosSeleccionados.setViewportView(panelProductosSeleccionados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(scrllProductosSeleccionados)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrllProductosSeleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCompraMouseClicked

    }//GEN-LAST:event_tablaCompraMouseClicked

    private void tablaRProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRProductosMouseClicked

    }//GEN-LAST:event_tablaRProductosMouseClicked

    private void tablaRProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRProductosMousePressed

    }//GEN-LAST:event_tablaRProductosMousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int filaS = tablaRProductos.getSelectedRow();
        try {
            float suma;
            int des;
            if (filaS == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                int id = Integer.parseInt(this.tablaRProductos.getValueAt(filaS, 0).toString());
                String nombre = this.tablaRProductos.getValueAt(filaS, 1).toString();
                float precio = Float.parseFloat(this.tablaRProductos.getValueAt(filaS, 2).toString());
                int cantidad = Integer.parseInt(this.txtCantidad.getText());
                float monto = precio * cantidad;
                modeloCompras = (DefaultTableModel) this.tablaCompra.getModel();

                Object filas[] = {id, nombre, precio, cantidad, monto};
                modeloCompras.addRow(filas);
                
                suma = precio * cantidad;
                subtotal = subtotal + suma;
                if (this.txtDescuento.getText().contentEquals("")) {
                    des = 0;
                    Desc = (subtotaldes)/100;
                    total = subtotal;
                }else{
                    des = Integer.parseInt(this.txtDescuento.getText());
                    Desc = (subtotaldes)/100;
                    total = subtotal - Desc;
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductosActionPerformed
        Productos.setModal(true);
        Productos.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductosActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        if (this.txtBuscar.getText().length() > 0) {
            this.buscarProductos();
        } else {
            this.cargarProductos();
        }
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void bntRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistrarActionPerformed

    }//GEN-LAST:event_bntRegistrarActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClientesActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRegistro dialog = new frmRegistro(new javax.swing.JFrame(), true);
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
    private javax.swing.JDialog Productos;
    private javax.swing.JButton bntRegistrar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarProductos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JScrollPane panelBuscador;
    private javax.swing.JScrollPane panelProductosSeleccionados;
    private javax.swing.JScrollPane scrllProductosSeleccionados;
    private javax.swing.JScrollPane scrpProductos;
    private javax.swing.JTable tablaCompra;
    private javax.swing.JTable tablaRProductos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
