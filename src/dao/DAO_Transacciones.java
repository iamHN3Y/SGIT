package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Transaccion;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Transacciones {

    OperacionResultado createTransaccion(ArrayList<Transaccion> ts, Usuario u) throws SQLException;

    OperacionResultado updateTransaccion(Transaccion nt, Transaccion t, Usuario u) throws SQLException;

    DefaultComboBoxModel<Transaccion> listaTransacciones() throws SQLException;

    DefaultTableModel tablaTransacciones() throws SQLException;
}

public class DAO_Transacciones extends Conexion implements I_DAO_Transacciones {

    @Override
    public OperacionResultado createTransaccion(ArrayList<Transaccion> ts, Usuario u) throws SQLException {
        OperacionResultado resultado = null;
        try {
            resultado = create(ts, u);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Checale we pq hubo un error-> " + e);
        }
        return resultado;
    }

    private OperacionResultado create(ArrayList<Transaccion> ts, Usuario u) throws SQLException {
        try {
            this.conectar();
            for (Transaccion t : ts) {
                String query = "insert into transacciones(id_proveedor, id_producto, cantidad, total) values (?, ?, ?, ?)";
                PreparedStatement ps = this.conexion.prepareStatement(query);
                
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }

    @Override
    public OperacionResultado updateTransaccion(Transaccion nt, Transaccion t, Usuario u) throws SQLException {
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
