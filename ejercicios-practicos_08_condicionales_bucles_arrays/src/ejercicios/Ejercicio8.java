package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Ordenar un array (Burbuja).
		
		int[] numeros = { 5, 3, 8, 1, 2 }; // Array desordenado

		// Algoritmo de ordenamiento burbuja
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 - i; j++) {
				if (numeros[j] > numeros[j + 1]) { // Si el elemento actual es mayor
					int temporal = numeros[j]; // Intercambiamos los elementos
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temporal;
				}
			}
		}

		// Mostramos el array ordenado
		System.out.print("Array ordenado: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
	}
}
