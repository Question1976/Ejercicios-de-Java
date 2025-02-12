package presentacion;

import java.util.Scanner;

import logica.LogicaEmpleado;

public class Main {

	public static void main(String[] args) {
		
		LogicaEmpleado logicaEmpleado = new LogicaEmpleado();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- Gesti�n de Empleados ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Mostrar todos los empleados");
            System.out.println("4. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Puesto del empleado: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Salario del empleado: ");
                    double salario = scanner.nextDouble();
                    logicaEmpleado.registrarEmpleado(nombre, puesto, salario);
                    System.out.println("Empleado registrado con �xito.");
                    break;

                case 2:
                    System.out.print("Nombre del empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    var empleado = logicaEmpleado.buscarEmpleado(nombreBuscar);
                    if (empleado != null) {
                        System.out.println("Empleado encontrado: " + empleado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de todos los empleados:");
                    logicaEmpleado.mostrarEmpleados();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opci�n inv�lida. Int�ntalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();

	}

}
