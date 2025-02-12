package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Calcular la suma de los elementos de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        int suma = 0; // Acumulador de la suma

        // Recorremos el array
        for (int numero : numeros) {
            suma += numero; // Sumamos cada número
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}
