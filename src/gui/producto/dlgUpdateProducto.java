package gui.producto;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import models.Producto;
import models.Proveedor;
import models.Stock;
import models.Usuario;

public class dlgUpdateProducto extends javax.swing.JDialog {
    
    Usuario u;
    frmProductosMenu parentFrame;
    Producto p;
    
    public dlgUpdateProducto(java.awt.Frame parent, boolean modal, Usuario u, frmProductosMenu parentFrame, Producto p) {
        super(parent, modal);
        initComponents();
        this.u = u;
        this.p = p;
        this.parentFrame = parentFrame;
        setLocationRelativeTo(parentFrame);
        
        ((AbstractDocument) jTextFieldNombre.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(50));
        ((AbstractDocument) jTextAreaDescripcion.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(150));
        ((AbstractDocument) jTextFieldPrecio.getDocument()).setDocumentFilter(new LengthLimitDocumentFilter(9));

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
        
        cargaCajas();
    }
    
    void cargaCajas() {
        SwingUtilities.invokeLater(() -> {
            try {
                jComboBoxProveedor.setModel(new dao.DAO_Proveedor().listaProveedores());
                Proveedor prov = new dao.DAO_Proveedor().readProveedor(p.getId_proveedor());
                jComboBoxProveedor.getModel().setSelectedItem(prov);
            } catch (SQLException ex) {
                Logger.getLogger(dlgUpdateProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            jTextFieldID.setText(String.valueOf(p.getId()));
            jTextFieldNombre.setText(p.getNombre());
            jTextAreaDescripcion.setText(p.getDescripcion());
            jTextFieldPrecio.setText(String.valueOf(p.getPrecio()));
            jTextFieldCantidad.setText(String.valueOf(p.getStock()));
            jTextFieldPreciocom.setText(String.valueOf(p.getPreciocom()));
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jTextFieldPreciocom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar productos");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jTextFieldNombre.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

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

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel7.setText("id:");

        jTextFieldID.setEditable(false);
        jTextFieldID.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextFieldID.setEnabled(false);

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setPreferredSize(new java.awt.Dimension(250, 99));
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel8.setText("Precio:");

        jTextFieldPrecio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad:");

        jTextFieldCantidad.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel10.setText("Proveedor:");

        jComboBoxProveedor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jComboBoxProveedor.setEnabled(false);
        jComboBoxProveedor.setFocusable(false);
        jComboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveedorActionPerformed(evt);
            }
        });

        jTextFieldPreciocom.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel11.setText("Precio compra:");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPreciocom)
                            .addComponent(jTextFieldPrecio)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldID)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldCantidad))
                        .addGap(47, 47, 47))))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreciocom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarCampos() {
        String nombre = jTextFieldNombre.getText().trim();
        String descripcion = jTextAreaDescripcion.getText().trim();
        String precio = jTextFieldPrecio.getText().trim();
        String cantidad = jTextFieldCantidad.getText().trim();
        String preciocom = jTextFieldPreciocom.getText().trim();
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!nombre.matches("[a-zA-Z\\sáéíóúÁÉÍÓÚ]+")) {
            JOptionPane.showMessageDialog(this, "El campo 'Nombre' solo puede contener caracteres alfabéticos y espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (descripcion.length() > 255) {
            JOptionPane.showMessageDialog(this, "La descripción no puede exceder los 255 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!descripcion.matches("[a-zA-Z0-9 ]*")) {
            JOptionPane.showMessageDialog(this, "La descripción solo puede contener caracteres alfanuméricos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            float precioFloat = Float.parseFloat(precio);
            
            if (precioFloat < 0) {
                JOptionPane.showMessageDialog(this, "El campo 'Precio' no puede ser un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo 'Precio' debe contener un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            float precioFloat = Float.parseFloat(preciocom);
            
            if (precioFloat < 0) {
                JOptionPane.showMessageDialog(this, "El campo 'Precio compra' no puede ser un número negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo 'Precio compra' debe contener un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
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

        // Puedes agregar más reglas de validación según tus necesidades
        return true;
    }

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        if (validarCampos()) {
            int id = p.getId();
            String nombre = jTextFieldNombre.getText().trim();
            String descripcion = jTextAreaDescripcion.getText().trim();
            String precio = jTextFieldPrecio.getText().trim();
            int stock = Integer.parseInt(jTextFieldCantidad.getText().trim());
            Float preciocom = Float.valueOf(jTextFieldPreciocom.getText().trim());
            
            Producto product = new Producto(id, nombre, descripcion, Float.parseFloat(precio), p.getId_proveedor(), preciocom);
            Stock s = new Stock(id, stock);
            
            if (new dao.DAO_Producto().updateProducto(product, u, s)) {
                JOptionPane.showMessageDialog(this, "Se actualizo el Producto");
                parentFrame.cargaTabla();
                this.dispose();
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProveedorActionPerformed
    
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
    private javax.swing.JComboBox<Proveedor> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldPreciocom;
    // End of variables declaration//GEN-END:variables

}
