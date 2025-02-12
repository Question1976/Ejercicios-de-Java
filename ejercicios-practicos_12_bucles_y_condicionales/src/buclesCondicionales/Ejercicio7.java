package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Verificar si un n�mero es primo.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un n�mero: ");
        int numero = sc.nextInt();
        
        boolean esPrimo = true; // Variable para verificar si el n�mero es primo
        
        // Bucle para verificar si el n�mero es divisible por alg�n n�mero menor a �l
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false; // Si es divisible, no es primo
                break;
            }
        }
        
        // Condicional para mostrar el resultado
        if (esPrimo && numero > 1) {
            System.out.println("El n�mero " + numero + " es primo.");
        } else {
            System.out.println("El n�mero " + numero + " no es primo.");
        }
        
        sc.close();
    }
}
