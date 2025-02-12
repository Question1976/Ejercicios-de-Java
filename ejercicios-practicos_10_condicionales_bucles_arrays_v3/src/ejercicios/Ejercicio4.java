package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Generar un array con la secuencia de Fibonacci.
		
        int n = 10; // Tamaño del array
        int[] fibonacci = new int[n];
        
        // Inicializamos los dos primeros valores
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Generamos la secuencia
        }

        System.out.print("Secuencia de Fibonacci: ");
        for (int numero : fibonacci) {
            System.out.print(numero + " ");
        }
    }
}
