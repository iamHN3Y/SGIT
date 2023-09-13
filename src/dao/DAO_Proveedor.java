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

    Proveedor readProveedor();

    DefaultComboBoxModel<Proveedor> listaProveedores() throws SQLException;

    DefaultTableModel tablaProveedores() throws SQLException;

    OperacionResultado updateProveedor(Proveedor p, Usuario u) throws SQLException;

    OperacionResultado deleteProveedor(int id, Usuario u) throws SQLException;

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
    public Proveedor readProveedor() {
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
        }
        return p;
    }

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

    @Override
    public DefaultComboBoxModel<Proveedor> listaProveedores() throws SQLException {
        DefaultComboBoxModel<Proveedor> modelo = new DefaultComboBoxModel<>();
        for (Proveedor p : readProveedores()) {
            modelo.addElement(p);
        }
        return modelo;
    }

    @Override
    public DefaultTableModel tablaProveedores() throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
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
                new DAO_control_log().insertControl("Actualizo un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
            return OperacionResultado.ERROR_BD;
        }
        return OperacionResultado.OTRO_ERROR;
    }

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

    private OperacionResultado delete(int id, Usuario u) throws SQLException {
        try {
            this.conectar();
            String query = "update proveedor set borrado = ? where id = ?;";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setBoolean(1, true);
            ps.setInt(2, id);
            if (ps.execute()) {
                new DAO_control_log().insertControl("Elimino un proveedor", u);
                return OperacionResultado.EXITO;
            }
        } catch (Exception e) {
        } finally {
            this.cerrar();
        }
        return OperacionResultado.OTRO_ERROR;
    }

}
