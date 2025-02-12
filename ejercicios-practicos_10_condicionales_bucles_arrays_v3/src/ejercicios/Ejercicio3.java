package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Contar cuántos elementos de un array son únicos.
		
        int[] numeros = {1, 2, 3, 2, 4, 1, 5}; // Array de números
        int contadorUnicos = 0; // Contador de elementos únicos

        for (int i = 0; i < numeros.length; i++) {
            boolean esUnico = true;

            for (int j = 0; j < numeros.length; j++) {
                if (i != j && numeros[i] == numeros[j]) { // Si se encuentra una coincidencia
                    esUnico = false;
                    break;
                }
            }

            if (esUnico) {
                contadorUnicos++;
            }
        }

        System.out.println("Cantidad de elementos únicos: " + contadorUnicos);
    }
}
