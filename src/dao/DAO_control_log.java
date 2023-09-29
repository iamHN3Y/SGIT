package dao;

import models.Usuario;
import utilities.database.Conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;

interface I_DAO_control_log {

    void insertControl(String actividad, Usuario u) throws SQLException;
}

public class DAO_control_log extends Conexion implements I_DAO_control_log {

    /**
     * Inserta un registro de control en la base de datos.
     *
     * @param actividad La actividad a registrar.
     * @param u El usuario asociado a la actividad.
     */
    @Override
    public void insertControl(String actividad, Usuario u) throws SQLException {
        try {
            this.conectar();
            String query = "insert into control_log(id_usuario, actividad, fecha) values (?,?, N0W());";
            PreparedStatement ps = this.conexion.prepareStatement(query);
            ps.setInt(1, u.getId());
            ps.setString(2, actividad);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.cerrar(); // Asegurarse de cerrar la conexión
        }
    }
}
