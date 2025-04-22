package presentacion;

import java.util.Scanner;

import logica.LogicaEmpleado;

public class Main {

	public static void main(String[] args) {
		
		LogicaEmpleado logicaEmpleado = new LogicaEmpleado();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Empleados ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Buscar empleado por teléfono");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Eliminar empleado por nombre");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Teléfono del empleado: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Puesto del empleado: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Salario del empleado: ");
                    double salario = scanner.nextDouble();
                    logicaEmpleado.registrarEmpleado(nombre, telefono, puesto, salario);
                    System.out.println("Empleado registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Nombre del empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    var empleadoPorNombre = logicaEmpleado.buscarEmpleadoPorNombre(nombreBuscar);
                    if (empleadoPorNombre != null) {
                        System.out.println("Empleado encontrado: " + empleadoPorNombre);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Teléfono del empleado a buscar: ");
                    String telefonoBuscar = scanner.nextLine();
                    var empleadoPorTelefono = logicaEmpleado.buscarEmpleadoPorTelefono(telefonoBuscar);
                    if (empleadoPorTelefono != null) {
                        System.out.println("Empleado encontrado: " + empleadoPorTelefono);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de todos los empleados:");
                    logicaEmpleado.mostrarEmpleados();
                    break;

                case 5:
                    System.out.print("Nombre del empleado a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean eliminado = logicaEmpleado.eliminarEmpleadoPorNombre(nombreEliminar);
                    if (eliminado) {
                        System.out.println("Empleado eliminado con éxito.");
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();

	}

}
