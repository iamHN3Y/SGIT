package models;

public class control_log {
    private int id_usuario; // Identificador del usuario relacionado con la actividad
    private String actividad; // Descripción de la actividad registrada

    // Constructor de la clase
    public control_log(int id_usuario, String actividad) {
        this.id_usuario = id_usuario;
        this.actividad = actividad;
    }

    // Métodos de acceso para el atributo id_usuario
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    // Métodos de acceso para el atributo actividad
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
}

