package modelo;

/**
 * Clase que representa a una Persona con atributos b�sicos.
 */
public class Persona {

	// Atributos
	private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // M�todo para mostrar informaci�n de la persona
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
