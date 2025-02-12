package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Ejercicio 8. Contar cuántas veces aparece un número.
		
        Scanner sc = new Scanner(System.in);
        
        int[] arreglo = {1, 2, 3, 4, 5, 2, 6, 7, 2}; // Arreglo de números
        System.out.print("Introduce el número a buscar: ");
        int numero = sc.nextInt(); // Número a buscar en el arreglo
        
        int contador = 0; // Variable para contar las ocurrencias
        
        // Bucle para recorrer el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                contador++; // Incrementa el contador si el número se encuentra en el arreglo
            }
        }
        
        System.out.println("El número " + numero + " aparece " + contador + " veces en el arreglo.");
        
        sc.close();
    }
}
