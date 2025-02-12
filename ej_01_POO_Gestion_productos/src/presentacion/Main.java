package presentacion;

import java.util.Scanner;

import logica.LogicaProducto;

public class Main {

	public static void main(String[] args) {
		
		LogicaProducto logicaProducto = new LogicaProducto();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Productos ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    logicaProducto.agregarProducto(nombre, precio, cantidad);
                    System.out.println("Producto agregado con éxito.");
                    break;

                case 2:
                    System.out.print("Nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    var producto = logicaProducto.buscarProducto(nombreBuscar);
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de todos los productos:");
                    logicaProducto.mostrarProductos();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
        
	}

}
