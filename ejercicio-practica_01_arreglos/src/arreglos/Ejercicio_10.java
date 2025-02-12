package arreglos;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10: Promedio de los elementos
		
        // Declaramos un array con números
        int[] numeros = {10, 20, 30, 40, 50};

        // Inicializamos la variable 'suma' en 0
        int suma = 0;

        // Recorremos el array con un bucle for-each y sumamos los elementos
        for (int num : numeros) {
            suma += num; // Sumamos cada número al total
        }

        // Calculamos el promedio
        double promedio = (double) suma / numeros.length;

        // Imprimimos el promedio
        System.out.println("El promedio es: " + promedio);
    }
}
