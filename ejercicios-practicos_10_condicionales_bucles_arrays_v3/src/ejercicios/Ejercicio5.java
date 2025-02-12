package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Determinar si un n�mero es un elemento repetido en un array.
		
        int[] numeros = {3, 7, 3, 9, 12, 7}; // Array de n�meros
        int objetivo = 7; // N�mero a verificar
        int contador = 0; // Contador de repeticiones

        for (int numero : numeros) {
            if (numero == objetivo) {
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println("El n�mero " + objetivo + " se repite en el array.");
        } else {
            System.out.println("El n�mero " + objetivo + " no se repite.");
        }
    }
}
