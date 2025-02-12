package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Ejercicio 1. Verificar si un n�mero est� en un array.
		
        int[] numeros = {1, 3, 5, 7, 9}; // Array de n�meros
        int objetivo = 5; // N�mero a buscar
        boolean encontrado = false; // Variable para indicar si el n�mero fue encontrado

        // Recorremos el array
        for (int numero : numeros) {
            if (numero == objetivo) { // Si encontramos el n�mero
                encontrado = true;
                break; // Salimos del bucle
            }
        }

        // Mostramos el resultado
        if (encontrado) {
            System.out.println(objetivo + " est� en el array.");
        } else {
            System.out.println(objetivo + " no est� en el array.");
        }
    }
}
