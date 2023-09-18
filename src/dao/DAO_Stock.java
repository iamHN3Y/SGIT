package dao;

import models.Stock;
import utilities.database.Conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

interface I_DAO_Stock {

    public boolean insertStock(Stock s) throws SQLException;

    public boolean updateStock(Stock s) throws SQLException;
}

public class DAO_Stock extends Conexion implements I_DAO_Stock {

    /**
     * Inserta un nuevo registro de Stock en la base de datos para un producto
     * específico.
     *
     * @param s El objeto Stock que contiene los datos del nuevo registro.
     * @return true si la inserción es exitosa, false en caso contrario.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public boolean insertStock(Stock s) throws SQLException {
        try {
            this.conectar();
            String query = "insert into stock(id_producto, cantidad) values (?,?);";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, s.getId_producto());
            ps.setInt(2, s.getCantidad());
            if (ps.execute()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    /**
     * Actualiza la cantidad de Stock en la base de datos para un producto
     * específico.
     *
     * @param s El objeto Stock con la nueva cantidad a actualizar.
     * @return true si la actualización es exitosa, false en caso contrario.
     * @throws SQLException Si ocurre un error de base de datos.
     */
    @Override
    public boolean updateStock(Stock s) throws SQLException {
        try {
            this.conectar();
            String query = "update stock set cantidad = ? where id_producto = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, s.getCantidad());
            ps.setInt(2, s.getId_producto());
            if (ps.execute()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
}
