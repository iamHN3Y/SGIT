package dao;

import models.Proveedor;
import models.Usuario;
import utilities.database.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

interface I_DAO_Proveedor {

    boolean createProveedor(Proveedor p, Usuario u) throws SQLException;

    Proveedor readProveedor(int id) throws SQLException;

    DefaultComboBoxModel<Proveedor> listaProveedores() throws SQLException;

    DefaultTableModel tablaProveedores() throws SQLException;

    boolean updateProveedor(Proveedor p, Usuario u) throws SQLException;

    boolean deleteProveedor(int id, Usuario u) throws SQLException;

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
    public boolean createProveedor(Proveedor p, Usuario u) {
        boolean resultado = false;
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
    private boolean create(Proveedor p, Usuario u) throws Exception {
        try {
            this.conectar();
            String query = "insert into proveedor(nombre, telefono, direccion, borrado, fecha_modificacion) values (?, ?, ?, ?, NOW());";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getTelefono());
            ps.setString(3, p.getDireccion());
            ps.setBoolean(4, false);

            boolean resul = ps.execute();
            if (resul != true) {
                new DAO_control_log().insertControl("Creó un proveedor", u);
                return true;
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return false;
    }

    @Override
    public Proveedor readProveedor(int id) throws SQLException {
        Proveedor p = new Proveedor();
        try {
            this.conectar();
            String query = "select * from proveedor where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
            }
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(DAO_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            this.conectar();
            String query = "select * from proveedor where borrado = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, false);
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
            try {
                throw e;
            } catch (Exception ex) {
                Logger.getLogger(DAO_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
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
     */
    @Override
    public boolean updateProveedor(Proveedor p, Usuario u) {
        boolean resultado = false;
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
    private boolean update(Proveedor p, Usuario u) throws Exception {
        try {
            this.conectar();
            String query = "update proveedor set nombre = ?, telefono = ?, direccion = ?, fecha_modificacion = NOW() where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getTelefono());
            ps.setString(3, p.getDireccion());
            ps.setInt(4, p.getId());

            boolean resul = ps.execute();
            if (resul != true) {
                new DAO_control_log().insertControl("Actualizó un proveedor", u);
                return true;
            }
        } catch (Exception e) {
            throw e;
        }
        return false;
    }

    /**
     * Elimina un proveedor de la base de datos marcándolo como "borrado".
     *
     * @param id El ID del proveedor que se va a eliminar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    @Override
    public boolean deleteProveedor(int id, Usuario u) {
        boolean resultado = false;
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
    private boolean delete(int id, Usuario u) throws SQLException, Exception {
        try {
            this.conectar();
            String query = "update proveedor set borrado = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            boolean resul = ps.execute();
            if (resul != true) {
                new DAO_control_log().insertControl("Eliminó un proveedor", u);
                return true;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return false;
    }
}
