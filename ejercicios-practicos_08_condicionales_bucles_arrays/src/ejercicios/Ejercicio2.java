package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Contar números pares en un array.
		
        int[] numeros = {2, 4, 7, 10, 13, 18}; // Array de números
        int contadorPares = 0; // Contador de números pares

        // Recorremos el array
        for (int numero : numeros) {
            if (numero % 2 == 0) { // Si el número es divisible por 2
                contadorPares++;
            }
        }

        System.out.println("Cantidad de números pares: " + contadorPares);
    }
}
