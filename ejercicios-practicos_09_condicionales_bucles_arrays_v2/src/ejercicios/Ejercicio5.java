package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Encontrar la suma de los números impares de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de números
        int sumaImpares = 0; // Suma de números impares

        for (int numero : numeros) {
            if (numero % 2 != 0) { // Si el número es impar
                sumaImpares += numero;
            }
        }

        System.out.println("La suma de los números impares es: " + sumaImpares);
    }
}
