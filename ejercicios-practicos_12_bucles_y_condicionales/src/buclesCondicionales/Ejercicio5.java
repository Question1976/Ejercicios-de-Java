package buclesCondicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Encontrar el mayor de tres n�meros.
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer n�mero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo n�mero: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer n�mero: ");
        int num3 = sc.nextInt();
        
        // Condicional para encontrar el n�mero mayor
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor n�mero es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor n�mero es: " + num2);
        } else {
            System.out.println("El mayor n�mero es: " + num3);
        }
        
        sc.close();
    }
}
