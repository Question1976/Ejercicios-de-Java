package arrayList;

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Combinar dos ArrayLists.
		
        // Crear dos ArrayLists
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        // Agregar elementos a la primera lista
        lista1.add("Perro");
        lista1.add("Gato");

        // Agregar elementos a la segunda lista
        lista2.add("Conejo");
        lista2.add("Tortuga");

        // Mostrar ambas listas antes de combinarlas
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        // Combinar las listas (añadiendo todos los elementos de lista2 a lista1)
        lista1.addAll(lista2);

        // Mostrar la lista combinada
        System.out.println("Lista combinada: " + lista1);
    }
}
