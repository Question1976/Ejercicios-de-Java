package logica;

import modelo.Producto;

public class GestionTienda {

	private Producto[] productos; // Array de productos disponibles
    private int contador;         // Contador de productos agregados
    
    // Constructor de la tienda que inicializa el 
    // array de productos.
    public GestionTienda(int tamaño) {
    	productos = new Producto[tamaño];
    }
    
    // Método para agregar un producto a la tienda.
    public void agregarProducto(Producto producto) {
        if (contador < productos.length) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("La tienda está llena. No se puede agregar más productos.");
        }
    }
    
    // Método para mostrar todos los productos en la tienda.
    public void mostrarProductos() {
        if (contador == 0) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (int i = 0; i < contador; i++) {
                productos[i].mostrarInformacion();
                System.out.println(); // Espacio entre productos
            }
        }
    }
    
    // Método para buscar un producto por nombre y mostrar su información.
    public void buscarProducto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                productos[i].mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
    

