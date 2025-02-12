package presentacion;

import java.util.Scanner;

import logica.Escuela;
import modelo.Estudiante;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Crear una escuela con capacidad para 5 estudiantes.
		Escuela escuela = new Escuela(5);

		// Bucle principal del menú.
		while (true) {
			System.out.println("\nBienvenido al sistema de gestión de estudiantes.");
			System.out.println("1. Registrar un estudiante");
			System.out.println("2. Listar todos los estudiantes");
			System.out.println("3. Buscar un estudiante por nombre");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar buffer

			switch (opcion) {
			case 1: // Registrar un estudiante
				System.out.print("Introduce el nombre del estudiante: ");
				String nombre = scanner.nextLine();
				System.out.print("Introduce la edad del estudiante: ");
				int edad = scanner.nextInt();

				System.out.print("¿Cuántas calificaciones tiene el estudiante? ");
				int numNotas = scanner.nextInt();
				double[] notas = new double[numNotas];

				for (int i = 0; i < numNotas; i++) {
					System.out.print("Introduce la calificación " + (i + 1) + ": ");
					notas[i] = scanner.nextDouble();
				}
				scanner.nextLine(); // Limpiar buffer

				Estudiante estudiante = new Estudiante(nombre, edad, notas);
				escuela.registrarEstudiante(estudiante);
				System.out.println("Estudiante registrado con éxito.");
				break;

			case 2: // Listar todos los estudiantes
				escuela.listarEstudiantes();
				break;

			case 3: // Buscar un estudiante por nombre
				System.out.print("Introduce el nombre del estudiante a buscar: ");
				String nombreBusqueda = scanner.nextLine();
				escuela.buscarEstudiante(nombreBusqueda);
				break;

			case 4: // Salir
				System.out.println("Gracias por usar el sistema de gestión de estudiantes. ¡Hasta pronto!");
				scanner.close();
				return;

			default:
				System.out.println("Opción no válida. Intenta nuevamente.");
				break;
			}
		}
	}
}
