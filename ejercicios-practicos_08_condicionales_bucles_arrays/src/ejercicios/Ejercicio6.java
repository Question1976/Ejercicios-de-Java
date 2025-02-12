package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Invertir los elementos de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array original

        // Recorremos hasta la mitad para intercambiar
        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i]; // Guardamos el valor actual
            numeros[i] = numeros[numeros.length - 1 - i]; // Asignamos el valor opuesto
            numeros[numeros.length - 1 - i] = temporal; // Restauramos el valor guardado
        }

        // Mostramos el array invertido
        System.out.print("Array invertido: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
