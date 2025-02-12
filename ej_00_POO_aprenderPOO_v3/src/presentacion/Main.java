package presentacion;

import modelo.Persona;

import java.util.Scanner;

import logica.PersonaLogica;

/**
 * Clase principal que interactúa con el usuario.
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        PersonaLogica logica = new PersonaLogica();
			
		// Agregar opciones para buscar y eliminar
		while (true) {
		    System.out.println("\nOpciones:");
		    System.out.println("1. Registrar persona");
		    System.out.println("2. Mostrar lista de personas");
		    System.out.println("3. Buscar persona");
		    System.out.println("4. Eliminar persona");
		    System.out.println("5. Salir");

		    System.out.print("Seleccione una opción: ");
		    int opcion = scanner.nextInt();
		    scanner.nextLine(); // Consumir salto de línea

		    switch (opcion) {
		        case 1:
		            System.out.print("Ingrese el nombre: ");
		            String nombre = scanner.nextLine();

		            System.out.print("Ingrese la edad: ");
		            int edad = scanner.nextInt();
		            scanner.nextLine(); // Consumir salto de línea

		            logica.registrarPersona(new Persona(nombre, edad));
		            break;

		        case 2:
		            System.out.println("\nLista de Personas Registradas:");
		            for (Persona p : logica.obtenerPersonas()) {
		                System.out.println(p.mostrarInformacion());
		            }
		            break;

		        case 3:
		            System.out.print("Ingrese el nombre a buscar: ");
		            String nombreBuscar = scanner.nextLine();
		            Persona encontrada = logica.buscarPersona(nombreBuscar);
		            if (encontrada != null) {
		                System.out.println("Persona encontrada: " + encontrada.mostrarInformacion());
		            } else {
		                System.out.println("Persona no encontrada.");
		            }
		            break;

		        case 4:
		            System.out.print("Ingrese el nombre a eliminar: ");
		            String nombreEliminar = scanner.nextLine();
		            if (logica.eliminarPersona(nombreEliminar)) {
		                System.out.println("Persona eliminada.");
		            } else {
		                System.out.println("No se encontró a la persona.");
		            }
		            break;

		        case 5:
		            System.out.println("Saliendo...");
		            scanner.close();
		            return;

		        default:
		            System.out.println("Opción no válida.");
		    }
		    
		}
		
	}
}
