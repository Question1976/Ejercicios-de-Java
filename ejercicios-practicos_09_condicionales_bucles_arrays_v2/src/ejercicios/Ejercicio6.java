package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Encontrar el índice del número más pequeño en un array.
		
        int[] numeros = {7, 3, 9, 2, 5}; // Array de números
        int indiceMenor = 0; // Inicializamos con el primer índice

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[indiceMenor]) { // Si encontramos un número menor
                indiceMenor = i;
            }
        }

        System.out.println("El índice del número más pequeño es: " + indiceMenor);
    }
}
