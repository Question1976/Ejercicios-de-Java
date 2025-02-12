package metodosRetorno;

import java.util.Scanner;

public class Operar {

	public static void main(String[] args) {
		
		Numeros numero = new Numeros();
		Scanner teclado = new Scanner(System.in); 
		int primerValor, segundoValor, tercerValor;
		
		System.out.println("Introduzca el primer valor: ");
		primerValor = teclado.nextInt();
		
		System.out.println("Introduzca el segundo valor: ");
		segundoValor = teclado.nextInt();
		
		System.out.println("Introduzca el tercer valor: ");
		tercerValor = teclado.nextInt();
		
		int mayor = numero.calcularMayorNumero(primerValor, segundoValor, tercerValor);
		int menor = numero.calcularMenorNumero(primerValor, segundoValor, tercerValor);
		
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
	}

}
