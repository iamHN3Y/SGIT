package gui;

import dao.DAO_Usuario;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicButtonUI;
import models.Usuario;
import utilities.Encriptador;

public class frmLogin extends javax.swing.JFrame {

    DAO_Usuario daoU = new DAO_Usuario();

    public frmLogin() {
        initComponents();
        setLocationRelativeTo(null);
        txtfCuenta.setText("1644600728");
        jPasswordContrasenia.setText("1644600728");

        bttEntrar.setUI(new BasicButtonUI());
        bttEntrar.addMouseListener(new MouseListener() {
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
                bttEntrar.setOpaque(true);
                bttEntrar.setBackground(Color.decode("#577590"));
                bttEntrar.setForeground(Color.white);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                bttEntrar.setBackground(Color.WHITE);
                bttEntrar.setForeground(Color.black);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfCuenta = new javax.swing.JTextField();
        bttEntrar = new javax.swing.JButton();
        jPasswordContrasenia = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGIT");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(getBackground());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/usuario.png"))); // NOI18N

        txtfCuenta.setFont(getFont());

        bttEntrar.setBackground(getBackground());
        bttEntrar.setFont(getFont());
        bttEntrar.setText("Entrar");
        bttEntrar.setToolTipText("Ingresar");
        bttEntrar.setBorder(null);
        bttEntrar.setFocusPainted(false);
        bttEntrar.setFocusable(false);
        bttEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bttEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bttEntrarMouseExited(evt);
            }
        });
        bttEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEntrarActionPerformed(evt);
            }
        });

        jPasswordContrasenia.setFont(getFont());

        jLabel4.setFont(getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inicia sesion");

        jLabel6.setFont(getFont());

        jLabel5.setFont(getFont());
        jLabel5.setText("Cuenta");

        jLabel7.setFont(getFont());
        jLabel7.setText("Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bttEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordContrasenia)
                    .addComponent(txtfCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(bttEntrar))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEntrarActionPerformed
        String cuenta = txtfCuenta.getText();
        char[] contraseniaArray = jPasswordContrasenia.getPassword();

        if (cuenta.isEmpty() || contraseniaArray.length == 0) {
            String mensajeError = "";
            if (cuenta.isEmpty()) {
                mensajeError += "El campo de cuenta no puede estar vacío.\n";
            }
            if (contraseniaArray.length == 0) {
                mensajeError += "El campo de contraseña no puede estar vacío.";
            }

            JOptionPane.showMessageDialog(this, mensajeError, "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String contrasenia = Encriptador.encriptar(new String(contraseniaArray));
        boolean resultado = login(cuenta, contrasenia);
        if (resultado) {
            if (u.getCuenta() == 0) {
                JOptionPane.showMessageDialog(this, "Datos incorrectos, el usuario no existe", "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
            } else {
                frmMenu menu = new frmMenu(u);
                menu.setVisible(true);
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.dispose();
            }

        }
    }//GEN-LAST:event_bttEntrarActionPerformed

    Usuario u = null;

    private boolean login(String cuenta, String contrasenia) {
        try {
            u = daoU.loginUsuario(cuenta, contrasenia);
            if (u != null && !u.isBorrado()) {
                return true;
            } else if (u != null && u.isBorrado()) {
                JOptionPane.showMessageDialog(this, "El usuario ha sido borrado.", "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos, verifique sus credenciales", "Error de Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            // Mensaje específico para errores de SQL
            JOptionPane.showMessageDialog(this, "Error al intentar iniciar sesión. Detalles: " + ex.getMessage(), "Error de SQL", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Mensaje para errores inesperados
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage(), "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private void bttEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttEntrarMouseEntered

    }//GEN-LAST:event_bttEntrarMouseEntered

    private void bttEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttEntrarMouseExited

    }//GEN-LAST:event_bttEntrarMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordContrasenia;
    private javax.swing.JTextField txtfCuenta;
    // End of variables declaration//GEN-END:variables

}
