package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Proveedor;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Proveedor {

    OperacionResultado createProveedor(Proveedor p, Usuario u) throws SQLException;

    Proveedor readProveedor() throws SQLException;

    DefaultComboBoxModel<Proveedor> listaProveedores() throws SQLException;

    DefaultTableModel tablaProveedores() throws SQLException;

    OperacionResultado updateProveedor(Proveedor p, Usuario u) throws SQLException;

    OperacionResultado deleteProveedor(int id, Usuario u) throws SQLException;

}

public class DAO_Proveedor extends Conexion implements I_DAO_Proveedor {

    /**
     * Crea un nuevo proveedor en la base de datos.
     *
     * @param p El objeto Proveedor que se va a crear.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    @Override
    public OperacionResultado createProveedor(Proveedor p, Usuario u) {
        OperacionResultado resultado = null;
        try {
            resultado = create(p, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la creación real del Proveedor en la base de
     * datos.
     *
     * @param p El objeto Proveedor que se va a crear.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    private OperacionResultado create(Proveedor p, Usuario u) {
        try {
            this.conectar();
            String query = "insert into proveedor(nombre, telefono, direccion, borrado) values (?, ?, ?, ?);";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getTelefono());
            ps.setString(3, p.getDireccion());
            ps.setBoolean(4, false);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Creó un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Lee y devuelve un proveedor desde la base de datos. Este método asume que
     * hay solo un proveedor en la tabla.
     *
     * @return El objeto Proveedor con los datos del proveedor obtenidos de la
     * base de datos.
     * @throws java.sql.SQLException
     * @throws RuntimeException Si ocurre un error durante la operación.
     */
    @Override
    public Proveedor readProveedor() throws SQLException {
        Proveedor p = new Proveedor();
        try {
            this.conectar();
            String query = "select * from proveedor;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return p;
    }

    /**
     * Lee y devuelve una lista de proveedores desde la base de datos.
     *
     * @return ArrayList de Proveedores que contiene los datos recuperados de la
     * base de datos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private ArrayList<Proveedor> readProveedores() throws SQLException {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            String query = "select * from proveedor;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
                proveedores.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return proveedores;
    }

    /**
     * Genera un modelo de ComboBox por defecto (DefaultComboBoxModel) que
     * contiene una lista de proveedores obtenidos de la base de datos.
     *
     * @return DefaultComboBoxModel que contiene la lista de proveedores.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultComboBoxModel<Proveedor> listaProveedores() throws SQLException {
        DefaultComboBoxModel<Proveedor> modelo = new DefaultComboBoxModel<>();
        for (Proveedor p : readProveedores()) {
            modelo.addElement(p);
        }
        return modelo;
    }

    /**
     * Genera un modelo de tabla por defecto (DefaultTableModel) que representa
     * una tabla de proveedores con columnas para ID, Nombre, Teléfono y
     * Dirección. Los datos se obtienen de la base de datos.
     *
     * @return DefaultTableModel que representa la tabla de proveedores.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultTableModel tablaProveedores() throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Teléfono");
        model.addColumn("Dirección");
        for (Proveedor p : readProveedores()) {
            Object[] fila = new Object[4];
            fila[0] = p.getId();
            fila[1] = p.getNombre();
            fila[2] = p.getTelefono();
            fila[3] = p.getDireccion();
            model.addRow(fila);
        }
        return model;
    }

    /**
     * Actualiza un proveedor en la base de datos con los nuevos datos
     * proporcionados.
     *
     * @param p El objeto Proveedor con los nuevos datos.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado updateProveedor(Proveedor p, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = update(p, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la actualización real del Proveedor en la base
     * de datos.
     *
     * @param p El objeto Proveedor con los nuevos datos.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    private OperacionResultado update(Proveedor p, Usuario u) {
        try {
            this.conectar();
            String query = "update proveedor set nombre = ?, telefono = ?, direccion = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getTelefono());
            ps.setString(3, p.getDireccion());
            ps.setInt(4, p.getId());
            if (ps.execute()) {
                new DAO_control_log().insertControl("Actualizó un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Elimina un proveedor de la base de datos marcándolo como "borrado".
     *
     * @param id El ID del proveedor que se va a eliminar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado deleteProveedor(int id, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = delete(id, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la eliminación real del Proveedor en la base
     * de datos, marcándolo como "borrado".
     *
     * @param id El ID del proveedor que se va a eliminar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private OperacionResultado delete(int id, Usuario u) throws SQLException {
        try {
            this.conectar();
            String query = "update proveedor set borrado = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Eliminó un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            // Puedes considerar agregar un registro de error aquí.
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }
}
