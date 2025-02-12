package arreglos;

import java.util.Scanner;

public class Ejercicio7 {

	 public static void main(String[] args) {
		 
		 	// Ejercicio 7: Buscar el índice de un elemento
		 
	        // Declaramos un array con números
	        int[] numeros = {10, 20, 30, 40, 50};

	        // Creamos un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Pedimos al usuario que ingrese un número
	        System.out.print("Ingrese un número: ");
	        int buscado = scanner.nextInt(); // Guardamos el número ingresado por el usuario

	        // Inicializamos la variable 'indice' con un valor predeterminado (-1)
	        int indice = -1;

	        // Recorremos el array usando un bucle for
	        for (int i = 0; i < numeros.length; i++) {
	            // Si encontramos el número, guardamos su índice y salimos del bucle
	            if (numeros[i] == buscado) {
	                indice = i;
	                break;
	            }
	        }

	        // Imprimimos el índice del número encontrado o un mensaje indicando que no se encontró
	        if (indice != -1) {
	            System.out.println("El número está en el índice: " + indice);
	        } else {
	            System.out.println("El número no está en el array.");
	        }
	    }
}
