package arrayList;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Acceder y modificar elementos.
		
        // Crear y llenar un ArrayList
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");

        // Acceder a un elemento por su índice
        System.out.println("Primer color: " + colores.get(0));

        // Modificar un elemento
        colores.set(1, "Amarillo");

        // Mostrar el ArrayList actualizado
        System.out.println("Colores actualizados: " + colores);
    }
	
}
