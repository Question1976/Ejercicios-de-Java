package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Contar n�meros pares en un array.
		
        int[] numeros = {2, 4, 7, 10, 13, 18}; // Array de n�meros
        int contadorPares = 0; // Contador de n�meros pares

        // Recorremos el array
        for (int numero : numeros) {
            if (numero % 2 == 0) { // Si el n�mero es divisible por 2
                contadorPares++;
            }
        }

        System.out.println("Cantidad de n�meros pares: " + contadorPares);
    }
}
