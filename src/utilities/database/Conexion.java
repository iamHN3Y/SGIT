package utilities.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    protected Connection conexion; // Almacena la conexión a la base de datos

    // Configuración de la conexión a la base de datos
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/sgit"; // URL de la base de datos
    public static final String USER = "root"; // Nombre de usuario de la base de datos
    public static final String PASS = "root"; // Contraseña de la base de datos

    /**
     * Establece una conexión a la base de datos.
     *
     * @throws Exception Si ocurre algún error durante la conexión.
     */
    public void conectar() throws Exception {
        try {
            // Carga el controlador JDBC de MySQL
            Class.forName(JDBC_DRIVER);

            // Establece la conexión a la base de datos utilizando la URL, usuario y contraseña especificados
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            // Captura y relanza excepciones relacionadas con la conexión
            throw e;
        }
    }

    /**
     * Cierra la conexión a la base de datos si está abierta.
     *
     * @throws SQLException Si ocurre un error al cerrar la conexión.
     */
    public void cerrar() throws SQLException {
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }
}
