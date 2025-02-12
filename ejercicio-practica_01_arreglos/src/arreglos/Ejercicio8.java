package arreglos;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8: Intercambiar el mayor y menor
		
        // Declaramos un array con n�meros
        int[] numeros = {5, 2, 9, 1, 6};

        // Inicializamos las variables 'maxIndex' y 'minIndex' para almacenar los �ndices
        int maxIndex = 0, minIndex = 0;

        // Recorremos el array para encontrar los �ndices del n�mero mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[maxIndex]) { // Si el n�mero actual es mayor, actualizamos el �ndice del mayor
                maxIndex = i;
            }
            if (numeros[i] < numeros[minIndex]) { // Si el n�mero actual es menor, actualizamos el �ndice del menor
                minIndex = i;
            }
        }

        // Intercambiamos los valores del mayor y menor
        int temp = numeros[maxIndex]; // Guardamos el valor mayor en una variable temporal
        numeros[maxIndex] = numeros[minIndex]; // Asignamos el valor menor en la posici�n del mayor
        numeros[minIndex] = temp; // Asignamos el valor mayor en la posici�n del menor

        // Imprimimos el array despu�s del intercambio
        System.out.println("Array despu�s del intercambio: " + Arrays.toString(numeros));
    }
}
