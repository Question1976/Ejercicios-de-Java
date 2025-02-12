package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Ejercicio 7 7. Calcular el promedio de los elementos de un array. 
		
        int[] numeros = {10, 20, 30, 40, 50}; // Array de números
        int suma = 0; // Suma de los elementos

        for (int numero : numeros) {
            suma += numero;
        }

        double promedio = (double) suma / numeros.length; // Calculamos el promedio
        System.out.println("El promedio de los números es: " + promedio);
    }
}
