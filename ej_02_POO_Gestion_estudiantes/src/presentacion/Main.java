package presentacion;

import java.util.Scanner;

import logica.LogicaEstudiante;

public class Main {

	public static void main(String[] args) {
		
		LogicaEstudiante logicaEstudiante = new LogicaEstudiante();
        Scanner scanner = new Scanner(System.in);
        int opcion;	
        
        do {
            System.out.println("\n--- Gestión de Estudiantes ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante por nombre");
            System.out.println("3. Mostrar todos los estudiantes");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad del estudiante: ");
                    int edad = scanner.nextInt();
                    System.out.print("Calificación del estudiante: ");
                    double calificacion = scanner.nextDouble();
                    logicaEstudiante.registrarEstudiante(nombre, edad, calificacion);
                    System.out.println("Estudiante registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Nombre del estudiante a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    var estudiante = logicaEstudiante.buscarEstudiante(nombreBuscar);
                    if (estudiante != null) {
                        System.out.println("Estudiante encontrado: " + estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de todos los estudiantes:");
                    logicaEstudiante.mostrarEstudiantes();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();

	}

}
