package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Separar los n�meros pares e impares en dos arrays diferentes.
		
        int[] numeros = {1, 2, 3, 4, 5, 6}; // Array de n�meros
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        int indicePares = 0, indiceImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indicePares++] = numero; // Agregamos a los pares
            } else {
                impares[indiceImpares++] = numero; // Agregamos a los impares
            }
        }

        System.out.print("N�meros pares: ");
        for (int i = 0; i < indicePares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nN�meros impares: ");
        for (int i = 0; i < indiceImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
