package presentacion;

import java.util.Scanner;

import logica.LogicaVehiculos;
import modelo.Vehiculo;

public class Main {

    public static void main(String[] args) {
        LogicaVehiculos logicaVehiculos = new LogicaVehiculos();
        Scanner scanner = new Scanner(System.in);

        // Menú para interactuar con el sistema
        while (true) {
            System.out.println("\n1. Agregar vehículo");
            System.out.println("2. Reservar vehículo");
            System.out.println("3. Obtener vehículo más solicitado");
            System.out.println("4. Mostrar todos los vehículos");
            System.out.println("5. Ordenar vehículos por año");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Tipo (Sedán, SUV, etc.): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Año de fabricación: ");
                    int anio = scanner.nextInt();
                    logicaVehiculos.agregarVehiculo(modelo, marca, tipo, anio);
                    break;
                case 2:
                    System.out.print("Modelo del vehículo a reservar: ");
                    modelo = scanner.nextLine();
                    logicaVehiculos.reservarVehiculo(modelo);
                    break;
                case 3:
                    Vehiculo masSolicitado = logicaVehiculos.obtenerVehiculoMasSolicitado();
                    if (masSolicitado != null) {
                        System.out.println("El vehículo más solicitado es: " + masSolicitado);
                    } else {
                        System.out.println("No hay vehículos registrados.");
                    }
                    break;
                case 4:
                    logicaVehiculos.mostrarVehiculos();
                    break;
                case 5:
                    logicaVehiculos.ordenarPorAnio();
                    System.out.println("Vehículos ordenados por año.");
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
