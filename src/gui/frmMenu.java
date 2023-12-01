package gui;

import gui.Usuario.frmUsuariosMenu;
import gui.producto.frmProductosMenu;
import gui.proveedor.frmProveedoresMenu;
import gui.transacciones.frmTransaccionesMenu;
import gui.ventas.frmVentasMenu;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicButtonUI;
import models.Usuario;

public class frmMenu extends javax.swing.JFrame {

    Usuario u;

    public frmMenu(Usuario u) {
        initComponents();
        this.u = u;
        setLocationRelativeTo(null);

        if (u.isTipo_admin() == false) {
            jButtonUsuarios.setVisible(false);
            jButtonProveedor.setVisible(false);
            jButtonProductos.setVisible(false);
        }

        JButton[] btns = {jButtonUsuarios, jButtonVentas, jButtonProveedor, jButtonTransacciones, jButtonProductos};

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

        jLabel1.setText("Bienvenido " + u.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButtonProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonProveedor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonTransacciones = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonVentas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonUsuarios = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jPanelSide.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSide.setPreferredSize(new java.awt.Dimension(100, 0));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/logo.jpg"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanelSide.add(jLabel7);

        jButtonProductos.setBackground(jPanelSide.getBackground());
        jButtonProductos.setFont(getFont());
        jButtonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/cesta-de-la-compra.png"))); // NOI18N
        jButtonProductos.setToolTipText("Menu Productos");
        jButtonProductos.setBorder(null);
        jButtonProductos.setBorderPainted(false);
        jButtonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProductos.setFocusPainted(false);
        jButtonProductos.setFocusable(false);
        jButtonProductos.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonProductosMouseEntered(evt);
            }
        });
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonProductos);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel3.setText("Productos");
        jPanelSide.add(jLabel3);

        jButtonProveedor.setBackground(jPanelSide.getBackground());
        jButtonProveedor.setFont(getFont());
        jButtonProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/proovedores.png"))); // NOI18N
        jButtonProveedor.setToolTipText("Menu Proveedores");
        jButtonProveedor.setBorder(null);
        jButtonProveedor.setBorderPainted(false);
        jButtonProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonProveedor.setFocusPainted(false);
        jButtonProveedor.setFocusable(false);
        jButtonProveedor.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonProveedorMouseEntered(evt);
            }
        });
        jButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedorActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonProveedor);

        jLabel2.setFont(jLabel3.getFont());
        jLabel2.setText("Proovedores");
        jPanelSide.add(jLabel2);

        jButtonTransacciones.setBackground(jPanelSide.getBackground());
        jButtonTransacciones.setFont(getFont());
        jButtonTransacciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/lado-del-camion.png"))); // NOI18N
        jButtonTransacciones.setToolTipText("Menu Transacciones");
        jButtonTransacciones.setBorder(null);
        jButtonTransacciones.setBorderPainted(false);
        jButtonTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonTransacciones.setFocusPainted(false);
        jButtonTransacciones.setFocusable(false);
        jButtonTransacciones.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonTransacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTransaccionesMouseEntered(evt);
            }
        });
        jButtonTransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransaccionesActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonTransacciones);

        jLabel4.setFont(jLabel3.getFont());
        jLabel4.setText("Transacciones");
        jPanelSide.add(jLabel4);

        jButtonVentas.setBackground(jPanelSide.getBackground());
        jButtonVentas.setFont(getFont());
        jButtonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/carrito-de-compras.png"))); // NOI18N
        jButtonVentas.setToolTipText("Menu ventas");
        jButtonVentas.setBorder(null);
        jButtonVentas.setBorderPainted(false);
        jButtonVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonVentas.setFocusPainted(false);
        jButtonVentas.setFocusable(false);
        jButtonVentas.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonVentasMouseEntered(evt);
            }
        });
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonVentas);

        jLabel5.setFont(jLabel3.getFont());
        jLabel5.setText("Ventas");
        jPanelSide.add(jLabel5);

        jButtonUsuarios.setBackground(jPanelSide.getBackground());
        jButtonUsuarios.setFont(getFont());
        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/usuarios-alt.png"))); // NOI18N
        jButtonUsuarios.setToolTipText("Menu usuarios");
        jButtonUsuarios.setBorder(null);
        jButtonUsuarios.setBorderPainted(false);
        jButtonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonUsuarios.setFocusPainted(false);
        jButtonUsuarios.setFocusable(false);
        jButtonUsuarios.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonUsuariosMouseEntered(evt);
            }
        });
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonUsuarios);

        jLabel6.setFont(jLabel3.getFont());
        jLabel6.setText("Usuarios");
        jPanelSide.add(jLabel6);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(777, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProductosMouseEntered

    }//GEN-LAST:event_jButtonProductosMouseEntered

    private void jButtonProveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProveedorMouseEntered

    }//GEN-LAST:event_jButtonProveedorMouseEntered

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed

        frmUsuariosMenu usuario = new frmUsuariosMenu(u);
        usuario.setVisible(true);
        usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUsuariosMouseEntered

    }//GEN-LAST:event_jButtonUsuariosMouseEntered

    private void jButtonTransaccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTransaccionesMouseEntered

    }//GEN-LAST:event_jButtonTransaccionesMouseEntered

    private void jButtonVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVentasMouseEntered

    }//GEN-LAST:event_jButtonVentasMouseEntered

    private void jButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedorActionPerformed

        frmProveedoresMenu proveedor = new frmProveedoresMenu(u);
        proveedor.setVisible(true);
        proveedor.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonProveedorActionPerformed

    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed

        frmProductosMenu productos = new frmProductosMenu(u);
        productos.setVisible(true);
        productos.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jButtonTransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransaccionesActionPerformed

        frmTransaccionesMenu transacciones = new frmTransaccionesMenu(u);
        transacciones.setVisible(true);
        transacciones.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonTransaccionesActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed

        frmVentasMenu ventas = new frmVentasMenu(u);
        ventas.setVisible(true);
        ventas.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonVentasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonProveedor;
    private javax.swing.JButton jButtonTransacciones;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JButton jButtonVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    // End of variables declaration//GEN-END:variables
}
