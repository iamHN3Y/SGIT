package models;

public class Proveedor {

    private int id; // Identificador único del proveedor
    private String nombre; // Nombre del proveedor
    private String telefono; // Número de teléfono del proveedor
    private String direccion; // Dirección del proveedor

    // Constructor para un proveedor con todos los atributos
    public Proveedor(int id, String nombre, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Constructor para un proveedor sin el atributo id (posiblemente para crear nuevos proveedores)
    public Proveedor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //Constructor vacio para un proveedor
    public Proveedor() {
    }

    // Métodos de acceso para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    // Métodos de acceso para el atributo direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Override del método toString para proporcionar una representación legible del proveedor
    @Override
    public String toString() {
        return getNombre();
    }
}
