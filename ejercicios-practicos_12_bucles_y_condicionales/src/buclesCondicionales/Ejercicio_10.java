package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10. Calcular el factorial de un número.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt(); // Número para calcular el factorial
        
        int factorial = 1; // Variable para almacenar el resultado
        
        // Bucle para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Se multiplica el número por cada número anterior
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        sc.close();
    }
}
