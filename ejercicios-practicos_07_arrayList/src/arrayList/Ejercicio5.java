package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Iterar y ordenar un ArrayList.
		
        // Crear un ArrayList con nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Luc�a");
        nombres.add("Andr�s");
        nombres.add("Mario");

        // Mostrar los nombres antes de ordenar
        System.out.println("Antes de ordenar: " + nombres);

        // Ordenar los nombres alfab�ticamente
        Collections.sort(nombres);

        // Mostrar los nombres despu�s de ordenar
        System.out.println("Despu�s de ordenar: " + nombres);

        // Iterar sobre el ArrayList
        System.out.println("Iterando sobre la lista:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
