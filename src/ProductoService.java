import java.util.Scanner;

// Esta clase se encarga de gestionar la lógica relacionada con el producto.
public class ProductoService {
    // Creamos un objeto Scanner para leer los datos que ingresa el usuario.
    private Scanner sc = new Scanner(System.in);

    // Este método nos permite crear un producto solicitando los datos al usuario
    public Producto crearProducto() {
        int codigo = solicitarEntero("Ingrese código:", "Debe ingresar un código:");
        if (codigo == -1) return null; // Si no se ingresa el dato, terminamos el proceso.

        String descripcion = solicitarTexto("Ingrese descripción:", "Debe ingresar una descripción:");
        if (descripcion == null) return null;

        int precio = solicitarEntero("Ingrese precio:", "Debe ingresar un precio:");
        if (precio == -1) return null;

        int cantidad = solicitarEntero("Ingrese cantidad:", "Debe ingresar una cantidad:");
        if (cantidad == -1) return null;

        // Creamos y devolvemos el objeto Producto con los datos ingresados.
        return new Producto(codigo, descripcion, precio, cantidad);
    }

    // Este método privado nos ayuda a solicitar un número entero al usuario, con validación de intentos.
    private int solicitarEntero(String mensaje, String mensajeError) {
        int intentos = 0;
        while (intentos < 3) {
            System.out.println(mensaje);
            String input = sc.nextLine();
            try {
                // Intentamos convertir el dato ingresado a entero.
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // Si ocurre un error, mostramos el mensaje de error y sumamos un intento.
                System.out.println(mensajeError);
                intentos++;
            }
        }
        // Si se superan los intentos, avisamos y retornamos -1.
        System.out.println("Ha sobrepasado la cantidad máxima de intentos. ¡Adiós!");
        return -1;
    }

    // Este método privado nos ayuda a solicitar un texto al usuario, con validación de intentos.
    private String solicitarTexto(String mensaje, String mensajeError) {
        int intentos = 0;
        while (intentos < 3) {
            System.out.println(mensaje);
            String input = sc.nextLine();
            // Verificamos que el texto no esté vacío.
            if (!input.trim().isEmpty()) {
                return input;
            } else {
                System.out.println(mensajeError);
                intentos++;
            }
        }
        // Si se superan los intentos, avisamos y retornamos null.
        System.out.println("Ha sobrepasado la cantidad máxima de intentos. ¡Adiós!");
        return null;
    }

    // Este método nos permite imprimir la información del producto por pantalla.
    public void imprimirProducto(Producto producto) {
        System.out.println("\n--- Datos del producto ---");
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println("Total a pagar: " + producto.calcularTotal());
    }
}
