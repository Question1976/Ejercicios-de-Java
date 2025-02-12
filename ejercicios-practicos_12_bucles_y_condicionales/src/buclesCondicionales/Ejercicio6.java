package buclesCondicionales;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Sumar los n�meros impares entre 1 y 100.
		
        int suma = 0; // Variable para almacenar la suma
        
        // Bucle para recorrer los n�meros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Condicional para verificar si el n�mero es impar
                suma += i; // Se suma el n�mero impar
            }
        }
        
        System.out.println("La suma de los n�meros impares entre 1 y 100 es: " + suma);
    }
}
