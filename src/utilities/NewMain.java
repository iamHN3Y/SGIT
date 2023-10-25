/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilities;

import java.sql.SQLException;
import models.Usuario;

/**
 *
 * @author rosal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String nombre = "Isaac Rosales";
        int cuenta = StringToNumberConverter.convertToNumber(nombre.toUpperCase());
        String contraseña = Encriptador.encriptar(String.valueOf(cuenta));
        String telefono = "7296300376";
        Usuario u = new Usuario(cuenta, nombre, telefono, contraseña, true);
        System.out.println(cuenta);
        
        new dao.DAO_Usuario().createUsuario(u, u);
    }

}
