package buclesCondicionales;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Sumar los números impares entre 1 y 100.
		
        int suma = 0; // Variable para almacenar la suma
        
        // Bucle para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Condicional para verificar si el número es impar
                suma += i; // Se suma el número impar
            }
        }
        
        System.out.println("La suma de los números impares entre 1 y 100 es: " + suma);
    }
}
