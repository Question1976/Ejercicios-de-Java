package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Encontrar la suma de los n�meros impares de un array.
		
        int[] numeros = {1, 2, 3, 4, 5}; // Array de n�meros
        int sumaImpares = 0; // Suma de n�meros impares

        for (int numero : numeros) {
            if (numero % 2 != 0) { // Si el n�mero es impar
                sumaImpares += numero;
            }
        }

        System.out.println("La suma de los n�meros impares es: " + sumaImpares);
    }
}
