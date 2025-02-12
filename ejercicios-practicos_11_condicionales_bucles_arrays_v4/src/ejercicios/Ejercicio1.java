package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Ejercicio 1. Eliminar duplicados de un array.
		
        int[] numeros = {1, 2, 2, 3, 4, 4, 5}; // Array con duplicados
        int[] resultado = new int[numeros.length];
        int indiceResultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < indiceResultado; j++) {
                if (numeros[i] == resultado[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                resultado[indiceResultado++] = numeros[i];
            }
        }

        System.out.print("Array sin duplicados: ");
        for (int i = 0; i < indiceResultado; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
