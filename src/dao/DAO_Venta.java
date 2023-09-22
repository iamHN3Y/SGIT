package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.Usuario;
import models.Venta;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Venta {

    OperacionResultado createVenta(ArrayList<Venta> v, Usuario u) throws SQLException;

    OperacionResultado updateVenta(Venta nv, Venta v, Usuario u) throws SQLException;

    OperacionResultado deleteVenta(int id) throws SQLException;

    DefaultComboBoxModel<Venta> listaTransacciones() throws SQLException;

    DefaultTableModel tablaTransacciones() throws SQLException;

}

public class DAO_Venta extends Conexion implements I_DAO_Venta {

    @Override
    public OperacionResultado createVenta(ArrayList<Venta> v, Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado updateVenta(Venta nv, Venta v, Usuario u) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado deleteVenta(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultComboBoxModel<Venta> listaTransacciones() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultTableModel tablaTransacciones() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
