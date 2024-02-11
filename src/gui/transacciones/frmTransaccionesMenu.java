package gui.transacciones;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import models.Transaccion;
import models.Usuario;

public class frmTransaccionesMenu extends javax.swing.JFrame {
    
    Usuario u;
    Transaccion t;
    
    public frmTransaccionesMenu(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(this);
        if (u.isTipo_admin() == false) {
            jButton7.setVisible(false);
            jLabel6.setVisible(false);
        }
        
        JButton[] btns = {jButton5, jButton6, jButton7};
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
                    btn.setBackground(Color.decode("#F8A63A"));
                    
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(Color.WHITE);
                }
            });
        }
        cargaTabla();
    }
    
    void cargaTabla() {
        SwingUtilities.invokeLater(() -> {
            try {
                jTable1.setModel(new dao.DAO_Transacciones().tablaTransacciones());
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex);
            }
        });
        ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public Transaccion obtenerTransaccionSeleccionada() {
        int filaSeleccionada = jTable1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        if (filaSeleccionada != -1) {
            Transaccion transaccion = new Transaccion();
            
            transaccion.setId((int) modelo.getValueAt(filaSeleccionada, 0));
            transaccion.setProveedor((String) modelo.getValueAt(filaSeleccionada, 1));
            transaccion.setProducto((String) modelo.getValueAt(filaSeleccionada, 2));
            transaccion.setCantidad((int) modelo.getValueAt(filaSeleccionada, 3));
            transaccion.setTotal((float) modelo.getValueAt(filaSeleccionada, 4));
            transaccion.setFecha((String) modelo.getValueAt(filaSeleccionada, 5));
            transaccion.setId_producto((int) modelo.getValueAt(filaSeleccionada, 6));
            transaccion.setId_proveedor((int) modelo.getValueAt(filaSeleccionada, 7));
            return transaccion;
        } else {
            // No se ha seleccionado ninguna fila
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N

        jPanelSide.setBackground(getBackground());
        jPanelSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButton5.setBackground(getBackground());
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/agregar-usuario.png"))); // NOI18N
        jButton5.setToolTipText("Crear");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton5);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel4.setText("Crear");
        jPanelSide.add(jLabel4);

        jButton6.setBackground(getBackground());
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/actualizar.png"))); // NOI18N
        jButton6.setToolTipText("Crear");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton6);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel5.setText("Actualizar");
        jPanelSide.add(jLabel5);

        jButton7.setBackground(getBackground());
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/basura.png"))); // NOI18N
        jButton7.setToolTipText("Crear");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton7);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel6.setText("Borrar");
        jPanelSide.add(jLabel6);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Menu Transacciones");

        jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Transacciones registradas en plataforma");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 256, Short.MAX_VALUE))
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        t = obtenerTransaccionSeleccionada();
        if (t == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una transaccion de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UIManager.put("OptionPane.yesButtonText", "Eliminar");
            UIManager.put("OptionPane.noButtonText", "Cancelar");
            
            int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la: " + t + "?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (response == JOptionPane.YES_OPTION) {
                new dao.DAO_Transacciones().deleteTransaccion(t, u);
                cargaTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Operacion cancelada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        t = obtenerTransaccionSeleccionada();
        if (t == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una Transaccion.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new dlgUpdateTransacciones(this, rootPaneCheckingEnabled, u, this, t).setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new dlgCreateTransacciones(this, rootPaneCheckingEnabled, u, this).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
    }//GEN-LAST:event_jButton5MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
