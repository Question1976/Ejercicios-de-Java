package ejercicios;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10. Mover todos los ceros al final de un array.
		
        int[] numeros = {0, 1, 0, 3, 12}; // Array con ceros
        int indice = 0;

        // Movemos los números no cero al principio
        for (int numero : numeros) {
            if (numero != 0) {
                numeros[indice++] = numero;
            }
        }

        // Rellenamos el resto con ceros
        while (indice < numeros.length) {
            numeros[indice++] = 0;
        }

        System.out.print("Array con ceros al final: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
