package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Verificar si un array es simétrico.
		
        int[] numeros = {1, 2, 3, 2, 1}; // Array a verificar
        boolean esSimetrico = true; // Bandera para simetría

        // Recorremos la mitad del array
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) { // Comparamos extremos
                esSimetrico = false;
                break; // Salimos del bucle si no es simétrico
            }
        }

        if (esSimetrico) {
            System.out.println("El array es simétrico.");
        } else {
            System.out.println("El array no es simétrico.");
        }
    }
}
