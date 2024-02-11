package gui;

import gui.Usuario.frmUsuariosMenu;
import gui.producto.frmProductosMenu;
import gui.proveedor.frmProveedoresMenu;
import gui.transacciones.frmTransaccionesMenu;
import gui.ventas.frmVentasMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
            jLabel3.setVisible(false);
            jButtonProveedor.setVisible(false);
            jLabel2.setVisible(false);
            jButtonProductos.setVisible(false);
            jLabel6.setVisible(false);
        }

        JButton[] btns = {jButtonUsuarios, jButtonVentas, jButtonProveedor, jButtonTransacciones, jButtonProductos, jButton1, jButton2, jButton3, jButton4};

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
        //cerrar sesion
        jButtonLogout.setUI(new BasicButtonUI());
        jButtonLogout.addMouseListener(new MouseListener() {
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
                jButtonLogout.setBackground(Color.decode("#E23B3E"));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                jButtonLogout.setBackground(Color.WHITE);
            }
        });

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
        jButtonLogout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonUsuarios);

        jLabel6.setFont(jLabel3.getFont());
        jLabel6.setText("Usuarios");
        jPanelSide.add(jLabel6);

        jButtonLogout.setBackground(jPanelSide.getBackground());
        jButtonLogout.setFont(getFont());
        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/salida.png"))); // NOI18N
        jButtonLogout.setToolTipText("Menu usuarios");
        jButtonLogout.setBorder(null);
        jButtonLogout.setBorderPainted(false);
        jButtonLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogout.setFocusPainted(false);
        jButtonLogout.setFocusable(false);
        jButtonLogout.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        jPanelSide.add(jButtonLogout);

        jLabel8.setFont(jLabel3.getFont());
        jLabel8.setText("Cerrar sesion");
        jPanelSide.add(jLabel8);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(getBackground());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36)); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(getBackground());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        jButton1.setBackground(getBackground());
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButton1.setText("Productos criticos de stock");
        jButton1.setBorder(null);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(getBackground());
        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButton2.setText("Productos proximos a criticos de stock");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(getBackground());
        jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButton3.setText("Producto mas vendido");
        jButton3.setBorder(null);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(getBackground());
        jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jButton4.setText("Producto menos vendido");
        jButton4.setBorder(null);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelContenedorLayout.createSequentialGroup()
                        .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 678, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed

        frmUsuariosMenu usuario = new frmUsuariosMenu(u);
        usuario.setVisible(true);
        usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

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

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Object[]> listaProductosCriticos = new dao.DAO_Producto().vista_producto_critico(); // Reemplaza obtenerDatos() con tu lógica

        jPanel1.removeAll();
        // Configurar el layout del panel
        jPanel1.setLayout(new GridLayout(listaProductosCriticos.size(), 2, 10, 10));

        // Iterar sobre la lista de productos críticos y agregar etiquetas al panel
        Font font = new Font("Microsoft YaHei UI", Font.PLAIN, 14);

        for (Object[] producto : listaProductosCriticos) {
            JLabel prod = new JLabel("Nombre: " + producto[0].toString() + ", Stock: " + producto[1].toString());
            prod.setFont(font);
            // Puedes personalizar las propiedades de las etiquetas según tus necesidades
            jPanel1.add(prod);
        }

        // Actualizar la interfaz gráfica
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<Object[]> listaProductosCriticos = new dao.DAO_Producto().vista_producto_recomendable(); // Reemplaza obtenerDatos() con tu lógica

        jPanel1.removeAll();
        // Configurar el layout del panel
        jPanel1.setLayout(new GridLayout(listaProductosCriticos.size(), 2, 10, 10));

        // Iterar sobre la lista de productos críticos y agregar etiquetas al panel
        Font font = new Font("Microsoft YaHei UI", Font.PLAIN, 14);

        for (Object[] producto : listaProductosCriticos) {
            JLabel prod = new JLabel("Nombre: " + producto[0].toString() + ", Stock: " + producto[1].toString());
            prod.setFont(font);
            // Puedes personalizar las propiedades de las etiquetas según tus necesidades
            jPanel1.add(prod);
        }

        // Actualizar la interfaz gráfica
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList<Object[]> listaProductosCriticos = new dao.DAO_Producto().vista_producto_mas_vendido(); // Reemplaza obtenerDatos() con tu lógica

        jPanel1.removeAll();
        // Configurar el layout del panel
        jPanel1.setLayout(new GridLayout(listaProductosCriticos.size(), 2, 10, 10));

        // Iterar sobre la lista de productos críticos y agregar etiquetas al panel
        Font font = new Font("Microsoft YaHei UI", Font.PLAIN, 14);

        for (Object[] producto : listaProductosCriticos) {
            JLabel prod = new JLabel("Nombre: " + producto[0].toString() + ", total vendidos: " + producto[1].toString());
            prod.setFont(font);
            // Puedes personalizar las propiedades de las etiquetas según tus necesidades
            jPanel1.add(prod);
        }

        // Actualizar la interfaz gráfica
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ArrayList<Object[]> listaProductosCriticos = new dao.DAO_Producto().vista_producto_menos_vendido(); // Reemplaza obtenerDatos() con tu lógica

        jPanel1.removeAll();
        // Configurar el layout del panel
        jPanel1.setLayout(new GridLayout(listaProductosCriticos.size(), 2, 10, 10));

        // Iterar sobre la lista de productos críticos y agregar etiquetas al panel
        Font font = new Font("Microsoft YaHei UI", Font.PLAIN, 14);

        for (Object[] producto : listaProductosCriticos) {
            JLabel prod = new JLabel("Nombre: " + producto[0].toString() + ", total vendidos: " + producto[1].toString());
            prod.setFont(font);
            // Puedes personalizar las propiedades de las etiquetas según tus necesidades
            jPanel1.add(prod);
        }

        // Actualizar la interfaz gráfica
        revalidate();
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonLogout;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    // End of variables declaration//GEN-END:variables
}
