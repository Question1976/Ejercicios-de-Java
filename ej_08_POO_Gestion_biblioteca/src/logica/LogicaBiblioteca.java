package logica;

import modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class LogicaBiblioteca {

    private List<Libro> libros;

    public LogicaBiblioteca() {
        this.libros = new ArrayList<>(); // Inicializa la lista de libros como una ArrayList vacía
    }

    public void registrarLibro(String titulo, String autor, String codigo, double precio, int cantidad) {
        // Crea un nuevo objeto Libro con los parámetros dados y lo agrega a la lista de libros
        libros.add(new Libro(titulo, autor, codigo, precio, cantidad));
    }

    public Libro buscarPorTitulo(String titulo) {
        // Recorre la lista de libros y busca si el título de algún libro coincide
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posición i
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro; // Si encuentra un libro con el título, lo retorna
            }
        }
        return null; // Si no encuentra el libro, retorna null
    }

    public Libro buscarPorAutor(String autor) {
        // Recorre la lista de libros y busca si el autor de algún libro coincide
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posición i
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro; // Si encuentra un libro con el autor, lo retorna
            }
        }
        return null; // Si no encuentra el libro, retorna null
    }

    public int obtenerNumeroTotalLibros() {
        // Retorna el tamaño de la lista de libros (el número total de libros)
        return libros.size();
    }

    public Libro obtenerLibroMasCaro() {
        // Si la lista está vacía, retorna null
        if (libros.isEmpty()) return null;

        // Inicializa el primer libro como el más caro
        Libro masCaro = libros.get(0);

        // Recorre la lista de libros para encontrar el más caro
        for (int i = 1; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posición i
            if (libro.getPrecio() > masCaro.getPrecio()) {
                masCaro = libro; // Si encuentra un libro más caro, lo actualiza
            }
        }
        return masCaro; // Retorna el libro más caro encontrado
    }

    public Libro obtenerLibroMasBarato() {
        // Si la lista está vacía, retorna null
        if (libros.isEmpty()) return null;

        // Inicializa el primer libro como el más barato
        Libro masBarato = libros.get(0);

        // Recorre la lista de libros para encontrar el más barato
        for (int i = 1; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posición i
            if (libro.getPrecio() < masBarato.getPrecio()) {
                masBarato = libro; // Si encuentra un libro más barato, lo actualiza
            }
        }
        return masBarato; // Retorna el libro más barato encontrado
    }

    public void ordenarPorTitulo() {
        // Usamos un algoritmo de ordenación de burbuja para ordenar los libros por título
        for (int i = 0; i < libros.size() - 1; i++) {
            for (int j = 0; j < libros.size() - i - 1; j++) {
                // Compara dos libros consecutivos por su título
                if (libros.get(j).getTitulo().compareToIgnoreCase(libros.get(j + 1).getTitulo()) > 0) {
                    // Si el libro j es mayor que el libro j + 1, los intercambia
                    Libro temp = libros.get(j);
                    libros.set(j, libros.get(j + 1));
                    libros.set(j + 1, temp);
                }
            }
        }
    }

    public void ordenarPorPrecio() {
        // Usamos un algoritmo de ordenación de burbuja para ordenar los libros por precio
        for (int i = 0; i < libros.size() - 1; i++) {
            for (int j = 0; j < libros.size() - i - 1; j++) {
                // Compara los precios de dos libros consecutivos
                if (libros.get(j).getPrecio() > libros.get(j + 1).getPrecio()) {
                    // Si el precio del libro j es mayor que el libro j + 1, los intercambia
                    Libro temp = libros.get(j);
                    libros.set(j, libros.get(j + 1));
                    libros.set(j + 1, temp);
                }
            }
        }
    }

    public void mostrarLibros() {
        // Si la lista de libros está vacía, imprime un mensaje indicando que no hay libros
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            // Si hay libros, recorre la lista y muestra la representación de cada libro
            for (int i = 0; i < libros.size(); i++) {
                System.out.println(libros.get(i)); // Imprime el libro en la posición i
            }
        }
    }
}
