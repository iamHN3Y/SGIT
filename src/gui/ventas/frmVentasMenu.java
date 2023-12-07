package gui.ventas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;
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

        jButtonGuardar.setUI(new BasicButtonUI());
        jButtonGuardar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jButtonGuardar.setBackground(Color.decode("#577590"));
                jButtonGuardar.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonGuardar.setBackground(Color.WHITE);
                jButtonGuardar.setForeground(Color.black);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N

        jPanelSide.setBackground(getBackground());
        jPanelSide.setPreferredSize(new java.awt.Dimension(400, 0));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(375, 350));

        jTable2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel2.setText("Carrito");

        jLabelTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabelTotal.setText("  ");

        jButtonGuardar.setBackground(getBackground());
        jButtonGuardar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Total");

        javax.swing.GroupLayout jPanelSideLayout = new javax.swing.GroupLayout(jPanelSide);
        jPanelSide.setLayout(jPanelSideLayout);
        jPanelSideLayout.setHorizontalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSideLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(jLabel4)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelSide, java.awt.BorderLayout.EAST);

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Menu Ventas");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(getBackground());
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
                        .addGap(0, 436, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
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
                    JOptionPane.showMessageDialog(this, "Se guardo la venta", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    carrito.clear();
                    cargaTabla();
                    jLabelTotal.setText("");
                    botones();
                } else {
                    // Si al menos una venta falló, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Al menos una venta no se pudo guardar. Revise los detalles de la operación.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar guardar las ventas: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    ArrayList<Venta> carrito = new ArrayList<>();
    double total = 0.0;

    public void botones() {
        jPanel2.setLayout(new GridLayout(0, 5));
        jPanel2.revalidate();
        jPanel2.removeAll();
        jPanel2.repaint();

        ArrayList<Producto> productos = null;
        try {
            productos = new dao.DAO_Producto().readProductos();

        } catch (SQLException ex) {
            System.out.println("error: " + ex);
        }

        Map<JButton, Producto> mapaBotones = new HashMap<>();

        for (Producto producto : productos) {
            JButton button = new JButton(producto.toString());
            // Establecer la fuente y tamaño de la fuente
            Font font = new Font("Microsoft YaHei UI", Font.PLAIN, 14);
            button.setFont(font);

            // Desactivar bordes y establecer borderPainted a true
            button.setBorderPainted(true);
            button.setBorder(null);

            button.setPreferredSize(new Dimension(50, 150));

            mapaBotones.put(button, producto);

            button.setBackground(Color.WHITE);
            button.setUI(new BasicButtonUI());

            int stocktemp = new dao.DAO_Stock().searchStock(producto.getId()).getCantidad();
            if (stocktemp <= 0) {
                button.setEnabled(false);
            }
            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    if (stocktemp >= 10) {
                        button.setBackground(Color.decode("#4D908E"));
                    } else if (stocktemp < 10 && stocktemp > 5) {
                        button.setBackground(Color.decode("#F9C74F"));
                    } else if (stocktemp <= 5) {
                        button.setBackground(Color.decode("#F94144"));
                    }

                    button.setForeground(Color.white);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    button.setBackground(Color.WHITE);
                    button.setForeground(Color.black);
                }
            });

            button.addActionListener((ActionEvent e) -> {
                Producto p = mapaBotones.get(button);
                Stock s = new dao.DAO_Stock().searchStock(p.getId());

                try {
                    int cantidad = 1;

                    // Validar que la cantidad no exceda el límite de stock
                    if (cantidad > s.getCantidad()) {
                        JOptionPane.showMessageDialog(null, "La cantidad ingresada excede el límite de stock (" + s.getCantidad() + ")", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Añadido al carrito: " + p + " - Cantidad: " + cantidad, "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
                        float subtotal = cantidad * p.getPrecio();
                        Venta venta = new Venta(p.getId(), u.getCuenta(), cantidad, subtotal);
                        carrito.add(venta);

                        total += subtotal;
                        jLabelTotal.setText(String.valueOf(total));
                        cargaTabla();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
