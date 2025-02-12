package arreglos;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4: Invertir un array
		
		// Declaramos un array con números
        int[] numeros = {1, 2, 3, 4, 5};

        // Creamos un nuevo array para almacenar los números invertidos
        int[] invertido = new int[numeros.length];

        // Usamos un bucle para recorrer el array original y copiar los elementos en orden invertido
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i]; // Copiamos el elemento desde el final
        }

        // Imprimimos el array invertido
        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }
}
