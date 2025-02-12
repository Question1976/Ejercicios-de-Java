package arrayList;

import java.util.ArrayList;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Buscar el �ndice de un elemento y eliminarlo. 
		
        // Crear un ArrayList con colores
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");

        // Mostrar la lista inicial
        System.out.println("Colores iniciales: " + colores);

        // Buscar el �ndice de un elemento
        String colorABuscar = "Azul";
        int indice = colores.indexOf(colorABuscar);

        // Verificar si el elemento est� en la lista
        if (indice != -1) {
            // Eliminar el elemento por su �ndice
            colores.remove(indice);
            System.out.println(colorABuscar + " ha sido eliminado.");
        } else {
            // Mensaje si no se encuentra el elemento
            System.out.println(colorABuscar + " no est� en la lista.");
        }

        // Mostrar la lista actualizada
        System.out.println("Colores actualizados: " + colores);
    }
}
