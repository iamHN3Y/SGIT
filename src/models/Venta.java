package models;

public class Venta {

    private int id; // Identificador único de la venta
    private int id_producto; // Identificador del producto vendido
    private int id_usuario; // Identificador del usuario que realizó la venta
    private int cantidad; // Cantidad de productos vendidos
    private float total; // Total de la venta
    protected String nombreProducto;
    protected float precioProducto;

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    // Constructor para una venta con todos los atributos
    public Venta(int id, int id_producto, int id_usuario, int cantidad, float total) {
        this.id = id;
        this.id_producto = id_producto;
        this.id_usuario = id_usuario;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Constructor para una venta sin el atributo id (posiblemente para crear nuevas ventas)
    public Venta(int id_producto, int id_usuario, int cantidad, float total) {
        this.id_producto = id_producto;
        this.id_usuario = id_usuario;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Constructor vacío
    public Venta() {
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

    // Métodos de acceso para el atributo id_usuario
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    // Métodos de acceso para el atributo cantidad
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos de acceso para el atributo total
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", id_producto=" + id_producto + ", id_usuario=" + id_usuario + ", cantidad=" + cantidad + ", total=" + total + '}';
    }

}
