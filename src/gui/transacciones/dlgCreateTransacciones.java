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
        JButton[] btns = {jButtonCancelar, jButtonGuardar, jButtonAgrega};
        for (JButton btn : btns) {
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
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
                    btn.setBackground(new Color(188, 163, 127));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(234, 215, 187));
                }
            });
        }
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
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        jPanelContenedor.setBackground(new java.awt.Color(234, 215, 187));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Create Transacciones");

        jButtonGuardar.setFont(getFont());
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/controlar.png"))); // NOI18N
        jButtonGuardar.setToolTipText("Ingresar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setBorderPainted(false);
        jButtonGuardar.setFocusPainted(false);
        jButtonGuardar.setFocusable(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(getFont());
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/cruz.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Ingresar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.setBorderPainted(false);
        jButtonCancelar.setFocusPainted(false);
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jComboBoxProveedor.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona un proveedor:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Selecciona un producto:");

        jComboBoxProducto.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Selecciona una cantidad:");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Ingresa un total:");

        jButtonAgrega.setFont(jLabel3.getFont());
        jButtonAgrega.setText("Agregar otro producto");
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
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 186, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxProducto, 0, 213, Short.MAX_VALUE)
                                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTotal)
                                    .addComponent(jButtonAgrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAgrega)
                .addGap(50, 50, 50)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (ts == null) {
            JOptionPane.showMessageDialog(this, "Error, selecciona los parametros para crear una transaccion");
        } else if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = (int) jSpinnerCantidad.getValue();
            float total = Float.parseFloat(jTextFieldTotal.getText());

            Transaccion t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            ts.add(t);
        }
        if (new dao.DAO_Transacciones().createTransaccion(ts, u)) {
            JOptionPane.showMessageDialog(this, "Se creo la Transaccion");
            limpiacajas();
            parentFrame.cargaTabla();
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
        Transaccion t;
        if (validarCampos()) {
            Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
            Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
            int cantidad = (int) jSpinnerCantidad.getValue();
            float total = Float.parseFloat(jTextFieldTotal.getText());

            t = new Transaccion(proveedor.getId(), producto.getId(), cantidad, total);

            if (ts.add(t)) {
                JOptionPane.showMessageDialog(this, "Se agrego a la lista");
                limpiacajas();
            }
        }


    }//GEN-LAST:event_jButtonAgregaActionPerformed

    private boolean validarCampos() {
        Proveedor proveedor = jComboBoxProveedor.getItemAt(jComboBoxProveedor.getSelectedIndex());
        Producto producto = jComboBoxProducto.getItemAt(jComboBoxProducto.getSelectedIndex());
        int cantidad = (int) jSpinnerCantidad.getValue();
        String totalText = jTextFieldTotal.getText();

        if (proveedor == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (producto == null) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            float total = Float.parseFloat(totalText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El total debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Todos los campos son válidos
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
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

}
