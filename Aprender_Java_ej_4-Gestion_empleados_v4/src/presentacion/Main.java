package presentacion;

import logica.LogicaEmpleado;
import modelo.Empleado;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicaEmpleado logicaEmpleado = new LogicaEmpleado();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión Avanzada de Empleados ---");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Buscar empleado por teléfono");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Eliminar empleado por nombre");
            System.out.println("6. Calcular media de los salarios");
            System.out.println("7. Empleado con mayor salario");
            System.out.println("8. Empleado con menor salario");
            System.out.println("9. Empleado con más experiencia");
            System.out.println("10. Filtrar empleados por rango de salario");
            System.out.println("11. Ordenar empleados por nombre");
            System.out.println("12. Ordenar empleados por salario");
            System.out.println("13. Salir");
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
                    System.out.print("Años de experiencia: ");
                    int experiencia = scanner.nextInt();
                    logicaEmpleado.registrarEmpleado(nombre, telefono, puesto, salario, experiencia);
                    System.out.println("Empleado registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Nombre del empleado a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    Empleado empleadoPorNombre = logicaEmpleado.buscarEmpleadoPorNombre(nombreBuscar);
                    System.out.println((empleadoPorNombre != null) ? empleadoPorNombre : "Empleado no encontrado.");
                    break;

                case 3:
                    System.out.print("Teléfono del empleado a buscar: ");
                    String telefonoBuscar = scanner.nextLine();
                    Empleado empleadoPorTelefono = logicaEmpleado.buscarEmpleadoPorTelefono(telefonoBuscar);
                    System.out.println((empleadoPorTelefono != null) ? empleadoPorTelefono : "Empleado no encontrado.");
                    break;

                case 4:
                    logicaEmpleado.mostrarEmpleados();
                    break;

                case 5:
                    System.out.print("Nombre del empleado a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean eliminado = logicaEmpleado.eliminarEmpleadoPorNombre(nombreEliminar);
                    System.out.println(eliminado ? "Empleado eliminado con éxito." : "Empleado no encontrado.");
                    break;

                case 6:
                    System.out.println("Media de los salarios: " + logicaEmpleado.calcularMediaSalarios());
                    break;

                case 7:
                    Empleado mayor = logicaEmpleado.obtenerEmpleadoMayorSalario();
                    System.out.println((mayor != null) ? "Empleado con mayor salario: " + mayor : "No hay empleados.");
                    break;

                case 8:
                    Empleado menor = logicaEmpleado.obtenerEmpleadoMenorSalario();
                    System.out.println((menor != null) ? "Empleado con menor salario: " + menor : "No hay empleados.");
                    break;

                case 9:
                    Empleado masExperiencia = logicaEmpleado.obtenerEmpleadoMasExperiencia();
                    System.out.println((masExperiencia != null) ? "Empleado con más experiencia: " + masExperiencia : "No hay empleados.");
                    break;

                case 10:
                    System.out.print("Introduce el salario mínimo: ");
                    double minimo = scanner.nextDouble();
                    System.out.print("Introduce el salario máximo: ");
                    double maximo = scanner.nextDouble();
                    List<Empleado> filtrados = logicaEmpleado.filtrarPorRangoSalario(minimo, maximo);
                    if (filtrados.isEmpty()) {
                        System.out.println("No se encontraron empleados en ese rango.");
                    } else {
                        System.out.println("Empleados en el rango de salario:");
                        for (Empleado emp : filtrados) {
                            System.out.println(emp);
                        }
                    }
                    break;

                case 11:
                    logicaEmpleado.ordenarPorNombre();
                    System.out.println("Empleados ordenados por nombre.");
                    break;

                case 12:
                    logicaEmpleado.ordenarPorSalario();
                    System.out.println("Empleados ordenados por salario.");
                    break;

                case 13:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 13);

        scanner.close();
    }
}

