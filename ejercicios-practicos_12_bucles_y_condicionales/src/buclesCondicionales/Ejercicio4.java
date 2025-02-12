package buclesCondicionales;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Contar n�meros pares entre 1 y 100.
		
        int contador = 0; // Variable para contar los n�meros pares
        
        // Bucle para recorrer los n�meros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Condicional para verificar si es par
                contador++; // Incrementa el contador si el n�mero es par
            }
        }
        
        System.out.println("Hay " + contador + " n�meros pares entre 1 y 100.");
    }
}
