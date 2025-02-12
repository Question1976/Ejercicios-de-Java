package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Encontrar el n�mero mayor en un array. 
		
        int[] numeros = {3, 7, 2, 9, 12, 5}; // Array de n�meros
        int mayor = numeros[0]; // Inicializamos con el primer n�mero

        // Recorremos el array desde el segundo elemento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) { // Si encontramos un n�mero mayor
                mayor = numeros[i];
            }
        }

        System.out.println("El n�mero mayor es: " + mayor);
    }
}
