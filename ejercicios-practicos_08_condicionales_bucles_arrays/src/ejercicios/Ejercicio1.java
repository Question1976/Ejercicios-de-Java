package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Ejercicio 1. Verificar si un número está en un array.
		
        int[] numeros = {1, 3, 5, 7, 9}; // Array de números
        int objetivo = 5; // Número a buscar
        boolean encontrado = false; // Variable para indicar si el número fue encontrado

        // Recorremos el array
        for (int numero : numeros) {
            if (numero == objetivo) { // Si encontramos el número
                encontrado = true;
                break; // Salimos del bucle
            }
        }

        // Mostramos el resultado
        if (encontrado) {
            System.out.println(objetivo + " está en el array.");
        } else {
            System.out.println(objetivo + " no está en el array.");
        }
    }
}
