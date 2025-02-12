package logica;

import modelo.Estudiante;

public class Escuela {

	private Estudiante[] estudiantes; // Array para almacenar los estudiantes
	private int contador; // Contador de estudiantes registrados

	// Constructor que inicializa el array de estudiantes.
	public Escuela(int capacidad) {
		estudiantes = new Estudiante[capacidad];
		contador = 0;
	}

	// M�todo para registrar un estudiante en la escuela.
	public void registrarEstudiante(Estudiante estudiante) {
		if (contador < estudiantes.length) {
			estudiantes[contador] = estudiante;
			contador++;
		} else {
			System.out.println("No se pueden registrar m�s estudiantes. Capacidad m�xima alcanzada.");
		}
	}

	// M�todo para listar todos los estudiantes.
	public void listarEstudiantes() {
		if (contador == 0) {
			System.out.println("No hay estudiantes registrados.");
		} else {
			System.out.println("Lista de estudiantes:");
			for (int i = 0; i < contador; i++) {
				estudiantes[i].mostrarInformacion();
				System.out.println(); // Espacio entre estudiantes
			}
		}
	}

	// M�todo para buscar un estudiante por nombre.
	public void buscarEstudiante(String nombre) {
		boolean encontrado = false;
		for (int i = 0; i < contador; i++) {
			if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
				estudiantes[i].mostrarInformacion();
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Estudiante no encontrado.");
		}
	}

}
