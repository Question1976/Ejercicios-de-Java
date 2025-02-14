package logica;

import modelo.Mesa;

public class Restaurante {

	private Mesa[] mesas;   // Array de mesas en el restaurante
    private int contador;   // Contador de mesas registradas

    // Constructor que inicializa el restaurante con un n�mero fijo de mesas.
    public Restaurante(int cantidadMesas, int capacidadPedidosPorMesa) {
        mesas = new Mesa[cantidadMesas];
        for (int i = 0; i < cantidadMesas; i++) {
            mesas[i] = new Mesa(i + 1, capacidadPedidosPorMesa);
        }
        contador = cantidadMesas;
    }
    
    // M�todo para agregar un pedido a una mesa espec�fica.
    public void agregarPedidoAMesa(int numeroMesa, String pedido, double precio) {
        if (numeroMesa > 0 && numeroMesa <= contador) {
            mesas[numeroMesa - 1].agregarPedido(pedido, precio);
        } else {
            System.out.println("N�mero de mesa no v�lido.");
        }
    }
    
    // M�todo para mostrar los pedidos de una mesa.
    public void mostrarPedidosDeMesa(int numeroMesa) {
        if (numeroMesa > 0 && numeroMesa <= contador) {
            mesas[numeroMesa - 1].mostrarPedidos();
        } else {
            System.out.println("N�mero de mesa no v�lido.");
        }
    }
    
    // M�todo para calcular el total de la cuenta de una mesa.
    public void calcularCuentaDeMesa(int numeroMesa) {
        if (numeroMesa > 0 && numeroMesa <= contador) {
            double total = mesas[numeroMesa - 1].calcularTotal();
            System.out.println("El total de la cuenta para la mesa " + numeroMesa + " es: $" + total);
        } else {
            System.out.println("N�mero de mesa no v�lido.");
        }
    }
    
}
