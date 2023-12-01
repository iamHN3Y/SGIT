package gui.transacciones;

import gui.proveedor.dlgUpdateProveedor;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;
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
        setLocationRelativeTo(this);
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

        SpinnerNumberModel spinnermodel = new SpinnerNumberModel(0, 0, 10000, 1);
        jSpinnerCantidad.setModel(spinnermodel);
        cargaCombobox();
    }

    void cargaCombobox() {
        SwingUtilities.invokeLater(() -> {
            try {
                jComboBoxProveedor.setModel(new dao.DAO_Proveedor().listaProveedores());
                jComboBoxProducto.setModel(new dao.DAO_Producto().listaProductos());
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
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonAgrega = new javax.swing.JButton();

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

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Proveedor:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");

        jComboBoxProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        jSpinnerCantidad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Total:");

        jTextFieldTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jButtonAgrega.setBackground(getBackground());
        jButtonAgrega.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonAgrega.setText("Agregar otro producto");
        jButtonAgrega.setBorder(null);
        jButtonAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
        if (!validarSeleccionCombo(jComboBoxProveedor, "Por favor, seleccione un proveedor.")) {
            return false;
        }

        if (!validarSeleccionCombo(jComboBoxProducto, "Por favor, seleccione un producto.")) {
            return false;
        }

        // Validación de la cantidad
        int cantidad = (int) jSpinnerCantidad.getValue();
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validación del campo jTextFieldTotal
        String totalText = jTextFieldTotal.getText().trim();
        if (totalText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo total no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            float total = Float.parseFloat(totalText);
            if (total < 0) {
                JOptionPane.showMessageDialog(this, "El campo 'Precio' no puede ser un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El total debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Todos los campos son válidos
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (ts == null) {
            JOptionPane.showMessageDialog(this, "Error, selecciona los parámetros para crear una transacción");
        } else if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = (int) jSpinnerCantidad.getValue();
            float total = Float.parseFloat(jTextFieldTotal.getText().trim());

            Transaccion t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            ts.add(t);

            if (new dao.DAO_Transacciones().createTransaccion(ts, u)) {
                JOptionPane.showMessageDialog(this, "Se creó la Transacción");
                limpiacajas();
                parentFrame.cargaTabla();
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void limpiacajas() {
        jComboBoxProveedor.setSelectedIndex(0);
        jComboBoxProducto.setSelectedIndex(0);
        jSpinnerCantidad.setValue(0);
        jTextFieldTotal.setText("");
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregaActionPerformed
        if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = (int) jSpinnerCantidad.getValue();
            float total = Float.parseFloat(jTextFieldTotal.getText());

            Transaccion t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            if (ts.add(t)) {
                JOptionPane.showMessageDialog(this, "Se agregó a la lista");
                limpiacajas();
            }
        }
    }//GEN-LAST:event_jButtonAgregaActionPerformed

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
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

}
