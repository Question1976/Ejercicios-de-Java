package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

	public static void main(String[] args) {
		
		// ===============
		// === Streams ===
		// ===============
		
		List<String> colores = new ArrayList<>();
		colores.add("verde");
		colores.add("azul");
		colores.add("blanco");
		colores.add("celeste");
		
		Stream<String> coloresStream = colores.stream();
		colores.stream().forEach( color -> System.out.println("color = " + color));
		

		// =======================
		// === Streams | map() ===		
		// =======================
		coloresStream
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
	}

}
