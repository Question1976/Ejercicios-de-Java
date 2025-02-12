package arreglos;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9: Eliminar un elemento del array
		
        // Declaramos un array con números
        int[] numeros = {1, 2, 3, 4, 5};

        // El número que queremos eliminar
        int eliminar = 3;

        // Creamos un nuevo array con una longitud reducida en 1
        int[] resultado = new int[numeros.length - 1];
        int j = 0; // Índice para el nuevo array

        // Recorremos el array original
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != eliminar) { // Si el número no es el que queremos eliminar
                resultado[j++] = numeros[i]; // Lo agregamos al nuevo array
            }
        }

        // Imprimimos el array resultante después de eliminar el número
        System.out.println("Array después de eliminar: " + Arrays.toString(resultado));
    }
}
