package metodos;

import java.util.Scanner;


public class Operacion {

	int primerNumero;
	int segundoNumero;
	int suma, resta, multiplicacion, division;
	
	public void pedirNumeros() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el primer número: ");
		primerNumero = teclado.nextInt();
		System.out.println("Ingresa el segundo número: ");
		segundoNumero = teclado.nextInt();		
	}	
	
	public void mostrarMenu() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("1. Sumar números");
			System.out.println("2. Restar números");
			System.out.println("3. Multiplicar números");
			System.out.println("4. Dividir números");
			System.out.println("5. Salir");
			System.out.println("Introduzca opción: ");
			opcion = teclado.nextInt();
						
		switch (opcion) {
			case 1:
				pedirNumeros();
				sumarNumeros();
				break;
				
			case 2:
				pedirNumeros();
				restarNumeros();
				break;
				
			case 3:
				pedirNumeros();
				multiplicarNumeros();
				break;
				
			case 4:
				pedirNumeros();
				dividirNumeros();
				break;
				
			case 5:
				teclado.close();
				break;
				
			default:
				System.out.println("Eliga opción válida, del 1 al 5");
				break;
			}
							
		} while (opcion != 5);
			
	}
	
	
	public void sumarNumeros() {
		suma = primerNumero + segundoNumero;
		System.out.println("La suma de los números es: " + suma);
	}
	
	public void restarNumeros() {
		resta = primerNumero - segundoNumero;
		System.out.println("La resta de los números es: " + resta);
	}
	
	public void multiplicarNumeros() {
		multiplicacion = primerNumero * segundoNumero;
		System.out.println("La multiplicación de los números es: " + multiplicacion);
	}
	
	public void dividirNumeros() {
		division = primerNumero / segundoNumero;
		System.out.println("La división de los números es: " + division);
	}
	
	
}
