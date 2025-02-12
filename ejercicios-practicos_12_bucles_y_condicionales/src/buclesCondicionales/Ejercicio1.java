package buclesCondicionales;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// Ejercicio 1. Suma de números del 1 al 100
		
        int suma = 0; // Variable para almacenar la suma
        
        // Bucle que recorre los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            suma += i; // Se suma el valor de i a la variable suma
        }
        
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
