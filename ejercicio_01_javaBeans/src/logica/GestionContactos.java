package logica;

import beans.Contacto;

public class GestionContactos {
	
	/**
	 * Atributos
	 */
	private Contacto[] contactos;	// Array tipo 'Contacto'.
	private int total;				// Contador.
	
	/**
	 * Constructores | Inicializaciones
	 */
	public GestionContactos(){
		contactos = new Contacto[10];	// Tamaño 10.
		total = 0;
	}
	
	/**
	 * === MÉTODOS DE LÓGICA DE APLICACIÓN/NEGOCIO ===
	 */
	
	/**
	 * COMPROBAR SI HAY ESPACIO LIBRE.
	 * @return true | false
	 */
	public boolean espacioLibre(){
		// Devuelve true si hay sitio 
		// para un nuevo contacto.
		if (total < 10){
			return true;
		} else {
			return false;
		}
	}
		
	/**
	 * AGREGAR UN CONTACTO.
	 * @param nombre, edad, email
	 * @return true | false
	 */
	public boolean agregar(String nombre, int edad, String email){
		// Si hay espacio, se añade el contacto al array 
		// y se devuelve true sino se devuelve false.
		if (total < 10){
			Contacto c = new Contacto(nombre, edad, email);
			contactos[total] = c;
			total++;
			return true;
		} else {
			return false;
		}
	}
		
	/**
	 * BUSCAR UN CONTACTO.
	 * @param nombre
	 * @return c
	 */
	public Contacto buscar(String nombre){
		Contacto c = null;
		for (int i = 0; i < total; i++){
			// Si el nombre del contacto al que se accede 
			// coincide con el recibido como parámetro
			// entonces se ha encontrado.
			if (contactos[i].getNombre().equals(nombre)){
				c = contactos[i];
				// No necesitamos seguir comprobando.
				break; 
			}
		}
		// Devuelve el contacto encontrado, y sino null.
		return c;
	}
		
	/**
	 * RECUPERAR TODOS LOS CONTACTOS.
	 * @return existentes
	 */
	public Contacto[] recuperarContactos(){
		// Crea un array con el tamaño de los existentes
		// y vuelca en el los contactos almacenados.
		Contacto[] existentes = new Contacto[total];
		for (int i = 0; i < total; i++){
			existentes[i] = contactos[i];
		}
		return existentes;
	}


}

