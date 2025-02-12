package arreglos;

public class Ejercicio6 {
    public static void main(String[] args) {
    	
    	// Ejercicio 6: Calcular la suma de los elementos
    	
        // Declaramos un array con números
        int[] numeros = {1, 2, 3, 4, 5};

        // Inicializamos una variable 'suma' con 0
        int suma = 0;

        // Recorremos el array con un bucle for-each y sumamos cada número
        for (int num : numeros) {
            suma += num; // Sumamos el valor de 'num' a la variable 'suma'
        }

        // Imprimimos la suma de todos los elementos
        System.out.println("La suma de los elementos es: " + suma);
    }
}

