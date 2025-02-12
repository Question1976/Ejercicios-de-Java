package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Buscar duplicados en un array.
		
        int[] numeros = {1, 3, 5, 3, 7, 9, 1}; // Array con posibles duplicados

        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) { // Comparación con el resto
                if (numeros[i] == numeros[j]) { // Si encontramos un duplicado
                    System.out.println("Duplicado encontrado: " + numeros[i]);
                }
            }
        }
    }
}
