/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import daos.ClienteDAO;
import daos.ProductoDAO;
import daos.RelProductoVentasDAO;
import daos.VentaDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Cliente;
import objetosNegocio.Producto;
import objetosNegocio.RelProductoVentas;
import objetosNegocio.Venta;

/**
 *
 * @author david
 */
public class frmRegistro extends javax.swing.JDialog {

    private ProductoDAO productoDAO;
    private ClienteDAO clienteDAO;
    private VentaDAO ventaDAO;
    private RelProductoVentasDAO relpdao;
    private List<Producto> productosSeleccionados;
    private List<Integer> cantidades;

    public frmRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.productoDAO = new ProductoDAO();
        this.clienteDAO = new ClienteDAO();
        this.ventaDAO = new VentaDAO();
        this.relpdao= new RelProductoVentasDAO();
        productosSeleccionados = new ArrayList();
        cantidades = new ArrayList();
        this.cargarProductos();
        setLocationRelativeTo(null);
        cargarCombo();
       
        this.tablaProductosSeleccionados.getTableHeader().setReorderingAllowed(false);
        this.tablaBuscaProductos.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        this.tablaBuscaProductos.getColumnModel().getColumn(0).setCellRenderer(alinear);
        this.tablaBuscaProductos.getColumnModel().getColumn(1).setCellRenderer(alinear);
        this.tablaBuscaProductos.getColumnModel().getColumn(2).setCellRenderer(alinear);
        this.tablaBuscaProductos.getColumnModel().getColumn(3).setCellRenderer(alinear);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel3 = new javax.swing.JPanel();
        scrllProductosSeleccionados = new javax.swing.JScrollPane();
        panelProductosSeleccionados = new javax.swing.JScrollPane();
        tablaProductosSeleccionados = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scrpProductos = new javax.swing.JScrollPane();
        panelBuscador = new javax.swing.JScrollPane();
        tablaBuscaProductos = new javax.swing.JTable();

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
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTotal.setText("Total");

        txtTotal.setEditable(false);

        txtSubtotal.setEditable(false);

        txtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuentoActionPerformed(evt);
            }
        });
        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addComponent(bntRegistrar)
                        .addGap(77, 77, 77)
                        .addComponent(btnCancelar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
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
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos seleccionados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tablaProductosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProductosSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosSeleccionadosMouseClicked(evt);
            }
        });
        panelProductosSeleccionados.setViewportView(tablaProductosSeleccionados);

        scrllProductosSeleccionados.setViewportView(panelProductosSeleccionados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(scrllProductosSeleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrllProductosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscador de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaBuscaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaBuscaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBuscaProductosMouseClicked(evt);
            }
        });
        panelBuscador.setViewportView(tablaBuscaProductos);

        scrpProductos.setViewportView(panelBuscador);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(scrpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void bntRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistrarActionPerformed
        this.insertarVenta();
        this.limpiarFormulario();
        this.limpiarTabla();
    }//GEN-LAST:event_bntRegistrarActionPerformed

    private void cbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClientesActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarFormulario();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tablaProductosSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosSeleccionadosMouseClicked
          this.eliminarProductoTabla();
    }//GEN-LAST:event_tablaProductosSeleccionadosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (this.txtBuscar.getText().length() > 0) {
            this.buscarProductos();
        } else {
            this.cargarProductos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyReleased
        this.calcularMontos();
    }//GEN-LAST:event_txtDescuentoKeyReleased

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        this.validarNumerico(evt);
        this.limitarCaracteres(txtDescuento, evt, 2);
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void tablaBuscaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscaProductosMouseClicked
        Producto producto = this.seleccionarProducto();
        this.cargarProductosSeleccionados(producto);
    }//GEN-LAST:event_tablaBuscaProductosMouseClicked

    private void cargarProductos() {
        ArrayList<Producto> listaProductos = this.productoDAO.consultar();
        DefaultTableModel modelo = (DefaultTableModel) this.tablaBuscaProductos.getModel();
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
        DefaultTableModel xmodelo = (DefaultTableModel) this.tablaBuscaProductos.getModel();
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

    private Producto seleccionarProducto() {
        int fila = this.tablaBuscaProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto ", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tablaBuscaProductos.getModel();
            int idProducto = (int) modelo.getValueAt(fila, 0);
            Producto producto = productoDAO.constultarPorId(idProducto);

            if (producto != null) {
                return producto;
            }
        }
        return null;
    }
    
    private void insertarVenta() {
        if (!txtSubtotal.getText().equals("") && !txtTotal.getText().equals("")
                && productosSeleccionados.size() > 0 && cbClientes.getSelectedItem() != null) {
            Venta venta = new Venta();
            Calendar fecha = new GregorianCalendar(GregorianCalendar.YEAR, 
                    GregorianCalendar.MONTH+1 , GregorianCalendar.DAY_OF_MONTH);
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

            List<RelProductoVentas> relaciones = new ArrayList<>();
            
            Producto productoObj;
            Venta ventaObj= null;
            RelProductoVentas relacion = null;
            
            for (int i = 0; i < productosSeleccionados.size(); i++) {
//                RelProductoVentas relacion = new RelProductoVentas(productosSeleccionados.get(i), venta,
//                        cantidades.get(i),productosSeleccionados.get(i).getPrecioActual(),
//                        (productosSeleccionados.get(i).getPrecioActual() * cantidades.get(i)));
                
//                relacion.setVenta(venta);
//                relacion.setProducto(productosSeleccionados.get(i));
//                relacion.setCantidad(cantidades.get(i));
//                relacion.setImporte((productosSeleccionados.get(i).getPrecioActual()* cantidades.get(i)));
//                relacion.setPrecio(productosSeleccionados.get(i).getPrecioActual());
//                relaciones.add(relacion);

                  productoObj= new Producto(productosSeleccionados.get(i).getId());
                  float montito = (cantidades.get(i) * productosSeleccionados.get(i).getPrecioActual());
                  
                  ventaObj= new Venta(venta.getDescuento(), fecha, montito, cliente);
                  
                  relacion = new RelProductoVentas(productoObj, ventaObj, cantidades.get(i), productoObj.getPrecioActual(), montito);

            }
            this.relpdao.agregar(relacion);

        }

    }
    
     private void cargarProductosSeleccionados(Producto producto) {
        DefaultTableModel modelo = (DefaultTableModel) tablaProductosSeleccionados.getModel();
        modelo.setRowCount(0);
        int row = -1;
       
        for (int i = 0; i < productosSeleccionados.size(); i++) {
            if (productosSeleccionados.get(i).equals(producto)) {
                row = i;
                break;
            }
        }

        if (row == -1) {
            productosSeleccionados.add(producto);
            cantidades.add(1);

            for (int i = 0; i < productosSeleccionados.size(); i++) {

                Object[] lista = new Object[]{
                    productosSeleccionados.get(i).getId(),
                    productosSeleccionados.get(i).getNombre(),
                    productosSeleccionados.get(i).getPrecioActual(),
                    cantidades.get(i),
                    (cantidades.get(i) * productosSeleccionados.get(i).getPrecioActual())
                };
                modelo.addRow(lista);
            }
        } else {
            cantidades.set(row, cantidades.get(row) + 1);
            for (int i = 0; i < productosSeleccionados.size(); i++) {
                Object[] lista = new Object[]{
                    productosSeleccionados.get(i).getId(),
                    productosSeleccionados.get(i).getNombre(),
                    productosSeleccionados.get(i).getPrecioActual(),
                    cantidades.get(i),
                    (cantidades.get(i) * productosSeleccionados.get(i).getPrecioActual())

                };
                modelo.addRow(lista);
            }
        }
        this.calcularMontos();
    }

     
    private void eliminarProductoTabla() {
        int fila = this.tablaProductosSeleccionados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un producto ", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tablaProductosSeleccionados.getModel();
            modelo.setRowCount(0);
            productosSeleccionados.remove(fila);
            cantidades.remove(fila);

            for (int i = 0; i < productosSeleccionados.size(); i++) {
                Object[] lista = new Object[]{
                    productosSeleccionados.get(i).getId(),
                    productosSeleccionados.get(i).getNombre(),
                    productosSeleccionados.get(i).getPrecioActual(),
                    cantidades.get(i),
                    (cantidades.get(i) * productosSeleccionados.get(i).getPrecioActual())

                };
                modelo.addRow(lista);
            }
        }
        this.calcularMontos();

    }
    
    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tablaBuscaProductos.getModel();
        modelo.setRowCount(0);
        productosSeleccionados.clear();
        cantidades.clear();
        for (int i = 0; i < productosSeleccionados.size(); i++) {
            Object[] lista = new Object[]{
                productosSeleccionados.get(i).getId(),
                productosSeleccionados.get(i).getNombre(),
                productosSeleccionados.get(i).getPrecioActual(),
                cantidades.get(i),
                (cantidades.get(i) * productosSeleccionados.get(i).getPrecioActual())

            };
            modelo.addRow(lista);
        }
    }

     private void calcularMontos() {

        float subtotal = 0;
        float descuento = 0f;

        DefaultTableModel modelo = (DefaultTableModel) this.tablaProductosSeleccionados.getModel();
        for (int i = 0; i < productosSeleccionados.size(); i++) {
            subtotal += (float) modelo.getValueAt(i, 4);
        }

        if (!txtDescuento.getText().equals("")) {
            descuento = subtotal * (Float.parseFloat(txtDescuento.getText()) / 100);
        }
        float total = subtotal - descuento;
        txtSubtotal.setText(String.valueOf(subtotal));
        txtTotal.setText(String.valueOf(total));
    }
    
    private void limpiarFormulario() {
        txtSubtotal.setText("");
        txtDescuento.setText("");
        txtTotal.setText("");
        txtBuscar.setText("");
    }
    
    private void limitarCaracteres(javax.swing.JTextField textField, java.awt.event.KeyEvent evt, int longitud) {
        if (textField.getText().length() >= longitud) {
            evt.consume();
        }
    }

    private void validarNumerico(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
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
    private javax.swing.JButton bntRegistrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbClientes;
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
    private javax.swing.JTable tablaBuscaProductos;
    private javax.swing.JTable tablaProductosSeleccionados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
