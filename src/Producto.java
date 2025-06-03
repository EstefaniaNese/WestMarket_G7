// Esta clase representa un producto con sus características principales.
public class Producto {
    // Declaramos los atributos privados para proteger los datos del producto.
    private int codigo;
    private String descripcion;
    private int precio;
    private int cantidad;

    // Definimos el constructor con parámetros para inicializar el producto con sus datos.
    public Producto(int codigo, String descripcion, int precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Creamos métodos públicos para acceder a los atributos del producto.
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Este método nos permite calcular el total a pagar por el producto.
    public int calcularTotal() {
        return precio * cantidad;
    }
}
