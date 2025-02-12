package arrayList;

import java.util.ArrayList;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Eliminar duplicados en un ArrayList.
		
        // Crear un ArrayList con duplicados
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Manzana");
        frutas.add("Naranja");

        // Mostrar la lista original
        System.out.println("Lista original: " + frutas);

        // Crear un nuevo ArrayList para almacenar elementos únicos
        ArrayList<String> frutasSinDuplicados = new ArrayList<>();

        // Iterar sobre la lista original
        for (String fruta : frutas) {
            // Agregar la fruta solo si no está en la nueva lista
            if (!frutasSinDuplicados.contains(fruta)) {
                frutasSinDuplicados.add(fruta);
            }
        }

        // Mostrar la lista sin duplicados
        System.out.println("Lista sin duplicados: " + frutasSinDuplicados);
    }
}
