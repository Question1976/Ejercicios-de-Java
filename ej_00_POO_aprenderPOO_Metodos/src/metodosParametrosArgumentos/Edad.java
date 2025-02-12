package metodosParametrosArgumentos;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Scanner teclado = new Scanner(System.in);

		int edad;
		float altura;
		String nombre;
		
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Introduzca su nombre: ");
		nombre = teclado.next();
		
		System.out.println("Introduzca su altura: ");
		altura = teclado.nextFloat();
		
		persona.comprobarSiesMayorDeEdad(edad, nombre, altura);
	}

}
