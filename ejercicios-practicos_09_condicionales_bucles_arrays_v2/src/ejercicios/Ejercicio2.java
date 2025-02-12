package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Encontrar la posici�n de un n�mero en un array.
		
        int[] numeros = {4, 7, 9, 2, 5}; // Array de n�meros
        int objetivo = 9; // N�mero a buscar
        int posicion = -1; // Posici�n del n�mero

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El n�mero " + objetivo + " est� en la posici�n: " + posicion);
        } else {
            System.out.println("El n�mero no est� en el array.");
        }
    }
}
