package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Ejercicio 2. N�mero par o impar
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un n�mero: ");
        int numero = sc.nextInt(); // Lee el n�mero introducido por el usuario
        
        // Condicional para verificar si el n�mero es par o impar
        if (numero % 2 == 0) {
            System.out.println("El n�mero " + numero + " es par.");
        } else {
            System.out.println("El n�mero " + numero + " es impar.");
        }
        
        sc.close(); // Cerramos el scanner
    }
}
