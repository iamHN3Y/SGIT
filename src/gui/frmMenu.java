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

        JButton[] btns = {jButton1, jButton2, jButton3, jButton4, jButton5};
        if (u.isTipo_admin() == false) {
            jButton1.setVisible(false);
            jButton3.setVisible(false);
            jButton5.setVisible(false);
        }

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
                    jLabel2.setText("           ");
                }
            });
        }

        jLabel1.setText("Bienvenido " + u.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSide = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 242, 216));
        setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N

        jPanelSide.setBackground(new java.awt.Color(255, 242, 216));
        jPanelSide.setPreferredSize(new java.awt.Dimension(90, 0));

        jButton5.setBackground(getBackground());
        jButton5.setFont(getFont());
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/cesta-de-la-compra.png"))); // NOI18N
        jButton5.setToolTipText("Menu Productos");
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

        jButton3.setBackground(getBackground());
        jButton3.setFont(getFont());
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/proovedores.png"))); // NOI18N
        jButton3.setToolTipText("Menu Proveedores");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton3);

        jButton4.setBackground(getBackground());
        jButton4.setFont(getFont());
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/lado-del-camion.png"))); // NOI18N
        jButton4.setToolTipText("Menu Transacciones");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton4);

        jButton2.setBackground(getBackground());
        jButton2.setFont(getFont());
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/carrito-de-compras.png"))); // NOI18N
        jButton2.setToolTipText("Menu ventas");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton2);

        jButton1.setBackground(getBackground());
        jButton1.setFont(getFont());
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/usuarios-alt.png"))); // NOI18N
        jButton1.setToolTipText("Menu usuarios");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelSide.add(jButton1);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jLabel2.setText("           ");
        jPanelSide.add(jLabel2);

        getContentPane().add(jPanelSide, java.awt.BorderLayout.WEST);

        jPanelContenedor.setBackground(new java.awt.Color(234, 215, 187));

        jLabel1.setFont(getFont());
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelContenedorLayout = new javax.swing.GroupLayout(jPanelContenedor);
        jPanelContenedor.setLayout(jPanelContenedorLayout);
        jPanelContenedorLayout.setHorizontalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanelContenedorLayout.setVerticalGroup(
            jPanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelContenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered

        jLabel2.setText("Productos");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered

        jLabel2.setText("Proveedores");
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        frmUsuariosMenu usuario = new frmUsuariosMenu(u);
        usuario.setVisible(true);
        usuario.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered

        jLabel2.setText("Usuarios");
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered

        jLabel2.setText("Transacciones");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered

        jLabel2.setText("Ventas");
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        frmProveedoresMenu proveedor = new frmProveedoresMenu(u);
        proveedor.setVisible(true);
        proveedor.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        frmProductosMenu productos = new frmProductosMenu(u);
        productos.setVisible(true);
        productos.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        frmTransaccionesMenu transacciones = new frmTransaccionesMenu(u);
        transacciones.setVisible(true);
        transacciones.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        frmVentasMenu ventas = new frmVentasMenu(u);
        ventas.setVisible(true);
        ventas.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelContenedor;
    private javax.swing.JPanel jPanelSide;
    // End of variables declaration//GEN-END:variables
}
