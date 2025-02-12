package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Crear una tabla de multiplicar como un array bidimensional.
		
        int n = 5; // Tamaño de la tabla
        int[][] tabla = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Tabla de multiplicar:");
        for (int[] fila : tabla) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
