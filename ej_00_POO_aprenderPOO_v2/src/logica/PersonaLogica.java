package logica;

import modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que contiene la lógica para operar con objetos Persona.
 */
public class PersonaLogica {
	
	private List<Persona> listaPersonas;
	
	// Constructor
    public PersonaLogica() {
        listaPersonas = new ArrayList<>();
    }
    
    /**
     * Agrega una persona a la lista.
     * 
     * @param persona Objeto Persona a agregar.
     */
    public void registrarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    /**
     * Obtiene la lista de personas registradas.
     * 
     * @return Lista de personas.
     */
    public List<Persona> obtenerPersonas() {
        return listaPersonas;
    }
}
