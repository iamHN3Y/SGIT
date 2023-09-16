package models;

public class Transaccion {

    private int id; // Identificador único de la transacción
    private int id_proveedor; // Identificador del proveedor relacionado con la transacción
    private int id_producto; // Identificador del producto relacionado con la transacción
    private int cantidad; // Cantidad de productos en la transacción

    // Constructor para una transacción con todos los atributos
    public Transaccion(int id, int id_proveedor, int id_producto, int cantidad) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    // Constructor para una transacción sin el atributo id (posiblemente para crear nuevas transacciones)
    public Transaccion(int id_proveedor, int id_producto, int cantidad) {
        this.id_proveedor = id_proveedor;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }

    // Constructor vacío
    public Transaccion() {
    }

    // Métodos de acceso para el atributo id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos de acceso para el atributo id_proveedor
    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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
