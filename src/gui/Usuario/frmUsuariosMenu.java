package gui.Usuario;

import dao.DAO_Usuario;
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
import models.Usuario;

public class frmUsuariosMenu extends javax.swing.JFrame {

    Usuario u, vu;

    public frmUsuariosMenu(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(null);
        JButton[] btns = {jButtonCrear, jButtonActualizar, jButtonBorrar};
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
                jTable1.setModel(new dao.DAO_Usuario().tablaUsuarios());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex);
            }
        });
        ListSelectionModel selectionModel = jTable1.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public Usuario obtenerUsuarioSeleccionado() {
        int filaSeleccionada = jTable1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        if (filaSeleccionada != -1) {
            Usuario u = new Usuario();

            u.setNombre((String) modelo.getValueAt(filaSeleccionada, 0));
            u.setTelefono((String) modelo.getValueAt(filaSeleccionada, 1));
            u.setCuenta((int) modelo.getValueAt(filaSeleccionada, 2));
            u.setContraseña((String) modelo.getValueAt(filaSeleccionada, 3));
            if (modelo.getValueAt(filaSeleccionada, 4) == "Administrador") {
                u.setTipo_admin(true);
            } else {
                u.setTipo_admin(false);
            }
            return u;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jButtonCrear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 550));

        jPanelSide.setBackground(getBackground());
        jPanelSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButtonCrear.setBackground(getBackground());
        jButtonCrear.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/agregar-usuario.png"))); // NOI18N
        jButtonCrear.setToolTipText("Crear");
        jButtonCrear.setBorder(null);
        jButtonCrear.setBorderPainted(false);
        jButtonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCrear.setFocusPainted(false);
        jButtonCrear.setFocusable(false);
        jButtonCrear.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonCrearMouseEntered(evt);
            }
        });
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonCrear);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear");
        jPanelSide.add(jLabel4);

        jButtonActualizar.setBackground(getBackground());
        jButtonActualizar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/actualizar.png"))); // NOI18N
        jButtonActualizar.setToolTipText("Crear");
        jButtonActualizar.setBorder(null);
        jButtonActualizar.setBorderPainted(false);
        jButtonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonActualizar.setFocusPainted(false);
        jButtonActualizar.setFocusable(false);
        jButtonActualizar.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseEntered(evt);
            }
        });
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonActualizar);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar");
        jPanelSide.add(jLabel5);

        jButtonBorrar.setBackground(getBackground());
        jButtonBorrar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButtonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/basura.png"))); // NOI18N
        jButtonBorrar.setToolTipText("Crear");
        jButtonBorrar.setBorder(null);
        jButtonBorrar.setBorderPainted(false);
        jButtonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBorrar.setFocusPainted(false);
        jButtonBorrar.setFocusable(false);
        jButtonBorrar.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBorrarMouseEntered(evt);
            }
        });
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonBorrar);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Borrar");
        jPanelSide.add(jLabel6);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Menu Usuarios");

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
        jLabel3.setText("Usuarios activos en plataforma");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCrearMouseEntered

    }//GEN-LAST:event_jButtonCrearMouseEntered

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        new dlgCreateUsuarios(this, rootPaneCheckingEnabled, u, this).setVisible(true);
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseEntered

    }//GEN-LAST:event_jButtonActualizarMouseEntered

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        vu = obtenerUsuarioSeleccionado();
        if (vu == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new dlgUpdateUsuarios(this, rootPaneCheckingEnabled, u, this, vu).setVisible(true);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarMouseEntered

    }//GEN-LAST:event_jButtonBorrarMouseEntered

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        vu = obtenerUsuarioSeleccionado();
        if (vu == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un usuario de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UIManager.put("OptionPane.yesButtonText", "Eliminar");
            UIManager.put("OptionPane.noButtonText", "Cancelar");

            int response = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el usuario: " + vu + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                new DAO_Usuario().deleteUsuario(vu.getCuenta(), u);
                cargaTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Operacion cancelada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCrear;
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
