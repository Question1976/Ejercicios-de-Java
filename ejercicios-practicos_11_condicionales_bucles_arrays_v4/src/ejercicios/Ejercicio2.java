package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Encontrar la mediana de un array.
		
        int[] numeros = {7, 2, 3, 8, 4}; // Array de n�meros
        Arrays.sort(numeros); // Ordenamos el array

        double mediana;
        int medio = numeros.length / 2;

        if (numeros.length % 2 == 0) { // Si el tama�o es par
            mediana = (numeros[medio - 1] + numeros[medio]) / 2.0;
        } else { // Si el tama�o es impar
            mediana = numeros[medio];
        }

        System.out.println("La mediana es: " + mediana);
    }
}
