package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Usuario {

    Usuario loginUsuario(String cuenta, String contrasenia) throws SQLException;

    OperacionResultado createUsuario(Usuario n, Usuario u) throws SQLException;

    OperacionResultado updateUsuario(Usuario u) throws SQLException;

    OperacionResultado deleteUsuario(int id, Usuario u) throws SQLException;

    DefaultComboBoxModel<Usuario> listaUsuario() throws SQLException;
}

public class DAO_Usuario extends Conexion implements I_DAO_Usuario {

    @Override
    public Usuario loginUsuario(String cuenta, String contrasenia) throws SQLException {
        Usuario u = new Usuario();
        try {
            this.conectar();
            String query = "select * from usuario where cuenta = ?, contraseña = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, cuenta);
            ps.setString(2, contrasenia);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setTelefono(rs.getString("telefono"));
                u.setCuenta(rs.getString("cuenta"));
                u.setContraseña(rs.getString("contrasenia"));
                u.setTipo_admin(rs.getBoolean("tipo_admin"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return u;
    }

    @Override
    public OperacionResultado createUsuario(Usuario n, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = create(n, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private OperacionResultado create(Usuario n, Usuario u) {
        try {
            this.conectar();
            String query = "insert into usuario(nombre, telefono, cuenta, contraseña, tipo_admin) values (?, ?, ?, ?, ?);";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, n.getNombre());
            ps.setString(2, n.getTelefono());
            ps.setString(3, n.getCuenta());
            ps.setString(4, n.getContraseña());
            ps.setBoolean(5, n.isTipo_admin());
            if (ps.execute()) {
                new DAO_control_log().insertControl("Creo un usuario", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    @Override
    public OperacionResultado updateUsuario(Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado deleteUsuario(int id, Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultComboBoxModel<Usuario> listaUsuario() throws SQLException {
        DefaultComboBoxModel<Usuario> modelo = new DefaultComboBoxModel<>();
        for (Usuario u : readUsuarios()) {
            modelo.addElement(u);
        }
        return modelo;
    }

    private ArrayList<Usuario> readUsuarios() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            this.conectar();
            String query = "select * from usuario;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setTelefono(rs.getString("telefono"));
                u.setCuenta(rs.getString("cuenta"));
                u.setContraseña(rs.getString("contrasenia"));
                u.setTipo_admin(rs.getBoolean("tipo_admin"));
                usuarios.add(u);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return usuarios;
    }

}
