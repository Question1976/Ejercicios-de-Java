package arreglos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5: Contar ocurrencias de un número 
		
		// Declaramos un array con números
        int[] numeros = {1, 2, 2, 3, 4, 2, 5};

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número a buscar
        System.out.print("Ingrese un número: ");
        int buscado = scanner.nextInt(); // Guardamos el número que el usuario quiere buscar

        // Inicializamos un contador en 0
        int contador = 0;

        // Recorremos el array con un bucle for-each
        for (int num : numeros) {
            // Si encontramos el número, incrementamos el contador
            if (num == buscado) {
                contador++;
            }
        }

        // Mostramos cuántas veces aparece el número en el array
        System.out.println("El número aparece " + contador + " veces.");
    }
}
