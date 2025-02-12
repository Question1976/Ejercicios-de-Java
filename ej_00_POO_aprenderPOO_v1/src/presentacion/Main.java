package presentacion;

import modelo.Persona;
import logica.PersonaLogica;

/**
 * Clase principal que interact�a con el usuario.
 */
public class Main {

	public static void main(String[] args) {
		
        // Crear una persona
        Persona persona = new Persona("Juan P�rez", 25);

        // Instanciar la l�gica
        PersonaLogica logica = new PersonaLogica();

        // Mostrar informaci�n de la persona
        System.out.println(persona.mostrarInformacion());

        // Verificar si es mayor de edad
        if (logica.esMayorDeEdad(persona)) {
            System.out.println(persona.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad.");
        }
    }
}
