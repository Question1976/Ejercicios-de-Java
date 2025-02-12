package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Contar cuántos elementos son mayores que un valor dado.
		
        int[] numeros = {1, 5, 8, 3, 7}; // Array de números
        int limite = 4; // Valor límite
        int contador = 0; // Contador de números mayores

        for (int numero : numeros) {
            if (numero > limite) {
                contador++;
            }
        }

        System.out.println("Cantidad de números mayores que " + limite + ": " + contador);
    }
}
