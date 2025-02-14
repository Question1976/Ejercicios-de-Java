package modelo;

public class Mesa {

	private int numeroMesa;          // N�mero de la mesa
    private String[] pedidos;        // Array de pedidos realizados en la mesa
    private double[] precios;        // Precios de los pedidos
    private int contadorPedidos;     // Contador de pedidos realizados
    
    // Constructor que inicializa la mesa con su n�mero y capacidad de pedidos.
    public Mesa(int numeroMesa, int capacidadPedidos) {
        this.numeroMesa = numeroMesa;
        this.pedidos = new String[capacidadPedidos];
        this.precios = new double[capacidadPedidos];
        this.contadorPedidos = 0;
    }
    
    // M�todo para agregar un pedido a la mesa.
    public void agregarPedido(String pedido, double precio) {
        if (contadorPedidos < pedidos.length) {
            pedidos[contadorPedidos] = pedido;
            precios[contadorPedidos] = precio;
            contadorPedidos++;
        } else {
            System.out.println("No se pueden agregar m�s pedidos. Capacidad m�xima alcanzada.");
        }
    }
    
    // M�todo para mostrar los pedidos de la mesa.
    public void mostrarPedidos() {
        if (contadorPedidos == 0) {
            System.out.println("No hay pedidos en esta mesa.");
        } else {
            System.out.println("Pedidos de la mesa " + numeroMesa + ":");
            for (int i = 0; i < contadorPedidos; i++) {
                System.out.println("- " + pedidos[i] + " ($" + precios[i] + ")");
            }
        }
    }
    
    // M�todo para calcular el total de la cuenta.
    public double calcularTotal() {
        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        return total;
    }
    
    // Getter para el n�mero de la mesa.
    public int getNumeroMesa() {
        return numeroMesa;
    }
    
}
