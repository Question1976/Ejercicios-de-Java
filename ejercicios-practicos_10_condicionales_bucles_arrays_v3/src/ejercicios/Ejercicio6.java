package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Ejercicio 6. Intercambiar el valor m�ximo y m�nimo en un array.
		
        int[] numeros = {4, 7, 2, 9, 1}; // Array de n�meros
        int maxIndice = 0, minIndice = 0; // �ndices del m�ximo y m�nimo

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[maxIndice]) {
                maxIndice = i;
            }
            if (numeros[i] < numeros[minIndice]) {
                minIndice = i;
            }
        }

        // Intercambiamos los valores
        int temporal = numeros[maxIndice];
        numeros[maxIndice] = numeros[minIndice];
        numeros[minIndice] = temporal;

        System.out.print("Array despu�s del intercambio: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
