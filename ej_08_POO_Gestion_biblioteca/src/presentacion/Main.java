package presentacion;

import logica.LogicaBiblioteca;
import modelo.Libro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicaBiblioteca logica = new LogicaBiblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Biblioteca ---");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Libro más caro");
            System.out.println("6. Libro más barato");
            System.out.println("7. Número total de libros");
            System.out.println("8. Ordenar libros por título");
            System.out.println("9. Ordenar libros por precio");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    logica.registrarLibro(titulo, autor, codigo, precio, cantidad);
                    System.out.println("Libro registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Título a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroTitulo = logica.buscarPorTitulo(tituloBuscar);
                    System.out.println((libroTitulo != null) ? libroTitulo : "Libro no encontrado.");
                    break;

                case 3:
                    System.out.print("Autor a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    Libro libroAutor = logica.buscarPorAutor(autorBuscar);
                    System.out.println((libroAutor != null) ? libroAutor : "Libro no encontrado.");
                    break;

                case 4:
                    logica.mostrarLibros();
                    break;

                case 5:
                    Libro masCaro = logica.obtenerLibroMasCaro();
                    System.out.println((masCaro != null) ? "Libro más caro: " + masCaro : "No hay libros.");
                    break;

                case 6:
                    Libro masBarato = logica.obtenerLibroMasBarato();
                    System.out.println((masBarato != null) ? "Libro más barato: " + masBarato : "No hay libros.");
                    break;

                case 7:
                    System.out.println("Número total de libros: " + logica.obtenerNumeroTotalLibros());
                    break;

                case 8:
                    logica.ordenarPorTitulo();
                    System.out.println("Libros ordenados por título.");
                    break;

                case 9:
                    logica.ordenarPorPrecio();
                    System.out.println("Libros ordenados por precio.");
                    break;

                case 10:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 10);

        scanner.close();
    }
}

