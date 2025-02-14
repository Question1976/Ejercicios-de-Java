package presentacion;

import java.util.Scanner;

import logica.Restaurante;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Crear un restaurante con 5 mesas,
		// cada una con capacidad para 10 pedidos.
		Restaurante restaurante = new Restaurante(5, 10);

		// Bucle principal del men�.
		while (true) {
			System.out.println("\nBienvenido al sistema del restaurante.");
			System.out.println("1. Agregar un pedido a una mesa");
			System.out.println("2. Mostrar los pedidos de una mesa");
			System.out.println("3. Calcular la cuenta total de una mesa");
			System.out.println("4. Salir");
			System.out.print("Elige una opci�n: ");
			int opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar buffer

			switch (opcion) {
			case 1: // Agregar un pedido
				System.out.print("Introduce el n�mero de la mesa: ");
				int numeroMesa = scanner.nextInt();
				scanner.nextLine(); // Limpiar buffer

				System.out.print("Introduce el nombre del pedido: ");
				String pedido = scanner.nextLine();

				System.out.print("Introduce el precio del pedido: ");
				double precio = scanner.nextDouble();

				restaurante.agregarPedidoAMesa(numeroMesa, pedido, precio);
				System.out.println("Pedido agregado con �xito.");
				break;

			case 2: // Mostrar pedidos
				System.out.print("Introduce el n�mero de la mesa: ");
				numeroMesa = scanner.nextInt();

				restaurante.mostrarPedidosDeMesa(numeroMesa);
				break;

			case 3: // Calcular cuenta
				System.out.print("Introduce el n�mero de la mesa: ");
				numeroMesa = scanner.nextInt();

				restaurante.calcularCuentaDeMesa(numeroMesa);
				break;

			case 4: // Salir
				System.out.println("Gracias por usar el sistema del restaurante. �Hasta pronto!");
				scanner.close();
				return;

			default:
				System.out.println("Opci�n no v�lida. Intenta nuevamente.");
				break;
			}
		}
	}

}
