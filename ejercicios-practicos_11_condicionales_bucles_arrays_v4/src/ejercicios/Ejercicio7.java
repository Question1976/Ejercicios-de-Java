package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Verificar si un array es un palíndromo.		
		
        int[] numeros = {1, 2, 3, 2, 1}; // Array de números
        boolean esPalindromo = true;

        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) { // Comparamos extremos
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El array es un palíndromo.");
        } else {
            System.out.println("El array no es un palíndromo.");
        }
    }
}
