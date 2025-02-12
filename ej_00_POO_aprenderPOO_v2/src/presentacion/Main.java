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

        System.out.println("Registro de Personas:");
        
        while (true) {
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            logica.registrarPersona(new Persona(nombre, edad));

            System.out.print("¿Desea registrar otra persona? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\nLista de Personas Registradas:");
        for (Persona p : logica.obtenerPersonas()) {
            System.out.println(p.mostrarInformacion());
        }

        scanner.close();
    }
}
