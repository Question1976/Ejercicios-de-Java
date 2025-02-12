package arreglos;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
    	
    	// Ejercicio 2: Ordenar un array en forma ascendente
    	
    	// Declaramos un array con números desordenados
        int[] numeros = {5, 3, 8, 6, 2};

        // Implementamos el algoritmo de burbuja para ordenar el array
        for (int i = 0; i < numeros.length - 1; i++) {  // Recorremos todo el array
            for (int j = 0; j < numeros.length - 1 - i; j++) {  // Comparar pares de elementos adyacentes
                // Si el número actual es mayor que el siguiente, intercambiamos sus posiciones
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j]; // Guardamos el valor de 'numeros[j]'
                    numeros[j] = numeros[j + 1]; // Colocamos el valor de 'numeros[j + 1]' en la posición 'j'
                    numeros[j + 1] = temp; // Colocamos el valor guardado en 'temp' en la posición 'j + 1'
                }
            }
        }

        // Imprimimos el array ordenado
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
