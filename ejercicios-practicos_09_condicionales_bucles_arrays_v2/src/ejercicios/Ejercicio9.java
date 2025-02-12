package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9. Rotar un array hacia la izquierda.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array inicial
        int rotaciones = 1; // Número de rotaciones

        for (int r = 0; r < rotaciones; r++) {
            int primero = numeros[0]; // Guardamos el primer elemento

            for (int i = 0; i < numeros.length - 1; i++) {
                numeros[i] = numeros[i + 1]; // Desplazamos los elementos hacia la izquierda
            }

            numeros[numeros.length - 1] = primero; // Colocamos el primer elemento al final
        }

        System.out.print("Array rotado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
