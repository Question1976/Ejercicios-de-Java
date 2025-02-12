package logica;

import modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class LogicaBiblioteca {

    private List<Libro> libros;

    public LogicaBiblioteca() {
        this.libros = new ArrayList<>(); // Inicializa la lista de libros como una ArrayList vac�a
    }

    public void registrarLibro(String titulo, String autor, String codigo, double precio, int cantidad) {
        // Crea un nuevo objeto Libro con los par�metros dados y lo agrega a la lista de libros
        libros.add(new Libro(titulo, autor, codigo, precio, cantidad));
    }

    public Libro buscarPorTitulo(String titulo) {
        // Recorre la lista de libros y busca si el t�tulo de alg�n libro coincide
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posici�n i
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro; // Si encuentra un libro con el t�tulo, lo retorna
            }
        }
        return null; // Si no encuentra el libro, retorna null
    }

    public Libro buscarPorAutor(String autor) {
        // Recorre la lista de libros y busca si el autor de alg�n libro coincide
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posici�n i
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                return libro; // Si encuentra un libro con el autor, lo retorna
            }
        }
        return null; // Si no encuentra el libro, retorna null
    }

    public int obtenerNumeroTotalLibros() {
        // Retorna el tama�o de la lista de libros (el n�mero total de libros)
        return libros.size();
    }

    public Libro obtenerLibroMasCaro() {
        // Si la lista est� vac�a, retorna null
        if (libros.isEmpty()) return null;

        // Inicializa el primer libro como el m�s caro
        Libro masCaro = libros.get(0);

        // Recorre la lista de libros para encontrar el m�s caro
        for (int i = 1; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posici�n i
            if (libro.getPrecio() > masCaro.getPrecio()) {
                masCaro = libro; // Si encuentra un libro m�s caro, lo actualiza
            }
        }
        return masCaro; // Retorna el libro m�s caro encontrado
    }

    public Libro obtenerLibroMasBarato() {
        // Si la lista est� vac�a, retorna null
        if (libros.isEmpty()) return null;

        // Inicializa el primer libro como el m�s barato
        Libro masBarato = libros.get(0);

        // Recorre la lista de libros para encontrar el m�s barato
        for (int i = 1; i < libros.size(); i++) {
            Libro libro = libros.get(i); // Obtiene el libro en la posici�n i
            if (libro.getPrecio() < masBarato.getPrecio()) {
                masBarato = libro; // Si encuentra un libro m�s barato, lo actualiza
            }
        }
        return masBarato; // Retorna el libro m�s barato encontrado
    }

    public void ordenarPorTitulo() {
        // Usamos un algoritmo de ordenaci�n de burbuja para ordenar los libros por t�tulo
        for (int i = 0; i < libros.size() - 1; i++) {
            for (int j = 0; j < libros.size() - i - 1; j++) {
                // Compara dos libros consecutivos por su t�tulo
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
        // Usamos un algoritmo de ordenaci�n de burbuja para ordenar los libros por precio
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
        // Si la lista de libros est� vac�a, imprime un mensaje indicando que no hay libros
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            // Si hay libros, recorre la lista y muestra la representaci�n de cada libro
            for (int i = 0; i < libros.size(); i++) {
                System.out.println(libros.get(i)); // Imprime el libro en la posici�n i
            }
        }
    }
}
