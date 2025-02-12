package logica;

import modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class LogicaProducto {

	private List<Producto> productos;

	public LogicaProducto() {
		this.productos = new ArrayList<>();
	}

	public void registrarProducto(String nombre, String codigo, String categoria, double precio, int cantidad) {
		productos.add(new Producto(nombre, codigo, categoria, precio, cantidad));
	}

	public Producto buscarPorNombre(String nombre) {
		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto; // Retorna el producto si encuentra coincidencia
			}
		}
		return null; // Si no encuentra, retorna null
	}

	public Producto buscarPorCodigo(String codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo().equalsIgnoreCase(codigo)) {
				return producto; // Retorna el producto si encuentra coincidencia
			}
		}
		return null; // Si no encuentra, retorna null
	}

	public double calcularPrecioPromedio() {
		if (productos.isEmpty())
			return 0;

		double suma = 0;
		for (Producto producto : productos) {
			suma += producto.getPrecio(); // Suma los precios de todos los productos
		}
		return suma / productos.size(); // Divide la suma entre el número de productos
	}

	public Producto obtenerProductoMasCaro() {
		// Si la lista está vacía, retorna null
		if (productos.isEmpty())
			return null;

		// Inicializa el primer producto como el más caro
		Producto masCaro = productos.get(0);

		// Recorre la lista de productos para encontrar el más caro
		for (int i = 1; i < productos.size(); i++) {
			Producto producto = productos.get(i); // Obtiene el producto en la posición i
			if (producto.getPrecio() > masCaro.getPrecio()) {
				masCaro = producto; // Si encuentra un producto más caro, lo actualiza
			}
		}
		return masCaro; // Retorna el producto más caro encontrado
	}

	public Producto obtenerProductoMasBarato() {
		// Si la lista está vacía, retorna null
		if (productos.isEmpty())
			return null;

		// Inicializa el primer producto como el más barato
		Producto masBarato = productos.get(0);

		// Recorre la lista de productos para encontrar el más barato
		for (int i = 1; i < productos.size(); i++) {
			Producto producto = productos.get(i); // Obtiene el producto en la posición i
			if (producto.getPrecio() < masBarato.getPrecio()) {
				masBarato = producto; // Si encuentra un producto más barato, lo actualiza
			}
		}
		return masBarato; // Retorna el producto más barato encontrado
	}

	public void ordenarPorNombre() {
		// Usamos un algoritmo de ordenación de burbuja para ordenar los productos por
		// nombre
		for (int i = 0; i < productos.size() - 1; i++) {
			for (int j = 0; j < productos.size() - i - 1; j++) {
				// Compara dos productos consecutivos por su nombre
				if (productos.get(j).getNombre().compareToIgnoreCase(productos.get(j + 1).getNombre()) > 0) {
					// Si el producto j es mayor que el producto j + 1, los intercambia
					Producto temp = productos.get(j);
					productos.set(j, productos.get(j + 1));
					productos.set(j + 1, temp);
				}
			}
		}
	}

	public void ordenarPorPrecio() {
		// Usamos un algoritmo de ordenación de burbuja para ordenar los productos por
		// precio
		for (int i = 0; i < productos.size() - 1; i++) {
			for (int j = 0; j < productos.size() - i - 1; j++) {
				// Compara los precios de dos productos consecutivos
				if (productos.get(j).getPrecio() > productos.get(j + 1).getPrecio()) {
					// Si el precio del producto j es mayor que el producto j + 1, los intercambia
					Producto temp = productos.get(j);
					productos.set(j, productos.get(j + 1));
					productos.set(j + 1, temp);
				}
			}
		}
	}

	public void mostrarProductos() {
		if (productos.isEmpty()) {
			System.out.println("No hay productos registrados.");
		} else {
			for (Producto producto : productos) {
				System.out.println(producto);
			}
		}
	}
}
