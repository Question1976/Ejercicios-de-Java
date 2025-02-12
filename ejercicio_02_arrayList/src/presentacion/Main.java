package presentacion;

import java.util.Scanner;

import logica.GestionNotas;

public class Main {

	public static void main(String[] args) {
		
		GestionNotas gnotas = new GestionNotas();
		int op;
		Scanner sc = new Scanner(System.in);
		double nota;
		
		do {
			System.out.println("1. A�adir nota");
			System.out.println("2. Ver media");
			System.out.println("3. Ver aprobados");
			System.out.println("4. Salir");
			
			op = Integer.parseInt(sc.nextLine());
			
			switch (op) {
				case 1:
					System.out.println("Introduce nota: ");
					nota = Double.parseDouble(sc.nextLine());
					gnotas.guardarNota(nota);
					break;
				case 2:
					System.out.println("Media actual: " + gnotas.media());
					break;
				case 3:
					System.out.println("Aprobados: " + gnotas.aprobados());
					break;
				case 4:
					sc.close();
					break;
				default:
					System.out.println("Introduce opci�n v�lida");
					break;
			}
		} while (op != 4);
		
	}

}
