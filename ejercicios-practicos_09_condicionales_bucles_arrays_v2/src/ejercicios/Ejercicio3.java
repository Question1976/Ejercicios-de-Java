package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Ejercicio 3. Contar cu�ntos elementos son mayores que un valor dado.
		
        int[] numeros = {1, 5, 8, 3, 7}; // Array de n�meros
        int limite = 4; // Valor l�mite
        int contador = 0; // Contador de n�meros mayores

        for (int numero : numeros) {
            if (numero > limite) {
                contador++;
            }
        }

        System.out.println("Cantidad de n�meros mayores que " + limite + ": " + contador);
    }
}
