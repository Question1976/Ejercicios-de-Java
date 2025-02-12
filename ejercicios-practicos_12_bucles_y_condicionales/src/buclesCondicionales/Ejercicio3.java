package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Tabla de multiplicar de un número.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt(); // Número para la tabla de multiplicar
        
        // Bucle para mostrar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        sc.close();
    }
}
