package arreglos;

import java.util.Scanner;

public class Ejercicio7 {

	 public static void main(String[] args) {
		 
		 	// Ejercicio 7: Buscar el �ndice de un elemento
		 
	        // Declaramos un array con n�meros
	        int[] numeros = {10, 20, 30, 40, 50};

	        // Creamos un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Pedimos al usuario que ingrese un n�mero
	        System.out.print("Ingrese un n�mero: ");
	        int buscado = scanner.nextInt(); // Guardamos el n�mero ingresado por el usuario

	        // Inicializamos la variable 'indice' con un valor predeterminado (-1)
	        int indice = -1;

	        // Recorremos el array usando un bucle for
	        for (int i = 0; i < numeros.length; i++) {
	            // Si encontramos el n�mero, guardamos su �ndice y salimos del bucle
	            if (numeros[i] == buscado) {
	                indice = i;
	                break;
	            }
	        }

	        // Imprimimos el �ndice del n�mero encontrado o un mensaje indicando que no se encontr�
	        if (indice != -1) {
	            System.out.println("El n�mero est� en el �ndice: " + indice);
	        } else {
	            System.out.println("El n�mero no est� en el array.");
	        }
	    }
}
