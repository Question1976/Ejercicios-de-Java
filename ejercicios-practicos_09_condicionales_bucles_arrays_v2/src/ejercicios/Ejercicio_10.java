package ejercicios;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		// Ejercicio 10. Crear un array con los números primos menores que n.
		
        int n = 10; // Número límite
        int[] primos = new int[n];
        int indice = 0;

        for (int i = 2; i < n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[indice++] = i;
            }
        }

        System.out.print("Números primos menores que " + n + ": ");
        for (int i = 0; i < indice; i++) {
            System.out.print(primos[i] + " ");
        }
    }
}
