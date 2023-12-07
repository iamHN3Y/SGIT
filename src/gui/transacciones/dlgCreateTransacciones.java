package gui.transacciones;

import gui.proveedor.dlgUpdateProveedor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Proveedor;
import models.Producto;
import models.Transaccion;
import models.Usuario;

public class dlgCreateTransacciones extends javax.swing.JDialog {

    Usuario u;
    frmTransaccionesMenu parentFrame;
    ArrayList<Transaccion> ts = new ArrayList<>();

    public dlgCreateTransacciones(java.awt.Frame parent, boolean modal, Usuario u, frmTransaccionesMenu parentFrame) {
        super(parent, modal);
        initComponents();
        this.u = u;
        this.parentFrame = parentFrame;
        setLocationRelativeTo(parentFrame);

        //jButtonAgrega
        jButtonAgrega.setUI(new BasicButtonUI());
        jButtonAgrega.addMouseListener(new MouseListener() {
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
                jButtonAgrega.setBackground(Color.decode("#577590"));
                jButtonAgrega.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonAgrega.setBackground(Color.WHITE);
                jButtonAgrega.setForeground(Color.black);
            }
        });
        //jButtonCancelar
        jButtonCancelar.setUI(new BasicButtonUI());
        jButtonCancelar.addMouseListener(new MouseListener() {
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
                jButtonCancelar.setBackground(Color.decode("#F94144"));
                jButtonCancelar.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonCancelar.setBackground(Color.WHITE);
                jButtonCancelar.setForeground(Color.black);
            }
        });
        //jButtonGuardar
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
                jButtonGuardar.setBackground(Color.decode("#90BE6D"));
                jButtonGuardar.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonGuardar.setBackground(Color.WHITE);
                jButtonGuardar.setForeground(Color.black);
            }
        });
        cargaCombobox();

    }

    void cargaCombobox() {
        SwingUtilities.invokeLater(() -> {
            try {
                jComboBoxProveedor.setModel(new dao.DAO_Proveedor().listaProveedores());
            } catch (SQLException ex) {
                Logger.getLogger(dlgUpdateProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    void cargaComboboxProducto(int id) {
        SwingUtilities.invokeLater(() -> {
            try {
                jComboBoxProducto.setModel(new dao.DAO_Producto().listaProductosProveedor(id));
            } catch (SQLException ex) {
                Logger.getLogger(dlgUpdateProveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAgrega = new javax.swing.JButton();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabeltotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear Transacciones");

        jButtonGuardar.setBackground(getBackground());
        jButtonGuardar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setToolTipText("Ingresar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setFocusPainted(false);
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(getBackground());
        jButtonCancelar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Ingresar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jComboBoxProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jComboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Proveedor:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");

        jComboBoxProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Total:");

        jButtonAgrega.setBackground(getBackground());
        jButtonAgrega.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonAgrega.setText("Agregar otro producto");
        jButtonAgrega.setBorder(null);
        jButtonAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregaActionPerformed(evt);
            }
        });

        jTextFieldCantidad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        jLabeltotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabeltotal.setText("  ");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAgrega, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxProveedor, 0, 213, Short.MAX_VALUE)
                                .addComponent(jComboBoxProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCantidad))
                            .addComponent(jLabeltotal))))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabeltotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarSeleccionCombo(javax.swing.JComboBox<?> comboBox, String mensajeError) {
        if (comboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarCampos() {
        // Validación de la selección en los JComboBox
        String cantidad = jTextFieldCantidad.getText().trim();
        try {
            int cantidadInt = Integer.parseInt(cantidad);

            if (cantidadInt < 0) {
                JOptionPane.showMessageDialog(this, "El campo 'Cantidad' no puede ser un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo 'Cantidad' debe contener un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Todos los campos son válidos
    }

    float calculaTotal(int cantidad, float preciocom) {
        return cantidad * preciocom;
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (ts == null) {
            JOptionPane.showMessageDialog(this, "Error, selecciona los parámetros para crear una transacción");
        } else if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText().trim());
            float total = calculaTotal(cantidad, producto.getPreciocom());

            Transaccion t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            ts.add(t);

            try {
                boolean todasLasTransaccionesExitosas = true;

                // Itera sobre cada venta en el carrito
                for (Transaccion transaccion : ts) {
                    boolean resultado = new dao.DAO_Transacciones().createTransaccion(transaccion, u);

                    // Si una venta transaccion falla, marca que no todas fueron exitosas
                    if (!resultado) {
                        todasLasTransaccionesExitosas = false;
                    }
                }

                // Después de procesar todas las ventas
                if (todasLasTransaccionesExitosas) {
                    // Si todas las ventas fueron exitosas, limpiar el carrito
                    JOptionPane.showMessageDialog(this, "Se guardaron las transacciones", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    ts.clear();
                    parentFrame.cargaTabla();
                    limpiacajas();
                } else {
                    // Si al menos una venta falló, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Al menos una transaccion no se pudo guardar. Revise los detalles de la operación.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar guardar las transacciones: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                boolean todasLasTransaccionesExitosas = true;

                // Itera sobre cada venta en el carrito
                for (Transaccion transaccion : ts) {
                    boolean resultado = new dao.DAO_Transacciones().createTransaccion(transaccion, u);

                    // Si una venta transaccion falla, marca que no todas fueron exitosas
                    if (!resultado) {
                        todasLasTransaccionesExitosas = false;
                    }
                }

                // Después de procesar todas las ventas
                if (todasLasTransaccionesExitosas) {
                    // Si todas las ventas fueron exitosas, limpiar el carrito
                    JOptionPane.showMessageDialog(this, "Se guardaron las transacciones", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    ts.clear();
                    parentFrame.cargaTabla();
                    limpiacajas();
                } else {
                    // Si al menos una venta falló, muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Al menos una transaccion no se pudo guardar. Revise los detalles de la operación.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar guardar las transacciones: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void limpiacajas() {
        cargaCombobox();
        jComboBoxProducto.removeAllItems();
        jTextFieldCantidad.setText("");
        jLabeltotal.setText("");
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregaActionPerformed
        if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText().trim());
            float total = calculaTotal(cantidad, producto.getPreciocom());

            Transaccion t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            if (ts.add(t)) {
                JOptionPane.showMessageDialog(this, "Se agregó a la lista");
                limpiacajas();
            }
        }
    }//GEN-LAST:event_jButtonAgregaActionPerformed

    private void jComboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProveedorActionPerformed
        // TODO add your handling code here:
        int id_proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex()).getId();
        cargaComboboxProducto(id_proveedor);
    }//GEN-LAST:event_jComboBoxProveedorActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
        Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
        int cantidad = Integer.parseInt(jTextFieldCantidad.getText().trim());

        float total = calculaTotal(cantidad, producto.getPreciocom());
        jLabeltotal.setText("$" + total);
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    public class LengthLimitDocumentFilter extends DocumentFilter {

        private int maxLength;

        public LengthLimitDocumentFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if ((fb.getDocument().getLength() + string.length()) <= maxLength) {
                super.insertString(fb, offset, string, attr);
            }
        }

        @Override
        public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            int currentLength = fb.getDocument().getLength();
            int newLength = currentLength - length + text.length();
            if (newLength <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgrega;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Producto> jComboBoxProducto;
    private javax.swing.JComboBox<Proveedor> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables

}
