package presentacion;


import java.util.Scanner;

import logica.GestionNotas;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos un objeto de la clase que contiene
		// las operaciones de lógica de negocio/aplicación.
		GestionNotas gnotas = new GestionNotas();
		
		Scanner sc = new Scanner(System.in);
		
		// Opción elegida.
		int op;
		
		do {
			// MENÚ.
			System.out.println("1.- Agregar nota");
			System.out.println("2.- Ver nota media");
			System.out.println("3.- Ver aprobados");
			System.out.println("4.- Salir");
			
			op = Integer.parseInt(sc.nextLine());
			
			switch (op) {
				// AGREGAR NOTA.
				case 1:
					System.out.println("Nota: ");
					double d = Double.parseDouble(sc.nextLine());
					if (!gnotas.agregarNota(d)) {
						System.out.println("No se ha podido agregar la nota");
					}
					break;
				
				// VER NOTA MEDIA.
				case 2:
					System.out.println("Media: " + gnotas.media());
					break;
					
				// VER APROBADOS.
				case 3:
					System.out.println("Aprobados: " + gnotas.aprobados());
					break;
					
				// SALIR.
				case 4:
					sc.close();
					break;
					
				default:
					System.out.println("Debes escribir una opción válida");
					break;
				}
		} while (op != 4);

	}

}
