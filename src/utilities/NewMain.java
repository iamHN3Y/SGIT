/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilities;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
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
        // Cambia el texto de los botones "Sí" y "No" a "Eliminar" y "Cancelar"
        UIManager.put("OptionPane.yesButtonText", "Eliminar");
        UIManager.put("OptionPane.noButtonText", "Cancelar");

        int response = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este elemento?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            System.out.println("El usuario eligió eliminar.");
        } else {
            System.out.println("El usuario eligió cancelar.");
        }
    }

}
