package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. Número par o impar
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt(); // Lee el número introducido por el usuario
        
        // Condicional para verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        sc.close(); // Cerramos el scanner
    }
}
