package logica;

import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class LogicaVehiculos {

    private List<Vehiculo> vehiculos;

    // Constructor
    public LogicaVehiculos() {
        this.vehiculos = new ArrayList<>();  // Inicializa la lista de vehículos
    }

    // Método para agregar un nuevo vehículo a la empresa de alquiler
    public void agregarVehiculo(String modelo, String marca, String tipo, int anio) {
        // Crea un nuevo objeto Vehiculo y lo agrega a la lista de vehículos
        vehiculos.add(new Vehiculo(modelo, marca, tipo, anio));
    }

    // Método para realizar una reserva de vehículo
    public void reservarVehiculo(String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            // Si el modelo del vehículo coincide con el solicitado, incrementa el contador de veces reservado
            if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                vehiculo.incrementarVecesReservado();
                System.out.println("El vehículo '" + modelo + "' ha sido reservado.");
                return;
            }
        }
        System.out.println("No se encontró el vehículo con el modelo: " + modelo);
    }

    // Método para obtener el vehículo más solicitado (el más reservado)
    public Vehiculo obtenerVehiculoMasSolicitado() {
        if (vehiculos.isEmpty()) {
            return null;  // Si no hay vehículos, retorna null
        }
        Vehiculo masSolicitado = vehiculos.get(0);  // Asume que el primer vehículo es el más solicitado
        for (Vehiculo vehiculo : vehiculos) {
            // Si el vehículo ha sido más veces reservado que el más solicitado actual, lo actualiza
            if (vehiculo.getVecesReservado() > masSolicitado.getVecesReservado()) {
                masSolicitado = vehiculo;
            }
        }
        return masSolicitado;  // Retorna el vehículo más solicitado
    }

    // Método para mostrar todos los vehículos registrados
    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);  // Imprime la información de cada vehículo
            }
        }
    }

    // Método para ordenar los vehículos por año de fabricación
    public void ordenarPorAnio() {
        // Usamos el algoritmo de ordenación de burbuja para ordenar los vehículos por año
        for (int i = 0; i < vehiculos.size() - 1; i++) {
            for (int j = 0; j < vehiculos.size() - i - 1; j++) {
                // Compara los años de dos vehículos consecutivos
                if (vehiculos.get(j).getAnio() > vehiculos.get(j + 1).getAnio()) {
                    // Si el vehículo j es más reciente que el vehículo j + 1, los intercambia
                    Vehiculo temp = vehiculos.get(j);
                    vehiculos.set(j, vehiculos.get(j + 1));
                    vehiculos.set(j + 1, temp);
                }
            }
        }
    }
}
