package dao;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Proveedor;
import models.Usuario;
import utilities.OperacionResultado;
import utilities.database.Conexion;

interface I_DAO_Proveedor {

    OperacionResultado createProveedor(Proveedor p, Usuario u) throws SQLException;

    Proveedor readProveedor(int id);

    DefaultComboBoxModel<Proveedor> listaProveedores();

    DefaultTableModel tablaProveedores();

    OperacionResultado updateProveedor(Proveedor p, Usuario u);

    OperacionResultado deleteProveedor();

}

public class DAO_Proveedor extends Conexion implements I_DAO_Proveedor {

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
                new DAO_control_log().insertControl("Creo un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

    @Override
    public Proveedor readProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultComboBoxModel<Proveedor> listaProveedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultTableModel tablaProveedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado updateProveedor(Proveedor p, Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OperacionResultado deleteProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
