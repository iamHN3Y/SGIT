package gui.proveedor;

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
import models.Proveedor;
import models.Usuario;

public class dlgCreateProovedores extends javax.swing.JDialog {

    Usuario u;
    frmProveedoresMenu parentFrame;

    public dlgCreateProovedores(java.awt.Frame parent, boolean modal, Usuario u, frmProveedoresMenu parentFrame) {
        super(parent, modal);
        initComponents();
        this.u = u;
        this.parentFrame = parentFrame;
        setLocationRelativeTo(this);
        ((AbstractDocument) jTextFieldNombre.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(50));
        ((AbstractDocument) jTextFieldDireccion.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(150));
        ((AbstractDocument) jTextFieldTelefono1.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(10));
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldTelefono1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear proveedores");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Telefono:");

        jTextFieldDireccion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jTextFieldNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Direccion:");

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

        jTextFieldTelefono1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addGap(30, 30, 30)
                                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTelefono1)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCampos() {
        // Validar que los campos no estén vacíos
        if (jTextFieldNombre.getText().trim().isEmpty() || jTextFieldTelefono1.getText().trim().isEmpty() || jTextFieldDireccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que jTextFieldNombre sea un nombre
        if (!validarNombre(jTextFieldNombre.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre válido.", "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar que jTextFieldTelefono1 sea un número de máximo 10 caracteres
        if (!validarTelefono(jTextFieldTelefono1.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de teléfono válido (máximo 10 caracteres numéricos).", "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private boolean validarNombre(String nombre) {
        // Puedes personalizar esta lógica según tus requisitos
        // Por ejemplo, aquí se valida que solo contenga letras y espacios
        return nombre.matches("[a-zA-Z ]+");
    }

    private boolean validarTelefono(String telefono) {
        // Puedes personalizar esta lógica según tus requisitos
        // Aquí se valida que sea un número y tenga máximo 10 caracteres
        return telefono.matches("\\d{1,10}");
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (validarCampos()) {
            String nombre = jTextFieldNombre.getText().trim();
            String telefono = jTextFieldTelefono1.getText().trim();
            String direccion = jTextFieldDireccion.getText().trim();
            Proveedor p = new Proveedor(nombre, telefono, direccion);
            if (new dao.DAO_Proveedor().createProveedor(p, u)) {
                JOptionPane.showMessageDialog(this, "Se creo el proveedor");
                limpiacajas();
                parentFrame.cargaTabla();
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void limpiacajas() {
        jTextFieldNombre.setText("");
        jTextFieldTelefono1.setText("");
        jTextFieldDireccion.setText("");
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono1;
    // End of variables declaration//GEN-END:variables

}
