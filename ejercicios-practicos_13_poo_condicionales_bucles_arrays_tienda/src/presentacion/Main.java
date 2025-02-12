package presentacion;

import java.util.Scanner;

import logica.GestionTienda;
import modelo.Producto;

public class Main {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Creamos una tienda con espacio para 5 productos.
        GestionTienda tienda = new GestionTienda(5);

        // Bucle principal para interactuar con el usuario.
        while (true) {
            // Menú de opciones.
            System.out.println("Bienvenido a la tienda. ¿Qué te gustaría hacer?");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Buscar un producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1: // Agregar un producto
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Introduce la cantidad disponible: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    tienda.agregarProducto(nuevoProducto);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2: // Mostrar todos los productos
                    tienda.mostrarProductos();
                    break;

                case 3: // Buscar un producto
                    System.out.print("Introduce el nombre del producto que deseas buscar: ");
                    String productoBuscado = scanner.nextLine();
                    tienda.buscarProducto(productoBuscado);
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar el sistema de la tienda. ¡Hasta pronto!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
                    break;
            }
        }
    }
}
