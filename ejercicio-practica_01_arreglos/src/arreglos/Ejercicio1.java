package arreglos;

public class Ejercicio1 {
    public static void main(String[] args) {
    	
    	// Ejercicio 1: Encontrar el número mayor
    	
    	// Declaramos un array de números enteros
        int[] numeros = {10, 20, 5, 8, 30, 15};

        // Inicializamos la variable 'mayor' con el primer elemento del array
        int mayor = numeros[0];

        // Recorremos el array usando un bucle for-each
        for (int num : numeros) {
            // Si encontramos un número mayor que el valor de 'mayor', lo actualizamos
            if (num > mayor) {
                mayor = num; // Actualizamos el valor de 'mayor'
            }
        }

        // Imprimimos el número mayor encontrado en el array
        System.out.println("El número mayor es: " + mayor);
    }
}
