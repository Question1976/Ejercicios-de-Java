package ejercicios;

import java.util.HashSet;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Combinar dos arrays en uno sin duplicados.
		
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        HashSet<Integer> combinado = new HashSet<>();

        for (int numero : array1) {
            combinado.add(numero);
        }
        for (int numero : array2) {
            combinado.add(numero);
        }

        System.out.print("Array combinado sin duplicados: ");
        for (int numero : combinado) {
            System.out.print(numero + " ");
        }
    }
}
