package dao;

import models.Stock;
import models.Transaccion;
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

interface I_DAO_Transacciones {

    boolean createTransaccion(Transaccion ts, Usuario u) throws SQLException;

    boolean updateTransaccion(Transaccion nt, Transaccion t, Usuario u) throws SQLException;

    DefaultComboBoxModel<Transaccion> listaTransacciones() throws SQLException;

    DefaultTableModel tablaTransacciones() throws SQLException;

    boolean deleteTransaccion(Transaccion t, Usuario u);
}

public class DAO_Transacciones extends Conexion implements I_DAO_Transacciones {

    /**
     * Crea una lista de transacciones en la base de datos con los datos
     * proporcionados.
     *
     * @param ts Un ArrayList de objetos Transaccion que contiene los datos de
     * las transacciones.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    @Override
    public boolean createTransaccion(Transaccion ts, Usuario u) {
        boolean resultado = false;
        try {
            resultado = create(ts, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la creación real de las transacciones en la
     * base de datos.
     *
     * @param ts Un ArrayList de objetos Transaccion que contiene los datos de
     * las transacciones.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private boolean create(Transaccion t, Usuario u) throws SQLException, Exception {
        try {
            this.conectar();

            String query = "insert into transacciones(id_proveedor, id_producto, cantidad, total) values (?, ?, ?, ?)";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, t.getId_proveedor());
            ps.setInt(2, t.getId_producto());
            ps.setInt(3, t.getCantidad());
            ps.setFloat(4, t.getTotal());
            boolean resul = ps.execute();
            if (resul != true) {
                Stock s = new DAO_Stock().searchStock(t.getId_producto());
                int stocktemp = s.getCantidad() + t.getCantidad();
                s.setCantidad(stocktemp);
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Creó una transacción", u);
                    return true;
                }
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return false;
    }

    /**
     * Actualiza una transacción en la base de datos con los datos
     * proporcionados.
     *
     * @param nt La nueva Transaccion con los datos actualizados.
     * @param t La Transaccion original que se va a actualizar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     */
    @Override
    public boolean updateTransaccion(Transaccion nt, Transaccion t, Usuario u) {
        boolean resultado = false;
        try {
            resultado = update(nt, t, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    /**
     * Método privado que realiza la actualización real de una transacción en la
     * base de datos.
     *
     * @param nt La nueva Transaccion con los datos actualizados.
     * @param t La Transaccion original que se va a actualizar.
     * @param u El Usuario que realiza la operación.
     * @return OperacionResultado que indica el resultado de la operación
     * (EXITO, ERROR_BD o OTRO_ERROR).
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private boolean update(Transaccion nt, Transaccion t, Usuario u) throws SQLException, Exception {
        try {
            this.conectar();
            String query = "update transacciones set id_proveedor = ?, id_producto = ?, cantidad = ?, total = ?, fecha = NOW() where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, nt.getId_proveedor());
            ps.setInt(2, nt.getId_producto());
            ps.setInt(3, nt.getCantidad());
            ps.setFloat(4, nt.getTotal());
            ps.setInt(5, nt.getId());
            boolean resul = ps.execute();
            if (resul != true) {
                int dif = nt.getCantidad() - t.getCantidad();
                Stock s = new DAO_Stock().searchStock(nt.getId_producto());
                int stocktemp = s.getCantidad() + dif;
                s.setCantidad(stocktemp);
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Actualizó una transacción", u);
                    return true;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return false;
    }

    /**
     * Lee y recupera todas las transacciones almacenadas en la base de datos.
     *
     * @return Un ArrayList de objetos Transaccion que contiene todas las
     * transacciones almacenadas.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    private ArrayList<Transaccion> readTransacciones() throws Exception {
        ArrayList<Transaccion> transacciones = new ArrayList<>();
        try {
            this.conectar();
            String query = "SELECT * FROM vista_listtransaccion;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Transaccion t = new Transaccion();
                t.setId(rs.getInt("id_transaccion")); // Cambio en el nombre de la columna
                t.setProveedor(rs.getString("nombre_proveedor"));
                t.setProducto(rs.getString("nombre_producto"));
                t.setId_producto(rs.getInt("id_producto"));
                t.setId_proveedor(rs.getInt("id_proveedor"));
                t.setCantidad(rs.getInt("cantidad"));
                t.setFecha(String.valueOf(rs.getTimestamp("fecha"))); // Agregado para obtener la fecha
                t.setTotal(rs.getFloat("total"));
                transacciones.add(t);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return transacciones;
    }

    /**
     * Recupera una lista de transacciones desde la base de datos y la devuelve
     * en forma de DefaultComboBoxModel.
     *
     * @return Un DefaultComboBoxModel que contiene las transacciones
     * recuperadas desde la base de datos.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultComboBoxModel<Transaccion> listaTransacciones() throws SQLException {
        DefaultComboBoxModel<Transaccion> modelo = new DefaultComboBoxModel<>();
        try {
            for (Transaccion t : readTransacciones()) {
                modelo.addElement(t);
            }
        } catch (Exception ex) {
            Logger.getLogger(DAO_Transacciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    /**
     * Recupera una lista de transacciones desde la base de datos y la devuelve
     * en forma de DefaultTableModel con columnas predefinidas ("ID", "ID
     * Producto", "ID Proveedor", "Cantidad", "Total").
     *
     * @return Un DefaultTableModel que contiene las transacciones recuperadas
     * desde la base de datos con columnas predefinidas.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public DefaultTableModel tablaTransacciones() throws SQLException {
        // Definir las columnas de la tabla (incluyendo nombres de producto, proveedor y fecha)
        String[] columnas = {"ID", "Proveedor", "Producto", "Cantidad", "Total", "Fecha", "id_producto", "id_proveedor"};
        // Crear un DefaultTableModel con las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (String columna : columnas) {
            modeloTabla.addColumn(columna);
        }
        try {
            // Llenar el modelo con los datos de las transacciones
            for (Transaccion t : readTransacciones()) {
                Object[] fila = {
                    t.getId(),
                    t.getProveedor(), // Agregar el nombre del proveedor
                    t.getProducto(), // Agregar el nombre del producto
                    t.getCantidad(),
                    t.getTotal(),
                    t.getFecha(), // Agregar la fecha
                    t.getId_producto(),
                    t.getId_proveedor()

                };

                modeloTabla.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(DAO_Transacciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modeloTabla;
    }

    @Override
    public boolean deleteTransaccion(Transaccion t, Usuario u) {
        boolean resultado = false;
        try {
            resultado = delete(t, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private boolean delete(Transaccion t, Usuario u) throws Exception {
        try {
            this.conectar();
            String query = "delete from transacciones where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, t.getId());
            boolean resul = ps.execute();
            if (resul != true) {
                Stock s = new DAO_Stock().searchStock(t.getId_producto());
                int stocktemp = s.getCantidad() - t.getCantidad();
                s.setCantidad(stocktemp);
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Elimino una transacción", u);
                    return true;
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return false;
    }

}
