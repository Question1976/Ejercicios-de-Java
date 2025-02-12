package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Invertir el contenido de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i]; // Invertimos el orden
        }

        System.out.print("Array invertido: ");
        for (int numero : invertido) {
            System.out.print(numero + " ");
        }
    }
}
