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
    
    /**
     * Busca una persona por nombre.
     * 
     * @param nombre Nombre de la persona a buscar.
     * @return Persona encontrada o null si no existe.
     */
    public Persona buscarPersona(String nombre) {
        for (Persona persona : listaPersonas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }

    /**
     * Elimina una persona por nombre.
     * 
     * @param nombre Nombre de la persona a eliminar.
     * @return true si la persona fue eliminada, false en caso contrario.
     */
    public boolean eliminarPersona(String nombre) {
        Persona persona = buscarPersona(nombre);
        if (persona != null) {
            listaPersonas.remove(persona);
            return true;
        }
        return false;
    }
}
