package dao;

import models.Producto;
import models.Stock;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

interface I_DAO_Producto {
    OperacionResultado createProducto(Producto p, Usuario u, Stock s) throws SQLException;

    Producto readProducto(int id);

    DefaultComboBoxModel<Producto> listaProductos() throws SQLException;

    DefaultTableModel tablaProductos() throws SQLException;

    OperacionResultado updateProducto(Producto p, Usuario u, Stock s) throws SQLException;

    OperacionResultado deleteProducto(int id, Usuario u) throws SQLException;

}

public class DAO_Producto extends Conexion implements I_DAO_Producto {

    /**
     * Crea un nuevo producto en la base de datos.
     *
     * @param p El objeto Producto que se va a crear.
     * @param u El Usuario que realiza la operación.
     * @param s El Stock asociado al producto.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     */
    @Override
    public OperacionResultado createProducto(Producto p, Usuario u, Stock s) {
        OperacionResultado resultado = null;
        try {
            resultado = create(p, u, s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la creación real del Producto en la base de datos.
     *
     * @param p El objeto Producto que se va a crear.
     * @param u El Usuario que realiza la operación.
     * @param s El Stock asociado al producto.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private OperacionResultado create(Producto p, Usuario u, Stock s) throws SQLException {
        try {
            this.conectar();
            String query = "insert into producto(nombre, descripcion, precio, borrado) values (?,?,?,?);";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setFloat(3, p.getPrecio());
            ps.setBoolean(4, false);
            if (ps.execute()) {
                s.setId_producto(searchID(p));
                if (new DAO_Stock().insertStock(s)) {
                    new DAO_control_log().insertControl("Creo un producto", u);
                    return OperacionResultado.EXITO;
                }
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Busca y devuelve el ID de un Producto en la base de datos.
     *
     * @param p El objeto Producto para el cual se busca el ID.
     * @return El ID del Producto encontrado o 0 si no se encuentra.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    public int searchID(Producto p) throws SQLException {
        int id = 0;
        try {
            this.conectar();
            String query = "select id from producto where nombre = ?, descripcion = ?, precio = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setFloat(3, p.getPrecio());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                return id;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return id;
    }

    /**
     * Lee y devuelve una lista de productos desde la base de datos a través de una vista.
     *
     * @return ArrayList de Productos que contiene los datos recuperados de la vista.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private ArrayList<Producto> readProductos() throws SQLException {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            this.conectar();
            String query = "select * from vista_listproductos;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getFloat("preciov"));
                p.setStock(rs.getInt("cantidad"));
                productos.add(p);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return productos;
    }

    /**
     * Lee y devuelve un producto específico de la base de datos según su ID.
     *
     * @param id El ID del producto que se desea leer.
     * @return El Producto recuperado de la base de datos, o un objeto Producto vacío si no se encuentra.
     * @throws RuntimeException Si ocurre un error durante la operación.
     */
    @Override
    public Producto readProducto(int id) {
        Producto p = new Producto();
        try {
            this.conectar();
            String query = "select * from vista_listproductos where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setPrecio(rs.getFloat("preciov"));
                p.setStock(rs.getInt("cantidad"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return p;
    }

    /**
     * Genera un modelo de ComboBox por defecto (DefaultComboBoxModel) que contiene una lista de productos
     * obtenidos de la base de datos.
     *
     * @return DefaultComboBoxModel que contiene la lista de productos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultComboBoxModel<Producto> listaProductos() throws SQLException {
        DefaultComboBoxModel<Producto> modelo = new DefaultComboBoxModel<>();
        for (Producto p : readProductos()) {
            modelo.addElement(p);
        }
        return modelo;
    }

    /**
     * Genera un modelo de tabla por defecto (DefaultTableModel) que representa una tabla de productos
     * con columnas para ID, Nombre, Descripción, Precio y Cantidad. Los datos se obtienen de la base de datos.
     *
     * @return DefaultTableModel que representa la tabla de productos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultTableModel tablaProductos() throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Descripción");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        for (Producto p : readProductos()) {
            Object[] fila = new Object[5];
            fila[0] = p.getId();
            fila[1] = p.getNombre();
            fila[2] = p.getDescripcion();
            fila[3] = p.getPrecio();
            fila[4] = p.getStock();
            model.addRow(fila);
        }
        return model;
    }

    /**
     * Actualiza un producto en la base de datos con los nuevos datos proporcionados.
     *
     * @param p El objeto Producto con los nuevos datos.
     * @param u El Usuario que realiza la operación.
     * @param s El Stock asociado al producto.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado updateProducto(Producto p, Usuario u, Stock s) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = update(p, u, s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la actualización real del Producto en la base de datos.
     *
     * @param p El objeto Producto con los nuevos datos.
     * @param u El Usuario que realiza la operación.
     * @param s El Stock asociado al producto.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     */
    private OperacionResultado update(Producto p, Usuario u, Stock s) {
        try {
            this.conectar();
            String query = "update producto set nombre = ?, descripcion = ?, precio = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setFloat(3, p.getPrecio());
            ps.setInt(4, p.getId());
            if (ps.execute()) {
                s.setId_producto(p.getId());
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Actualizo un producto", u);
                    return OperacionResultado.EXITO;
                }
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    /**
     * Elimina un producto de la base de datos marcándolo como "borrado".
     *
     * @param id El ID del producto que se va a eliminar.
     * @param u  El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public OperacionResultado deleteProducto(int id, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = delete(id, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la eliminación real del Producto en la base de datos,
     * marcándolo como "borrado".
     *
     * @param id El ID del producto que se va a eliminar.
     * @param u  El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación (EXITO, ERROR_BD o OTRO_ERROR).
     */
    private OperacionResultado delete(int id, Usuario u) {
        try {
            this.conectar();
            String query = "update producto set borrado = ? where id = ?";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Elimino un producto", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }
}