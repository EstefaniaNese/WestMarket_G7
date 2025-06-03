// Esta es la clase principal donde iniciamos la aplicación.
public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de ProductoService para gestionar el flujo de la aplicación.
        ProductoService servicio = new ProductoService();

        // Llamamos al método para crear un producto y capturamos el resultado.
        Producto producto = servicio.crearProducto();

        // Si el producto fue creado correctamente, imprimimos sus datos.
        if (producto != null) {
            servicio.imprimirProducto(producto);
        }
        // Si no, el mensaje de error ya fue mostrado por ProductoService.
    }
}
