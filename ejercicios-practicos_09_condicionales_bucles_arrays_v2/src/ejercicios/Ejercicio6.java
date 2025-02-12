package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Encontrar el �ndice del n�mero m�s peque�o en un array.
		
        int[] numeros = {7, 3, 9, 2, 5}; // Array de n�meros
        int indiceMenor = 0; // Inicializamos con el primer �ndice

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[indiceMenor]) { // Si encontramos un n�mero menor
                indiceMenor = i;
            }
        }

        System.out.println("El �ndice del n�mero m�s peque�o es: " + indiceMenor);
    }
}
