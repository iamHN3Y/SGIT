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
        String cuenta = String.valueOf(StringToNumberConverter.convertToNumber(nombre));
        String contraseña = Encriptador.encriptar(cuenta);
        System.out.println(cuenta);
        System.out.println(contraseña);
        Usuario u = new Usuario(3, nombre, "7291525322", cuenta, contraseña, true);

        System.out.println(u);

        new dao.DAO_control_log().insertControl("Creo un usuario", u);

    }

}
