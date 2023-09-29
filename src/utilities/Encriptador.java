package utilities;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Encriptador {

    private static final String claveEncriptacion = "MiClaveSecreta12"; // Clave de encriptación (16 caracteres)

    public static String encriptar(String texto) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] textoEncriptado = cipher.doFinal(texto.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception e) {
            System.out.println("Error al encriptar: " + e.toString());
        }
        return null;
    }

    public static String desencriptar(String textoEncriptado) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] textoDesencriptado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
            return new String(textoDesencriptado);
        } catch (Exception e) {
            System.out.println("Error al desencriptar: " + e.toString());
        }
        return null;
    }

    public static void main(String[] args) {
        String textoOriginal = "4140857815562141";
        String textoEncriptado = encriptar(textoOriginal);
        String textoDesencriptado = desencriptar(textoEncriptado);

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto encriptado: " + textoEncriptado);
        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }
}
