package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9. Imprimir una pir�mide de asteriscos.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura de la pir�mide: ");
        int altura = sc.nextInt(); // Altura de la pir�mide
        
        // Bucle externo: controla el n�mero de filas (niveles) de la pir�mide
        for (int i = 1; i <= altura; i++) {
            // Bucle interno 1: imprime los espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" "); // Imprime un espacio en blanco
            }
            
            // Bucle interno 2: imprime los asteriscos de la fila actual
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Imprime un asterisco
            }
            
            // Salto de l�nea despu�s de imprimir los espacios y asteriscos de una fila
            System.out.println();
        }
        
        sc.close();
    }
}
