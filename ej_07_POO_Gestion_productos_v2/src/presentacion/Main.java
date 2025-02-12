package presentacion;

import logica.LogicaProducto;
import modelo.Producto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicaProducto logica = new LogicaProducto();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gesti�n de Productos ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Buscar producto por nombre");
            System.out.println("3. Buscar producto por c�digo");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Producto m�s caro");
            System.out.println("6. Producto m�s barato");
            System.out.println("7. Calcular precio promedio");
            System.out.println("8. Ordenar productos por nombre");
            System.out.println("9. Ordenar productos por precio");
            System.out.println("10. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("C�digo: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Categor�a: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    logica.registrarProducto(nombre, codigo, categoria, precio, cantidad);
                    System.out.println("Producto registrado con �xito.");
                    break;

                case 2:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Producto prodNombre = logica.buscarPorNombre(nombreBuscar);
                    System.out.println((prodNombre != null) ? prodNombre : "Producto no encontrado.");
                    break;

                case 3:
                    System.out.print("C�digo a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Producto prodCodigo = logica.buscarPorCodigo(codigoBuscar);
                    System.out.println((prodCodigo != null) ? prodCodigo : "Producto no encontrado.");
                    break;

                case 4:
                    logica.mostrarProductos();
                    break;

                case 5:
                    Producto masCaro = logica.obtenerProductoMasCaro();
                    System.out.println((masCaro != null) ? "Producto m�s caro: " + masCaro : "No hay productos.");
                    break;

                case 6:
                    Producto masBarato = logica.obtenerProductoMasBarato();
                    System.out.println((masBarato != null) ? "Producto m�s barato: " + masBarato : "No hay productos.");
                    break;

                case 7:
                    System.out.println("Precio promedio: " + logica.calcularPrecioPromedio());
                    break;

                case 8:
                    logica.ordenarPorNombre();
                    System.out.println("Productos ordenados por nombre.");
                    break;

                case 9:
                    logica.ordenarPorPrecio();
                    System.out.println("Productos ordenados por precio.");
                    break;

                case 10:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opci�n inv�lida.");
            }
        } while (opcion != 10);

        scanner.close();
    }
}

