package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9. Encontrar el índice donde la suma de la izquierda es igual a la suma de la derecha.
		
        int[] numeros = {1, 7, 3, 6, 5, 6}; // Array de números
        int totalSuma = 0;

        for (int numero : numeros) {
            totalSuma += numero; // Calculamos la suma total
        }

        int sumaIzquierda = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (sumaIzquierda == totalSuma - sumaIzquierda - numeros[i]) { // Verificamos equilibrio
                System.out.println("El índice de equilibrio es: " + i);
                return;
            }
            sumaIzquierda += numeros[i];
        }

        System.out.println("No hay índice de equilibrio.");
    }
}
