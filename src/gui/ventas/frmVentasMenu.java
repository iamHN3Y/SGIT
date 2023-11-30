package gui.ventas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import models.Producto;
import models.Stock;

import models.Usuario;
import models.Venta;

public class frmVentasMenu extends javax.swing.JFrame {

    Usuario u;

    public frmVentasMenu(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(this);
        botones();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N

        jPanelSide.setBackground(new java.awt.Color(255, 242, 216));
        jPanelSide.setPreferredSize(new java.awt.Dimension(400, 0));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(375, 350));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(getFont());
        jLabel2.setText("Carrito");

        jLabel3.setFont(getFont());
        jLabel3.setText("  ");

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(getFont());
        jLabel4.setText("Total");

        javax.swing.GroupLayout jPanelSideLayout = new javax.swing.GroupLayout(jPanelSide);
        jPanelSide.setLayout(jPanelSideLayout);
        jPanelSideLayout.setHorizontalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSideLayout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSideLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSideLayout.createSequentialGroup()
                                .addContainerGap(249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jPanelSideLayout.setVerticalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanelSide, java.awt.BorderLayout.EAST);

        jPanelContenedor.setBackground(new java.awt.Color(234, 215, 187));

        jLabel1.setFont(getFont());
        jLabel1.setText("Menu Ventas");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 488, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito de ventas está vacío. Agregue productos al carrito primero.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                boolean todasLasVentasExitosas = true;

                // Itera sobre cada venta en el carrito
                for (Venta venta : carrito) {
                    boolean resultado = new dao.DAO_Venta().createVenta(venta, u);

                    // Si una venta falla, marca que no todas las ventas fueron exitosas
                    if (!resultado) {
                        todasLasVentasExitosas = false;
                    }
                }

                // Después de procesar todas las ventas
                if (todasLasVentasExitosas) {
                    // Si todas las ventas fueron exitosas, limpiar el carrito
                    carrito.clear();
                    cargaTabla();
                } else {
                    // Si al menos una venta falló, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Al menos una venta no se pudo guardar. Revise los detalles de la operación.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar guardar las ventas: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    ArrayList<Venta> carrito = new ArrayList<>();
    double total = 0.0;

    public void botones() {
        jPanel2.setLayout(new GridLayout(0, 5));

        ArrayList<Producto> productos = null;
        try {
            productos = new dao.DAO_Producto().readProductos();
        } catch (SQLException ex) {
            System.out.println("error: " + ex);
        }

        Map<JButton, Producto> mapaBotones = new HashMap<>();

        for (Producto producto : productos) {
            JButton button = new JButton(producto.toString());
            button.setPreferredSize(new Dimension(50, 150));

            mapaBotones.put(button, producto);

            button.addActionListener((ActionEvent e) -> {
                Producto p = mapaBotones.get(button);
                Stock s = new dao.DAO_Stock().searchStock(p.getId());
                String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad para el producto " + p + ", el límite para el producto es: " + s.getCantidad());
                int cantidad = 0;

                if (cantidadStr != null) {
                    try {
                        cantidad = Integer.parseInt(cantidadStr);

                        // Validar que la cantidad no exceda el límite de stock
                        if (cantidad > s.getCantidad()) {
                            JOptionPane.showMessageDialog(null, "La cantidad ingresada excede el límite de stock (" + s.getCantidad() + ")", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Añadido al carrito: " + p + " - Cantidad: " + cantidad, "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
                            float subtotal = cantidad * p.getPrecio();
                            Venta venta = new Venta(p.getId(), u.getCuenta(), cantidad, subtotal);
                            carrito.add(venta);

                            total += subtotal;
                            jLabel3.setText(String.valueOf(total));
                            cargaTabla();
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            jPanel2.add(button);
            jPanel2.revalidate();
        }

    }

    void cargaTabla() {
        SwingUtilities.invokeLater(() -> {
            jTable2.setModel(crearTableModelCarrito(carrito));
        });
    }

    public DefaultTableModel crearTableModelCarrito(ArrayList<Venta> carrito) {
        // Definir las columnas del modelo de datos
        String[] columnas = {"Producto", "Cantidad", "Subtotal"};

        // Crear el modelo de datos con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Iterar a través de las ventas en el carrito y agregar los datos al modelo
        for (Venta venta : carrito) {
            Producto producto = new dao.DAO_Producto().readProducto(venta.getId_producto()); // Debes implementar un método para obtener el producto por su ID
            String nombreProducto = producto.getNombre();
            int cantidad = venta.getCantidad();
            float subtotal = venta.getTotal();

            // Crear un array de objetos para representar una fila de datos
            Object[] fila = {nombreProducto, cantidad, subtotal};

            // Agregar la fila al modelo
            modelo.addRow(fila);
        }

        return modelo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
