package presentacion;

import modelo.Persona;
import logica.PersonaLogica;

/**
 * Clase principal que interactúa con el usuario.
 */
public class Main {

	public static void main(String[] args) {
		
        // Crear una persona
        Persona persona = new Persona("Juan Pérez", 25);

        // Instanciar la lógica
        PersonaLogica logica = new PersonaLogica();

        // Mostrar información de la persona
        System.out.println(persona.mostrarInformacion());

        // Verificar si es mayor de edad
        if (logica.esMayorDeEdad(persona)) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
        }
    }
}
