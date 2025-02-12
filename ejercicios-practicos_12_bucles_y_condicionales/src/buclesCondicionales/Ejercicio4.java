package buclesCondicionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Contar números pares entre 1 y 100.
		
        int contador = 0; // Variable para contar los números pares
        
        // Bucle para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Condicional para verificar si es par
                contador++; // Incrementa el contador si el número es par
            }
        }
        
        System.out.println("Hay " + contador + " números pares entre 1 y 100.");
    }
}
