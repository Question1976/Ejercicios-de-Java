package ejercicios;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10. Rotar un array hacia la derecha.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array inicial
        int rotaciones = 2; // Número de rotaciones

        for (int r = 0; r < rotaciones; r++) { // Realizamos las rotaciones
            int ultimo = numeros[numeros.length - 1]; // Guardamos el último elemento

            // Desplazamos los elementos hacia la derecha
            for (int i = numeros.length - 1; i > 0; i--) {
                numeros[i] = numeros[i - 1];
            }

            numeros[0] = ultimo; // Colocamos el último elemento al inicio
        }

        // Mostramos el array rotado
        System.out.print("Array rotado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
