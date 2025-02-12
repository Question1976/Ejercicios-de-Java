package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9. Imprimir una pirámide de asteriscos.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt(); // Altura de la pirámide
        
        // Bucle externo: controla el número de filas (niveles) de la pirámide
        for (int i = 1; i <= altura; i++) {
            // Bucle interno 1: imprime los espacios en blanco antes de los asteriscos
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" "); // Imprime un espacio en blanco
            }
            
            // Bucle interno 2: imprime los asteriscos de la fila actual
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Imprime un asterisco
            }
            
            // Salto de línea después de imprimir los espacios y asteriscos de una fila
            System.out.println();
        }
        
        sc.close();
    }
}
