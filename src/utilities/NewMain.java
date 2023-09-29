/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilities;

import models.Usuario;

/**
 *
 * @author rosal
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Isaac Rosales";
        String cuenta = String.valueOf(StringToNumberConverter.convertToNumber(nombre));
        String contraseña = Encriptador.encriptar(cuenta);
        System.out.println(cuenta);
        System.out.println(contraseña);
        Usuario u = new Usuario(nombre, "7291525322", cuenta, contraseña, true);

        System.out.println(u);

        new dao.DAO_Usuario().deleteUsuario(2, u);

    }

}
