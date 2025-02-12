package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7. Calcular el producto de todos los elementos de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        int producto = 1; // Producto inicial

        for (int numero : numeros) {
            producto *= numero; // Multiplicamos cada elemento
        }

        System.out.println("El producto de los elementos es: " + producto);
    }
}
