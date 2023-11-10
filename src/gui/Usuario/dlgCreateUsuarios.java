package gui.Usuario;

import dao.DAO_Usuario;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Usuario;
import utilities.Encriptador;
import utilities.StringToNumberConverter;

public class dlgCreateUsuarios extends javax.swing.JDialog {

    Usuario u;
    frmUsuariosMenu parentFrame;

    public dlgCreateUsuarios(java.awt.Frame parent, boolean modal, Usuario u, frmUsuariosMenu parentFrame) {
        super(parent, modal);
        initComponents();
        this.u = u;
        this.parentFrame = parentFrame;
        setLocationRelativeTo(parentFrame);
        ((AbstractDocument) jTextFieldTelefono.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(10));

        JButton[] btns = {jButton1, jButtonCancelar, jButtonGuardar};
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxAdministrador = new javax.swing.JCheckBox();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        jPanelContenedor.setBackground(new java.awt.Color(234, 215, 187));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Create Usuarios");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(jLabel3.getFont());
        jLabel4.setText("Telefono:");

        jTextFieldTelefono.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jTextFieldNombre.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jLabel5.setFont(jLabel3.getFont());
        jLabel5.setText("Cuenta:");

        jTextFieldCuenta.setEditable(false);
        jTextFieldCuenta.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(234, 215, 187));
        jButton1.setFont(jLabel3.getFont());
        jButton1.setText("Genera Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(jLabel3.getFont());
        jLabel6.setText("Contraseña: ");

        jCheckBoxAdministrador.setFont(jLabel3.getFont());
        jCheckBoxAdministrador.setText("Administrador");

        jTextFieldContraseña.setEditable(false);
        jTextFieldContraseña.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jButtonGuardar.setBackground(new java.awt.Color(234, 215, 187));
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

        jButtonCancelar.setBackground(new java.awt.Color(234, 215, 187));
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

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAdministrador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCuenta))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldTelefono))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldContraseña))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxAdministrador)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCampos() {
        String nombre = jTextFieldNombre.getText().trim();
        String telefono = jTextFieldTelefono.getText().trim();
        String cuenta = jTextFieldCuenta.getText().trim();
        String contraseña = jTextFieldContraseña.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "Nombre inválido. Debe contener solo letras y espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Teléfono' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarTelefono(telefono)) {
            JOptionPane.showMessageDialog(this, "Número de teléfono inválido. Debe contener 10 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (cuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Cuenta' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Contraseña' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean validarNombre(String nombre) {
        // Puedes personalizar esta validación según tus criterios específicos
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s]+");
    }

    private boolean validarTelefono(String telefono) {
        // Validar que el número de teléfono tenga exactamente 10 dígitos
        return telefono.matches("\\d{10}");
    }

    private boolean validarCamposCuenta() {
        String nombre = jTextFieldNombre.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!validarNombre(nombre)) {
            JOptionPane.showMessageDialog(this, "Nombre inválido. Debe contener solo letras y espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validarCamposCuenta()) {
            String nombre = jTextFieldNombre.getText().toUpperCase();
            String cuenta = String.valueOf(StringToNumberConverter.convertToNumber(nombre));
            String contraseña = Encriptador.encriptar(cuenta);

            jTextFieldCuenta.setText(cuenta);
            jTextFieldContraseña.setText(contraseña);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (validarCampos()) {
            String nombre = jTextFieldNombre.getText();
            String telefono = jTextFieldTelefono.getText();
            int cuenta = Integer.parseInt(jTextFieldCuenta.getText());
            String contraseña = jTextFieldContraseña.getText();
            boolean administrador = jCheckBoxAdministrador.isSelected();

            if (new DAO_Usuario().createUsuario(new Usuario(cuenta, nombre, telefono, contraseña, administrador), u)) {
                JOptionPane.showMessageDialog(this, "Se creó el usuario", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                limpiacajas();
                parentFrame.cargaTabla();
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void limpiacajas() {
        jTextFieldContraseña.setText("");
        jTextFieldCuenta.setText("");
        jTextFieldNombre.setText("");
        jTextFieldTelefono.setText("");
        jCheckBoxAdministrador.setSelected(false);
    }
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JCheckBox jCheckBoxAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCuenta;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

}
