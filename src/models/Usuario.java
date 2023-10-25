package models;

public class Usuario {

    private int cuenta; // Nombre de cuenta del usuario
    private String nombre; // Nombre del usuario
    private String telefono; // Número de teléfono del usuario
    private String contraseña; // Contraseña del usuario
    private boolean tipo_admin; // Indica si el usuario es administrador o no
    private boolean borrado; //Indica si el usuario ha sido borrado o no

    // Constructor para un usuario con todos los atributos
    public Usuario(int cuenta, String nombre, String telefono, String contraseña, boolean tipo_admin) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.tipo_admin = tipo_admin;
    }

    // Constructor para un usuario sin el atributo id (posiblemente para crear nuevos usuarios)
    public Usuario(String nombre, String telefono, String contraseña, boolean tipo_admin) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.tipo_admin = tipo_admin;
    }

    // Constructor vacío
    public Usuario() {
    }

    // Métodos de acceso para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso para el atributo telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos de acceso para el atributo cuenta
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    // Métodos de acceso para el atributo contraseña
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Métodos de acceso para el atributo tipo_admin
    public boolean isTipo_admin() {
        return tipo_admin;
    }

    public void setTipo_admin(boolean tipo_admin) {
        this.tipo_admin = tipo_admin;
    }

    //metodos de acceso para el atributo borrado
    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return getCuenta() + "-" + getNombre();
    }

}
