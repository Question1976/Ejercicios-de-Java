package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Ejercicio 1. Determinar si todos los elementos de un array son positivos.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de n�meros
        boolean todosPositivos = true; // Bandera para verificar positividad

        for (int numero : numeros) {
            if (numero < 0) { // Si encontramos un n�mero negativo
                todosPositivos = false;
                break;
            }
        }

        if (todosPositivos) {
            System.out.println("Todos los n�meros son positivos.");
        } else {
            System.out.println("Hay al menos un n�mero negativo.");
        }
    }
}
