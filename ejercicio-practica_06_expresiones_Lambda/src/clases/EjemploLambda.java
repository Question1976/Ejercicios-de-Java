package clases;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EjemploLambda {

	public static void main(String[] args) {
		
		// ==========================================
		// === Expresiones Lambda - tipo Consumer ===
		// ==========================================
		Consumer<String> consumer = (mensaje) -> System.out.println("Mensaje = " + mensaje);		
		consumer.accept("Hola mundo desde programación funcional");
		
		BiConsumer<String, String> consumer2 = (nombre, apellido) -> {
			System.out.println("Hola " + nombre + " " + apellido);
		};		
		consumer2.accept("Salvador", "Belloso");
		
		
		// =========================================================
		// === Expresiones Lambda - tipo Operador doble colon :: ===
		// =========================================================
		
		// Consumer<String> consumer3 = (mensaje) -> System.out.println("Mensaje = " + mensaje);
		Consumer<String> consumer3 = System.out::println;
		
		
		// ==========================================
		// === Expresiones Lambda - tipo Supplier ===
		// ==========================================
		Supplier<String> provider = () -> {
			return "Bienvenido al curso de Java";
		};
		
		System.out.println("provider.get() = " + provider.get());
		
		
		// ==========================================
		// === Expresiones Lambda - tipo Function ===
		// ==========================================
		Function<String, String> fun = (input) -> "Bienvenido " + input;
		String result = fun.apply("Salvador");
		System.out.println("result = " + result);
		
		BiFunction<String, String, String> bifun = (x, y) -> "Bienvenido " + x + " " + y;
		String nombreCompleto = bifun.apply("Salvador", "Belloso");
		System.out.println("nombreCompleto = " + nombreCompleto);
		
		
		// ===========================================
		// === Expresiones Lambda - tipo Predicate ===
		// ===========================================
		Predicate<Integer> predicate = numero -> numero < 20;
		boolean test = predicate.test(10);
		System.out.println("test = " + test);	// true
		
		// BiPredicate<String, String> bipredicate = (nom1, nom2) -> nom1.equals(nom2);
		BiPredicate<String, String> bipredicate = String::equals;
		System.out.println("bipredicate = " + bipredicate.test("Salvador", "Salvador"));	// true
		
		
		
		
	}

}
