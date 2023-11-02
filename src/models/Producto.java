package models;

public class Producto {

    private int id; // Identificador único del producto
    private String nombre; // Nombre del producto
    private String descripcion; // Descripción del producto
    private float precio; // Precio del producto
    private int stock;
    private boolean borrado; //estatus del producto

    // Constructor para un producto con todos los atributos
    public Producto(int id, String nombre, String descripcion, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Constructor para un producto sin el atributo id (posiblemente para crear nuevos productos)
    public Producto(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Constructor vacío
    public Producto() {
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

    // Métodos de acceso para el atributo descripcion
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos de acceso para el atributo precio
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    // Override del método toString para proporcionar una representación legible del producto
    @Override
    public String toString() {
        return getNombre() + " - " + getDescripcion();
    }
}
