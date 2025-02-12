package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		// Ejercicio 9. Determinar si un array es un subconjunto de otro.
		
        int[] conjunto = {1, 2, 3, 4, 5};
        int[] subconjunto = {2, 4, 5};
        boolean esSubconjunto = true;

        for (int num : subconjunto) {
            boolean encontrado = false;
            for (int elem : conjunto) {
                if (num == elem) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                esSubconjunto = false;
                break;
            }
        }

        if (esSubconjunto) {
            System.out.println("El segundo array es un subconjunto del primero.");
        } else {
            System.out.println("El segundo array no es un subconjunto.");
        }
    }
}
