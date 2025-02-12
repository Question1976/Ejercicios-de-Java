package ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Ejercicio 4. Contar las vocales en una cadena y almacenarlas en un array.
		
        String texto = "Hola Mundo Java"; // Cadena de texto
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int[] contadorVocales = new int[vocales.length];

        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            for (int i = 0; i < vocales.length; i++) {
                if (c == vocales[i]) {
                    contadorVocales[i]++;
                }
            }
        }

        for (int i = 0; i < vocales.length; i++) {
            System.out.println("La vocal '" + vocales[i] + "' aparece " + contadorVocales[i] + " veces.");
        }
    }
}
