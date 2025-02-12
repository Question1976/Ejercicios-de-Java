package logica;

import modelo.Persona;

/**
 * Clase que contiene la lógica para operar con objetos Persona.
 */
public class PersonaLogica {

	/**
     * Verifica si una persona es mayor de edad.
     * 
     * @param persona Objeto Persona a verificar.
     * @return true si la persona es mayor de edad, false en caso contrario.
     */
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
}
