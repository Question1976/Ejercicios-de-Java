package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Generar un array con los primeros n n�meros pares.
		
        int n = 5; // Cantidad de n�meros pares
        int[] pares = new int[n]; // Array para guardar los pares

        for (int i = 0; i < n; i++) {
            pares[i] = i * 2; // Generamos n�meros pares
        }

        System.out.print("Array de n�meros pares: ");
        for (int par : pares) {
            System.out.print(par + " ");
        }
    }
}
