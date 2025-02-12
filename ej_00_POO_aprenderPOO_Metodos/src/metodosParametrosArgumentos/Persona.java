package metodosParametrosArgumentos;

public class Persona {

	public void comprobarSiesMayorDeEdad(int edad, String nombre, float altura) {
		if (edad >= 18) {
			System.out.println("El ciudadano " + nombre + " es mayor de edad, y mide " + altura);
		} else {
			System.out.println("El ciudadano " + nombre + " no es mayor de edad");
		}
	}
}
