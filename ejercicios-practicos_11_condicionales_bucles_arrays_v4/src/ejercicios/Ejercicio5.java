package ejercicios;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Ejercicio 5. Encontrar el segundo número más grande en un array.
		
        int[] numeros = {7, 3, 9, 5, 2}; // Array de números
        int mayor = Integer.MIN_VALUE, segundoMayor = Integer.MIN_VALUE;

        for (int numero : numeros) {
            if (numero > mayor) {
                segundoMayor = mayor;
                mayor = numero;
            } else if (numero > segundoMayor && numero != mayor) {
                segundoMayor = numero;
            }
        }

        System.out.println("El segundo número más grande es: " + segundoMayor);
    }
}
