package arrayList;

import java.util.ArrayList;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		// Ejercicio 3. Eliminar elementos y verificar tamaño.
		
        // Crear un ArrayList con números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Mostrar el tamaño inicial
        System.out.println("Tamaño inicial: " + numeros.size());

        // Eliminar un elemento por índice
        numeros.remove(1); // Elimina el número en la posición 1 (20)

        // Mostrar el tamaño y contenido actualizado
        System.out.println("Tamaño después de eliminar: " + numeros.size());
        System.out.println("Números: " + numeros);
    }

}
