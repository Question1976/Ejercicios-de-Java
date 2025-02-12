package arreglos;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8: Intercambiar el mayor y menor
		
        // Declaramos un array con números
        int[] numeros = {5, 2, 9, 1, 6};

        // Inicializamos las variables 'maxIndex' y 'minIndex' para almacenar los índices
        int maxIndex = 0, minIndex = 0;

        // Recorremos el array para encontrar los índices del número mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[maxIndex]) { // Si el número actual es mayor, actualizamos el índice del mayor
                maxIndex = i;
            }
            if (numeros[i] < numeros[minIndex]) { // Si el número actual es menor, actualizamos el índice del menor
                minIndex = i;
            }
        }

        // Intercambiamos los valores del mayor y menor
        int temp = numeros[maxIndex]; // Guardamos el valor mayor en una variable temporal
        numeros[maxIndex] = numeros[minIndex]; // Asignamos el valor menor en la posición del mayor
        numeros[minIndex] = temp; // Asignamos el valor mayor en la posición del menor

        // Imprimimos el array después del intercambio
        System.out.println("Array después del intercambio: " + Arrays.toString(numeros));
    }
}
