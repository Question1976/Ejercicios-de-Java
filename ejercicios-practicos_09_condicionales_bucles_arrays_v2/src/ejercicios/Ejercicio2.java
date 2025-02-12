package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Encontrar la posición de un número en un array.
		
        int[] numeros = {4, 7, 9, 2, 5}; // Array de números
        int objetivo = 9; // Número a buscar
        int posicion = -1; // Posición del número

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + objetivo + " está en la posición: " + posicion);
        } else {
            System.out.println("El número no está en el array.");
        }
    }
}
