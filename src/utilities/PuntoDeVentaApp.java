/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PuntoDeVentaApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Punto de Venta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel gridPanel = new JPanel(new GridLayout(4, 4)); // Cambia las dimensiones según tus necesidades

        // Simulación de productos (puedes cargar estos datos desde una base de datos)
        String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5", "Producto 6", "Producto 7", "Producto 8"};

        for (String producto : productos) {
            JButton button = new JButton(producto);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Aquí puedes agregar la lógica para agregar el producto al carrito
                    // Por ejemplo, puedes mostrar una ventana emergente para la cantidad
                    JOptionPane.showMessageDialog(frame, "Añadido al carrito: " + producto, "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            gridPanel.add(button);
        }

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
