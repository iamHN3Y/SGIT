package dao;

import models.Stock;
import models.Usuario;
import models.Venta;

import utilities.database.Conexion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

interface I_DAO_Venta {

    boolean createVenta(ArrayList<Venta> vs, Usuario u) throws SQLException;

    boolean updateVenta(Venta nv, Venta v, Usuario u) throws SQLException;

    boolean deleteVenta(Venta v, Usuario u) throws SQLException;

    DefaultComboBoxModel<Venta> listaVentas() throws SQLException;

    DefaultTableModel tablaVentas() throws SQLException;

}

public class DAO_Venta extends Conexion implements I_DAO_Venta {

    @Override
    public boolean createVenta(ArrayList<Venta> vs, Usuario u) {
        boolean resultado = false;
        try {
            resultado = create(vs, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private boolean create(ArrayList<Venta> vs, Usuario u) throws Exception {
        try {
            this.conectar();
            for (Venta v : vs) {
                String query = "insert into ventas(id_producto, cantidad, total, id_usuario, borrado, fecha_modificacion) values (?,?,?,?,?, NOW());";
                PreparedStatement ps = this.conexion.prepareStatement(query);
                ps.setInt(1, v.getId_producto());
                ps.setInt(2, v.getCantidad());
                ps.setFloat(3, v.getTotal());
                ps.setInt(4, v.getId_usuario());
                ps.setBoolean(5, false);
                if (ps.execute()) {
                    Stock s = new DAO_Stock().searchStock(v.getId_producto());
                    int stocktemp = s.getCantidad() - v.getCantidad();
                    s.setCantidad(stocktemp);
                    if (new DAO_Stock().updateStock(s)) {
                        new DAO_control_log().insertControl("Hizo una venta", u);
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return false;
    }

    @Override
    public boolean updateVenta(Venta nv, Venta v, Usuario u) {
        boolean resultado = false;
        try {
            resultado = update(nv, v, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private boolean update(Venta nv, Venta v, Usuario u) throws SQLException, Exception {
        try {
            this.conectar();
            String query = "update ventas set id_producto = ?, cantidad = ?, total = ?, id_usuario = ?, fecha_modificacion = NOW() where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, nv.getId_producto());
            ps.setInt(2, nv.getCantidad());
            ps.setFloat(3, nv.getTotal());
            ps.setInt(4, nv.getId_usuario());
            ps.setInt(5, nv.getId());
            if (ps.execute()) {
                int dif = nv.getCantidad() - v.getCantidad();
                Stock s = new DAO_Stock().searchStock(nv.getId_producto());
                int stocktemp = s.getCantidad() + dif;
                s.setCantidad(stocktemp);
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Actualizó una venta", u);
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

    @Override
    public boolean deleteVenta(Venta v, Usuario u) {
        boolean resultado = false;
        try {
            resultado = delete(v, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private boolean delete(Venta v, Usuario u) throws SQLException, Exception {
        try {
            this.conectar();
            String query = "update ventas set borrado = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, v.getId());
            if (ps.execute()) {
                Stock s = new DAO_Stock().searchStock(v.getId_producto());
                int stocktemp = s.getCantidad() + v.getCantidad();
                s.setCantidad(stocktemp);
                if (new DAO_Stock().updateStock(s)) {
                    new DAO_control_log().insertControl("Elimino un producto", u);
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

    private ArrayList<Venta> readVentas() throws SQLException {
        ArrayList<Venta> ventas = new ArrayList<>();
        try {
            this.conectar();
            String query = "select * from ventas where borrado = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, false);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta v = new Venta();
                v.setId(rs.getInt("id"));
                v.setId_producto(rs.getInt("id_producto"));
                v.setCantidad(rs.getInt("cantidad"));
                v.setTotal(rs.getFloat("total"));
                v.setId_usuario(rs.getInt("id_usuario"));
                ventas.add(v);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            this.cerrar();
        }
        return ventas;
    }

    @Override
    public DefaultComboBoxModel<Venta> listaVentas() throws SQLException {
        DefaultComboBoxModel<Venta> modelo = new DefaultComboBoxModel<>();
        for (Venta v : readVentas()) {
            modelo.addElement(v);

        }
        return modelo;
    }

    @Override
    public DefaultTableModel tablaVentas() throws SQLException {
        // Definir las columnas de la tabla
        String[] columnas = {"ID", "ID Producto", "Cantidad", "Total", "ID Usuario"};
        // Crear un DefaultTableModel con las columnas
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        // Llenar el modelo con los datos de las transacciones
        for (Venta v : readVentas()) {
            Object[] fila = {
                v.getId(),
                v.getId_producto(),
                v.getCantidad(),
                v.getTotal(),
                v.getId_usuario()
            };
            modeloTabla.addRow(fila);
        }
        return modeloTabla;
    }

}
