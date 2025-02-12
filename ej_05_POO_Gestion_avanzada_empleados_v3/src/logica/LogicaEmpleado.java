package logica;

import modelo.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class LogicaEmpleado {

	private List<Empleado> empleados;
	
	public LogicaEmpleado() {
        this.empleados = new ArrayList<>();
    }
	
	public void registrarEmpleado(String nombre, String telefono, String puesto, double salario, int aniosExperiencia) {
        empleados.add(new Empleado(nombre, telefono, puesto, salario, aniosExperiencia));
    }
	
	public Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }
	
	public Empleado buscarEmpleadoPorTelefono(String telefono) {
        for (Empleado empleado : empleados) {
            if (empleado.getTelefono().equals(telefono)) {
                return empleado;
            }
        }
        return null;
    }
	
	public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
	
	public boolean eliminarEmpleadoPorNombre(String nombre) {
        return empleados.removeIf(empleado -> empleado.getNombre().equalsIgnoreCase(nombre));
    }
	
	public double calcularMediaSalarios() {
        if (empleados.isEmpty()) return 0;
        double suma = 0;
        for (Empleado empleado : empleados) {
            suma += empleado.getSalario();
        }
        return suma / empleados.size();
    }
	
	 public Empleado obtenerEmpleadoMayorSalario() {
	        return empleados.stream()
	                .max(Comparator.comparingDouble(Empleado::getSalario))
	                .orElse(null);
    }
	 
	 public Empleado obtenerEmpleadoMenorSalario() {
	        return empleados.stream()
	                .min(Comparator.comparingDouble(Empleado::getSalario))
	                .orElse(null);
	 }
	 
	 public void ordenarPorNombre() {
	        empleados.sort(Comparator.comparing(Empleado::getNombre));
    }
	 
	 public void ordenarPorSalario() {
	        empleados.sort(Comparator.comparingDouble(Empleado::getSalario));
    }
	
}
