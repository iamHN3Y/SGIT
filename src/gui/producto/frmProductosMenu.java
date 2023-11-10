package gui.producto;

import dao.DAO_Producto;
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
import models.Producto;
import models.Usuario;

public class frmProductosMenu extends javax.swing.JFrame {

    Usuario u;
    Producto p;

    public frmProductosMenu(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(this);
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
                    btn.setBackground(new Color(188, 163, 127));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(255, 242, 216));
                    jLabel2.setText("                   ");
                }
            });
        }
        cargaTabla();
    }

    void cargaTabla() {
        SwingUtilities.invokeLater(() -> {
            try {
                jTable1.setModel(new dao.DAO_Producto().tablaProductos());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex);
            }
        });
        ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public Producto obtenerProductoSeleccionado() {
        int filaSeleccionada = jTable1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        if (filaSeleccionada != -1) {
            Producto p = new Producto();

            p.setId((int) modelo.getValueAt(filaSeleccionada, 0));
            p.setNombre((String) modelo.getValueAt(filaSeleccionada, 1));
            p.setDescripcion((String) modelo.getValueAt(filaSeleccionada, 2));
            p.setPrecio((float) modelo.getValueAt(filaSeleccionada, 3));
            p.setStock((int) modelo.getValueAt(filaSeleccionada, 4));
            return p;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N

        jPanelSide.setBackground(new java.awt.Color(255, 242, 216));
        jPanelSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButton5.setBackground(new java.awt.Color(255, 242, 216));
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

        jButton6.setBackground(new java.awt.Color(255, 242, 216));
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

        jButton7.setBackground(new java.awt.Color(255, 242, 216));
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

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel2.setText("           ");
        jPanelSide.add(jLabel2);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(new java.awt.Color(234, 215, 187));

        jLabel1.setFont(getFont());
        jLabel1.setText("Menu productos");

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

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        jLabel3.setText("productos activos en plataforma");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered

        jLabel2.setText("Crear Productos");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new dlgCreateProducto(this, rootPaneCheckingEnabled, u, this).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jLabel2.setText("Actualizar Productos");
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        p = obtenerProductoSeleccionado();
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new dlgUpdateProducto(this, rootPaneCheckingEnabled, u, this, p).setVisible(true);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jLabel2.setText("Eliminar Productos");
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        p = obtenerProductoSeleccionado();
        if (p == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un producto de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UIManager.put("OptionPane.yesButtonText", "Eliminar");
            UIManager.put("OptionPane.noButtonText", "Cancelar");

            int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el producto: " + p.getNombre() + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                new DAO_Producto().deleteProducto(p.getId(), u);
                cargaTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Operacion cancelada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
