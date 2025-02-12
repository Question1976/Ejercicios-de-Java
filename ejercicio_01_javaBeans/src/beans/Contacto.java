package beans;

/**
 * JAVA BEAN.
 * Encapsular dentro de una clase
 * datos asociados a una entidad.
 */
public class Contacto {

	/**
	 * Atributos.
	 */
	private String nombre;
	private int edad;
	private String email;
	
	/**
	 * Constructores | Inicializaciones.
	 */
	public Contacto(String nombre, int edad, String email) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}
	
	/**
	 * Getters & Setters
	 */
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

