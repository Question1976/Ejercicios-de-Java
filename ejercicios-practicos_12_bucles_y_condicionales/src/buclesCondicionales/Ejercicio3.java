package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Tabla de multiplicar de un n�mero.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un n�mero: ");
        int numero = sc.nextInt(); // N�mero para la tabla de multiplicar
        
        // Bucle para mostrar la tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        sc.close();
    }
}
