package logica;

import modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class LogicaEstudiante {

	private List<Estudiante> estudiantes;
	
	public LogicaEstudiante() {
        this.estudiantes = new ArrayList<>();
    }
	
	public void registrarEstudiante(String nombre, int edad, double calificacion) {
        estudiantes.add(new Estudiante(nombre, edad, calificacion));
    }
	
	public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        return null;
    }
	
	public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
}
