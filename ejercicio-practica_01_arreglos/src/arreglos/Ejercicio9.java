package arreglos;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9: Eliminar un elemento del array
		
        // Declaramos un array con n�meros
        int[] numeros = {1, 2, 3, 4, 5};

        // El n�mero que queremos eliminar
        int eliminar = 3;

        // Creamos un nuevo array con una longitud reducida en 1
        int[] resultado = new int[numeros.length - 1];
        int j = 0; // �ndice para el nuevo array

        // Recorremos el array original
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != eliminar) { // Si el n�mero no es el que queremos eliminar
                resultado[j++] = numeros[i]; // Lo agregamos al nuevo array
            }
        }

        // Imprimimos el array resultante despu�s de eliminar el n�mero
        System.out.println("Array despu�s de eliminar: " + Arrays.toString(resultado));
    }
}
