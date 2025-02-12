package logica;

import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class LogicaVehiculos {

    private List<Vehiculo> vehiculos;

    // Constructor
    public LogicaVehiculos() {
        this.vehiculos = new ArrayList<>();  // Inicializa la lista de veh�culos
    }

    // M�todo para agregar un nuevo veh�culo a la empresa de alquiler
    public void agregarVehiculo(String modelo, String marca, String tipo, int anio) {
        // Crea un nuevo objeto Vehiculo y lo agrega a la lista de veh�culos
        vehiculos.add(new Vehiculo(modelo, marca, tipo, anio));
    }

    // M�todo para realizar una reserva de veh�culo
    public void reservarVehiculo(String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            // Si el modelo del veh�culo coincide con el solicitado, incrementa el contador de veces reservado
            if (vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                vehiculo.incrementarVecesReservado();
                System.out.println("El veh�culo '" + modelo + "' ha sido reservado.");
                return;
            }
        }
        System.out.println("No se encontr� el veh�culo con el modelo: " + modelo);
    }

    // M�todo para obtener el veh�culo m�s solicitado (el m�s reservado)
    public Vehiculo obtenerVehiculoMasSolicitado() {
        if (vehiculos.isEmpty()) {
            return null;  // Si no hay veh�culos, retorna null
        }
        Vehiculo masSolicitado = vehiculos.get(0);  // Asume que el primer veh�culo es el m�s solicitado
        for (Vehiculo vehiculo : vehiculos) {
            // Si el veh�culo ha sido m�s veces reservado que el m�s solicitado actual, lo actualiza
            if (vehiculo.getVecesReservado() > masSolicitado.getVecesReservado()) {
                masSolicitado = vehiculo;
            }
        }
        return masSolicitado;  // Retorna el veh�culo m�s solicitado
    }

    // M�todo para mostrar todos los veh�culos registrados
    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay veh�culos registrados.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);  // Imprime la informaci�n de cada veh�culo
            }
        }
    }

    // M�todo para ordenar los veh�culos por a�o de fabricaci�n
    public void ordenarPorAnio() {
        // Usamos el algoritmo de ordenaci�n de burbuja para ordenar los veh�culos por a�o
        for (int i = 0; i < vehiculos.size() - 1; i++) {
            for (int j = 0; j < vehiculos.size() - i - 1; j++) {
                // Compara los a�os de dos veh�culos consecutivos
                if (vehiculos.get(j).getAnio() > vehiculos.get(j + 1).getAnio()) {
                    // Si el veh�culo j es m�s reciente que el veh�culo j + 1, los intercambia
                    Vehiculo temp = vehiculos.get(j);
                    vehiculos.set(j, vehiculos.get(j + 1));
                    vehiculos.set(j + 1, temp);
                }
            }
        }
    }
}
