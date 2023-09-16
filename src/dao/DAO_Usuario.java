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

    OperacionResultado updateUsuario(Usuario n, Usuario u) throws SQLException;

    OperacionResultado deleteUsuario(int id, Usuario u) throws SQLException;

    DefaultComboBoxModel<Usuario> listaUsuario() throws SQLException;
}

public class DAO_Usuario extends Conexion implements I_DAO_Usuario {

    /**
     * Realiza la autenticación de un usuario en el sistema.
     *
     * @param cuenta La cuenta del usuario.
     * @param contrasenia La contraseña del usuario.
     * @return Un objeto Usuario que representa al usuario autenticado si la
     * cuenta y contraseña son válidas, o un objeto Usuario vacío si no se
     * encuentra una coincidencia o la cuenta está marcada como "borrada".
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public Usuario loginUsuario(String cuenta, String contrasenia) throws SQLException {
        Usuario u = new Usuario();
        try {
            this.conectar();
            String query = "select * from usuario where cuenta = ? and contraseña = ? and borrado = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, cuenta);
            ps.setString(2, contrasenia);
            ps.setBoolean(3, false);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setNombre(rs.getString("nombre"));
                u.setTelefono(rs.getString("telefono"));
                u.setCuenta(rs.getString("cuenta"));
                u.setContraseña(rs.getString("contraseña"));
                u.setTipo_admin(rs.getBoolean("tipo_admin"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return u;
    }

    /**
     * Crea un nuevo usuario en la base de datos con los datos proporcionados.
     *
     * @param n El objeto Usuario con los datos del nuevo usuario.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
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

    /**
     * Método privado que realiza la creación real del Usuario en la base de
     * datos.
     *
     * @param n El objeto Usuario con los datos del nuevo usuario.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    private OperacionResultado create(Usuario n, Usuario u) {
        try {
            this.conectar();
            String query = "insert into usuario(nombre, telefono, cuenta, contraseña, tipo_admin, borrado) values (?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, n.getNombre());
            ps.setString(2, n.getTelefono());
            ps.setString(3, n.getCuenta());
            ps.setString(4, n.getContraseña());
            ps.setBoolean(5, n.isTipo_admin());
            ps.setBoolean(6, false);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Creó un usuario", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Actualiza los datos de un usuario en la base de datos con los nuevos
     * datos proporcionados.
     *
     * @param n El objeto Usuario con los nuevos datos del usuario.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado updateUsuario(Usuario n, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = update(n, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la actualización real de los datos del Usuario
     * en la base de datos.
     *
     * @param n El objeto Usuario con los nuevos datos del usuario.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private OperacionResultado update(Usuario n, Usuario u) throws SQLException {
        try {
            this.conectar();
            String query = "update usuario set nombre = ?, telefono = ?, cuenta = ?, contraseña = ?, tipo_admin = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, n.getNombre());
            ps.setString(2, n.getTelefono());
            ps.setString(3, n.getCuenta());
            ps.setString(4, n.getContraseña());
            ps.setBoolean(5, n.isTipo_admin());
            ps.setInt(6, n.getId());
            if (ps.execute()) {
                new DAO_control_log().insertControl("Actualizó un usuario", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Elimina un usuario de la base de datos marcándolo como "borrado".
     *
     * @param id El ID del usuario que se va a eliminar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado deleteUsuario(int id, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = delete(id, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la eliminación real del Usuario en la base de
     * datos, marcándolo como "borrado".
     *
     * @param id El ID del usuario que se va a eliminar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private OperacionResultado delete(int id, Usuario u) throws SQLException {
        try {
            this.conectar();
            String query = "update usuario set borrado = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Eliminó un usuario", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Obtiene un modelo de lista desplegable (ComboBox) que contiene a todos
     * los usuarios activos en el sistema.
     *
     * @return Un DefaultComboBoxModel que contiene a los usuarios activos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultComboBoxModel<Usuario> listaUsuario() throws SQLException {
        DefaultComboBoxModel<Usuario> modelo = new DefaultComboBoxModel<>();
        for (Usuario u : readUsuarios()) {
            modelo.addElement(u);
        }
        return modelo;
    }

    /**
     * Método privado que obtiene una lista de todos los usuarios activos en el
     * sistema desde la base de datos.
     *
     * @return Una lista de usuarios activos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private ArrayList<Usuario> readUsuarios() throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            this.conectar();
            String query = "select * from usuario where borrado = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, false);
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
