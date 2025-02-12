package modelo;

public class Estudiante {

	private String nombre; // Nombre del estudiante
	private int edad; // Edad del estudiante
	private double[] notas; // Calificaciones del estudiante

	// Constructor para inicializar el estudiante
	// con nombre, edad y sus calificaciones.
	public Estudiante(String nombre, int edad, double[] notas) {
		this.nombre = nombre;
		this.edad = edad;
		this.notas = notas;
	}

	// Métodos getter y setter.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	// Método para calcular el promedio de las calificaciones.
	public double calcularPromedio() {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}
		return suma / notas.length;
	}

	// Método para mostrar la información del estudiante.
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.print("Notas: ");
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println("\nPromedio: " + calcularPromedio());
	}

}
