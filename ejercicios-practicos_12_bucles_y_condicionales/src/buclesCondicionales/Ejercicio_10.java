package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10. Calcular el factorial de un n�mero.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un n�mero: ");
        int numero = sc.nextInt(); // N�mero para calcular el factorial
        
        int factorial = 1; // Variable para almacenar el resultado
        
        // Bucle para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Se multiplica el n�mero por cada n�mero anterior
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        sc.close();
    }
}
