package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Comprobar si dos arrays son iguales.
		
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        boolean sonIguales = true; // Bandera de igualdad

        if (array1.length != array2.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) { // Si encontramos un elemento diferente
                    sonIguales = false;
                    break;
                }
            }
        }

        if (sonIguales) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son diferentes.");
        }
    }
}
