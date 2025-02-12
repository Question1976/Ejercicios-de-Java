package presentacion;

import java.util.Scanner;

import beans.Contacto;
import logica.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Instanciar obj de la clase 'GestionContactos' 
		 * que contiene las operaciones de l�gica de 
		 * negocio/aplicaci�n.
		 */
		GestionContactos gestor = new GestionContactos();

		// Lectura del teclado. 
		Scanner sc = new Scanner(System.in);

		// Variable para elegir una opci�n.
		int op;

		// Bucle principal.
		do {

			/**
			 * Variables para guardar los datos
			 * de los contactos que se pidan al usuario.
			 */
			String nombre;
			int edad;
			String email;
			
			// Men�.
			System.out.println("1.- A�adir contacto.");
			System.out.println("2.- Buscar contacto.");
			System.out.println("3.- Mostrar todos.");
			System.out.println("4.- Salir.");

			/**
			 * Leer todo como texto. Truco para no 
			 * tener varios 'Scanner', y se convierte
			 * a n�mero.
			 */
			op = Integer.parseInt(sc.nextLine());
			
			switch (op) {
				// A�ADIR CONTACTO.
				case 1:
					if (gestor.espacioLibre()) {
						System.out.println("Nombre:");
						nombre = sc.nextLine();
						System.out.println("Edad: ");
						edad = Integer.parseInt(sc.nextLine());
						System.out.println("Email: ");
						email = sc.nextLine();
						gestor.agregar(nombre, edad, email);
					} else {
						System.out.println("Agenda llena, no hay espacio.");
					}	
					break;
					
				// BUSCAR CONTACTO.
				case 2:
					System.out.println("Nombre: ");
					nombre = sc.nextLine();
					Contacto c = gestor.buscar(nombre);
					// Si es null, es que no se ha encontrado.
					if (c == null) {
						System.out.println("No se encontr� el contacto");
					} else {
						System.out.println(c.getNombre() + "-" + c.getEmail() + "-" + c.getEdad());
					}
					break;
	
				// MOSTRAR TODOS LOS CONTACTOS.
				case 3:
					// En la variable se guarda 
					// el array devuelto por el m�todo.
					Contacto[] todos = gestor.recuperarContactos();
					for (Contacto con : todos) {
						System.out.println(con.getNombre() + "-" + con.getEmail() + "-" + con.getEdad());
					}
					break;
					
				// SALIR.
				case 4:
					sc.close();
					break;
					
				// ERROR.
				default:
					System.out.println("Debes escribir una opci�n v�lida.");
				}
			
		} while (op != 4);

	}

}

