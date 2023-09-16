package dao;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.Stock;
import models.Transaccion;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Transacciones {

    OperacionResultado createTransaccion(Transaccion t, Stock s, Usuario u) throws SQLException;

    OperacionResultado updateTransaccion(Transaccion nt, Transaccion t, Stock s, Usuario u) throws SQLException;

    DefaultComboBoxModel<Transaccion> listaTransacciones() throws SQLException;

    DefaultTableModel tablaTransacciones() throws SQLException;
}

public class DAO_Transacciones extends Conexion implements I_DAO_Transacciones {

    @Override
    public OperacionResultado createTransaccion(Transaccion t, Stock s, Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado updateTransaccion(Transaccion nt, Transaccion t, Stock s, Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultComboBoxModel<Transaccion> listaTransacciones() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultTableModel tablaTransacciones() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
