package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Encontrar todos los pares de números cuya suma sea igual a un valor dado.
		
        int[] numeros = {1, 2, 3, 4, 5, 6}; // Array de números
        int objetivo = 7; // Suma objetivo

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == objetivo) { // Si la suma coincide con el objetivo
                    System.out.println("Par encontrado: (" + numeros[i] + ", " + numeros[j] + ")");
                }
            }
        }
    }
}
