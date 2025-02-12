package logica;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class LogicaProducto {

	private List<Producto> productos;

    public LogicaProducto() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        productos.add(new Producto(nombre, precio, cantidad));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
