package presentacion;

import java.util.Scanner;

import logica.LogicaVehiculos;
import modelo.Vehiculo;

public class Main {

    public static void main(String[] args) {
        LogicaVehiculos logicaVehiculos = new LogicaVehiculos();
        Scanner scanner = new Scanner(System.in);

        // Men� para interactuar con el sistema
        while (true) {
            System.out.println("\n1. Agregar veh�culo");
            System.out.println("2. Reservar veh�culo");
            System.out.println("3. Obtener veh�culo m�s solicitado");
            System.out.println("4. Mostrar todos los veh�culos");
            System.out.println("5. Ordenar veh�culos por a�o");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opci�n: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Tipo (Sed�n, SUV, etc.): ");
                    String tipo = scanner.nextLine();
                    System.out.print("A�o de fabricaci�n: ");
                    int anio = scanner.nextInt();
                    logicaVehiculos.agregarVehiculo(modelo, marca, tipo, anio);
                    break;
                case 2:
                    System.out.print("Modelo del veh�culo a reservar: ");
                    modelo = scanner.nextLine();
                    logicaVehiculos.reservarVehiculo(modelo);
                    break;
                case 3:
                    Vehiculo masSolicitado = logicaVehiculos.obtenerVehiculoMasSolicitado();
                    if (masSolicitado != null) {
                        System.out.println("El veh�culo m�s solicitado es: " + masSolicitado);
                    } else {
                        System.out.println("No hay veh�culos registrados.");
                    }
                    break;
                case 4:
                    logicaVehiculos.mostrarVehiculos();
                    break;
                case 5:
                    logicaVehiculos.ordenarPorAnio();
                    System.out.println("Veh�culos ordenados por a�o.");
                    break;
                case 6:
                    System.out.println("�Hasta luego!");
                    return;
                default:
                    System.out.println("Opci�n no v�lida.");
            }
        }
    }
}
