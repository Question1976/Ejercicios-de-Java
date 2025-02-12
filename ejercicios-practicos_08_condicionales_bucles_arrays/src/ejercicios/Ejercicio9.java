package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {

		// Ejercicio 9. Determinar el número más frecuente en un array.

		int[] numeros = { 1, 3, 3, 7, 1, 1, 5 }; // Array con números
		int maxOcurrencias = 0;
		int masFrecuente = numeros[0];

		// Recorremos el array
		for (int i = 0; i < numeros.length; i++) {
			int contador = 0;
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] == numeros[j]) { // Contamos ocurrencias
					contador++;
				}
			}

			if (contador > maxOcurrencias) { // Actualizamos el más frecuente
				maxOcurrencias = contador;
				masFrecuente = numeros[i];
			}
		}

		System.out.println("El número más frecuente es: " + masFrecuente);
	}
}
