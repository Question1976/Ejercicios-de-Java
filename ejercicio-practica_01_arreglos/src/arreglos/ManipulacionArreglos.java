package arreglos;

public class ManipulacionArreglos {

	public static void main(String[] args) {
		
		// ===============================
		// === DECLARACI�N DE ARREGLOS ===
		// ===============================
		int arregloNumeros [] = {2, 4, 6, 8, 10, 12, 14};

		// Acceder a los valores del arreglo
		// mediante sus �ndices.
		System.out.println("Posici�n 0 => " + arregloNumeros[0]);	// 2
		System.out.println("Posici�n 4 => " + arregloNumeros[4]); 	// 10
		
		// .length | Obtener el largo/cantidad de valores del arreglo. 
		System.out.println("Largo del arreglo => " + arregloNumeros.length);	// 7
		
		// .length - 1 | Obtener la �ltima posici�n del arreglo.
		System.out.println("�ltima posici�n del arreglo => " + arregloNumeros[arregloNumeros.length - 1]); // 14
		
		
		// ============================
		// === RECORRIENDO ARREGLOS ===
		// ============================
		for (int i = 0; i < arregloNumeros.length; i++) {
			System.out.println("Posici�n => " + i + " | Valor => " + arregloNumeros[i]);
		}
		
		for (int valor : arregloNumeros) {
			System.out.println("Valor => " + valor);
		}
	}

}
