package gui.transacciones;

import gui.proveedor.dlgUpdateProveedor;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Proveedor;
import models.Producto;
import models.Transaccion;
import models.Usuario;

public class dlgUpdateTransacciones extends javax.swing.JDialog {

    Usuario u;
    frmTransaccionesMenu parentFrame;
    Transaccion t, nt;

    public dlgUpdateTransacciones(java.awt.Frame parent, boolean modal, Usuario u, frmTransaccionesMenu parentFrame, Transaccion t) {
        super(parent, modal);
        initComponents();
        this.u = u;
        this.t = t;
        this.parentFrame = parentFrame;
        setLocationRelativeTo(this);

        ((AbstractDocument) jTextFieldTotal.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(9));
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
        SpinnerNumberModel spinnermodel = new SpinnerNumberModel(t.getCantidad(), 0, 10000, 1);
        jSpinnerCantidad.setModel(spinnermodel);
        cargaCombobox();
    }

    void cargaCombobox() {
        SwingUtilities.invokeLater(() -> {
            try {
                jComboBoxProveedor.setModel(new dao.DAO_Proveedor().listaProveedores());
                jComboBoxProducto.setModel(new dao.DAO_Producto().listaProductos());

                jTextFieldid.setText(String.valueOf(t.getId()));
                Producto p = new dao.DAO_Producto().readProducto(t.getId_producto());
                jComboBoxProducto.getModel().setSelectedItem(p);

                Proveedor pr = new dao.DAO_Proveedor().readProveedor(t.getId_proveedor());
                jComboBoxProveedor.getModel().setSelectedItem(pr);

                jTextFieldTotal.setText(String.valueOf(t.getTotal()));
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
        jLabel6 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(495, 385));

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Update Transacciones");

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
        jComboBoxProveedor.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Proveedor:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Producto:");

        jComboBoxProducto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jComboBoxProducto.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad:");

        jSpinnerCantidad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Total:");

        jTextFieldTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel6.setText("ID:");

        jTextFieldid.setEditable(false);
        jTextFieldid.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(39, 39, 39)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (validarCampos()) {
            int cantidad = (int) jSpinnerCantidad.getValue();
            float total = Float.parseFloat(jTextFieldTotal.getText());
            nt = new Transaccion(t.getId(), t.getId_proveedor(), t.getId_producto(), cantidad, total);
        }
        if (new dao.DAO_Transacciones().updateTransaccion(nt, t, u)) {
            JOptionPane.showMessageDialog(this, "Se actualizo la Transaccion");
            parentFrame.cargaTabla();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private boolean validarCampos() {
        int cantidad = (int) jSpinnerCantidad.getValue();
        String totalText = jTextFieldTotal.getText();

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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Producto> jComboBoxProducto;
    private javax.swing.JComboBox<Proveedor> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldid;
    // End of variables declaration//GEN-END:variables

}
