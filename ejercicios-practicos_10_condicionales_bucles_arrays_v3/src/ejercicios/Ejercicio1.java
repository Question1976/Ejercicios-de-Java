package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Ejercicio 1. Verificar si un array está ordenado en orden ascendente.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        boolean estaOrdenado = true; // Bandera para verificar orden

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) { // Si un número es mayor que el siguiente
                estaOrdenado = false;
                break;
            }
        }

        if (estaOrdenado) {
            System.out.println("El array está ordenado en orden ascendente.");
        } else {
            System.out.println("El array no está ordenado.");
        }
    }
}
