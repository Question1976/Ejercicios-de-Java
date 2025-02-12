package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Iterar y ordenar un ArrayList.
		
        // Crear un ArrayList con nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Lucía");
        nombres.add("Andrés");
        nombres.add("Mario");

        // Mostrar los nombres antes de ordenar
        System.out.println("Antes de ordenar: " + nombres);

        // Ordenar los nombres alfabéticamente
        Collections.sort(nombres);

        // Mostrar los nombres después de ordenar
        System.out.println("Después de ordenar: " + nombres);

        // Iterar sobre el ArrayList
        System.out.println("Iterando sobre la lista:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
