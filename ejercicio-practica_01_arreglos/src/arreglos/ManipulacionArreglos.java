package arreglos;

public class ManipulacionArreglos {

	public static void main(String[] args) {
		
		// ===============================
		// === DECLARACIÓN DE ARREGLOS ===
		// ===============================
		int arregloNumeros [] = {2, 4, 6, 8, 10, 12, 14};

		// Acceder a los valores del arreglo
		// mediante sus índices.
		System.out.println("Posición 0 => " + arregloNumeros[0]);	// 2
		System.out.println("Posición 4 => " + arregloNumeros[4]); 	// 10
		
		// .length | Obtener el largo/cantidad de valores del arreglo. 
		System.out.println("Largo del arreglo => " + arregloNumeros.length);	// 7
		
		// .length - 1 | Obtener la última posición del arreglo.
		System.out.println("Última posición del arreglo => " + arregloNumeros[arregloNumeros.length - 1]); // 14
		
		
		// ============================
		// === RECORRIENDO ARREGLOS ===
		// ============================
		for (int i = 0; i < arregloNumeros.length; i++) {
			System.out.println("Posición => " + i + " | Valor => " + arregloNumeros[i]);
		}
		
		for (int valor : arregloNumeros) {
			System.out.println("Valor => " + valor);
		}
	}

}
