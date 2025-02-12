package arrayList;

import java.util.ArrayList;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		// Ejercicio 3. Eliminar elementos y verificar tama�o.
		
        // Crear un ArrayList con n�meros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Mostrar el tama�o inicial
        System.out.println("Tama�o inicial: " + numeros.size());

        // Eliminar un elemento por �ndice
        numeros.remove(1); // Elimina el n�mero en la posici�n 1 (20)

        // Mostrar el tama�o y contenido actualizado
        System.out.println("Tama�o despu�s de eliminar: " + numeros.size());
        System.out.println("N�meros: " + numeros);
    }

}
