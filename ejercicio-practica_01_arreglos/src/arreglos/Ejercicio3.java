package arreglos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3: Buscar un elemento en el array
		
		// Declaramos un array con n�meros
        int[] numeros = {10, 20, 30, 40, 50};

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un n�mero
        System.out.print("Ingrese un n�mero: ");
        int buscado = scanner.nextInt(); // Guardamos el n�mero ingresado por el usuario

        // Inicializamos la variable 'encontrado' como false
        boolean encontrado = false;

        // Recorremos el array con un bucle for-each
        for (int num : numeros) {
            // Si encontramos el n�mero en el array, cambiamos 'encontrado' a true y salimos del bucle
            if (num == buscado) {
                encontrado = true;
                break; // Salimos del bucle si ya encontramos el n�mero
            }
        }

        // Imprimimos el resultado
        if (encontrado) {
            System.out.println("El n�mero est� en el array.");
        } else {
            System.out.println("El n�mero no est� en el array.");
        }
    }
	
}
