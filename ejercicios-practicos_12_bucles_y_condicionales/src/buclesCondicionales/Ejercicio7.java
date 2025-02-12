package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Verificar si un número es primo.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        
        boolean esPrimo = true; // Variable para verificar si el número es primo
        
        // Bucle para verificar si el número es divisible por algún número menor a él
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false; // Si es divisible, no es primo
                break;
            }
        }
        
        // Condicional para mostrar el resultado
        if (esPrimo && numero > 1) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        
        sc.close();
    }
}
