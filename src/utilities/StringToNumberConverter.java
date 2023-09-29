/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

/**
 *
 * @author rosal
 */
public class StringToNumberConverter {

    public static int convertToNumber(String input) {
        // Utilizamos la función hashCode() de la cadena
        // para generar un número hash
        int hashCode = input.hashCode();

        // Aseguramos que el número sea positivo
        int positiveHashCode = Math.abs(hashCode);

        // Limitamos la longitud del número resultante
        int maxLength = String.valueOf(Integer.MAX_VALUE).length();
        int result = positiveHashCode % (int) Math.pow(10, maxLength);

        return result;
    }

    public static void main(String[] args) {
        String input = "Pedro";
        int number = convertToNumber(input);
        System.out.println("Cadena: " + input);
        System.out.println("Número generado: " + number);
    }
}
