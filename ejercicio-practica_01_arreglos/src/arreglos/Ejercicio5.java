package arreglos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5: Contar ocurrencias de un n�mero 
		
		// Declaramos un array con n�meros
        int[] numeros = {1, 2, 2, 3, 4, 2, 5};

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un n�mero a buscar
        System.out.print("Ingrese un n�mero: ");
        int buscado = scanner.nextInt(); // Guardamos el n�mero que el usuario quiere buscar

        // Inicializamos un contador en 0
        int contador = 0;

        // Recorremos el array con un bucle for-each
        for (int num : numeros) {
            // Si encontramos el n�mero, incrementamos el contador
            if (num == buscado) {
                contador++;
            }
        }

        // Mostramos cu�ntas veces aparece el n�mero en el array
        System.out.println("El n�mero aparece " + contador + " veces.");
    }
}
