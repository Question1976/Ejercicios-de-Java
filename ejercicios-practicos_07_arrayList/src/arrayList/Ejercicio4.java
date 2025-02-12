package arrayList;

import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Comprobar si contiene un elemento.
		
        // Crear un ArrayList con frutas
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Verificar si contiene un elemento
        String buscar = "Banana";
        if (frutas.contains(buscar)) {
            System.out.println(buscar + " está en la lista.");
        } else {
            System.out.println(buscar + " no está en la lista.");
        }
    }
}
