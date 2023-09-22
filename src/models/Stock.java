package models;

public class Stock {

    private int id; // Identificador único del registro de stock
    private int id_producto; // Identificador del producto relacionado con el stock
    private int cantidad; // Cantidad de productos en stock

    // Constructor para un registro de stock con todos los atributos
    public Stock(int id, int id_producto, int cantidad) {
        this.id = id;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    public Stock(int id_producto, int cantidad) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    // Constructor para un registro de stock sin el atributo id (posiblemente para crear nuevos registros de stock)
    public Stock(int cantidad) {
        this.cantidad = cantidad;
    }

    // Constructor vacío
    public Stock() {
    }

    // Métodos de acceso para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos de acceso para el atributo id_producto
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    // Métodos de acceso para el atributo cantidad
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
