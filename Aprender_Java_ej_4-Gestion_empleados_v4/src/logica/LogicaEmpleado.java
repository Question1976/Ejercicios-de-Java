package logica;

import modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(i); // Elimina el empleado si coincide el nombre
                return true; // Retorna true si se eliminó
            }
        }
        return false; // Retorna false si no se encontró el empleado
    }
	
	public double calcularMediaSalarios() {
        if (empleados.isEmpty()) return 0;

        double suma = 0;
        for (Empleado empleado : empleados) {
            suma += empleado.getSalario(); // Suma los salarios de los empleados
        }
        return suma / empleados.size(); // Calcula la media dividiendo entre el tamaño de la lista
    }
	
	public Empleado obtenerEmpleadoMayorSalario() {
        if (empleados.isEmpty()) return null;

        Empleado mayor = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() > mayor.getSalario()) {
                mayor = empleado; // Actualiza al empleado con el mayor salario
            }
        }
        return mayor;
    }
	
	public Empleado obtenerEmpleadoMenorSalario() {
        if (empleados.isEmpty()) return null;

        Empleado menor = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() < menor.getSalario()) {
                menor = empleado; // Actualiza al empleado con el menor salario
            }
        }
        return menor;
    }
	
	public Empleado obtenerEmpleadoMasExperiencia() {
        if (empleados.isEmpty()) return null;

        Empleado masExperiencia = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getAniosExperiencia() > masExperiencia.getAniosExperiencia()) {
                masExperiencia = empleado; // Actualiza al empleado con más experiencia
            }
        }
        return masExperiencia;
    }
	
	public List<Empleado> filtrarPorRangoSalario(double minimo, double maximo) {
        List<Empleado> filtrados = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() >= minimo && empleado.getSalario() <= maximo) {
                filtrados.add(empleado); // Agrega empleados dentro del rango al resultado
            }
        }
        return filtrados;
    }
	
	public void ordenarPorNombre() {
        for (int i = 0; i < empleados.size() - 1; i++) {
            for (int j = i + 1; j < empleados.size(); j++) {
                if (empleados.get(i).getNombre().compareToIgnoreCase(empleados.get(j).getNombre()) > 0) {
                    // Intercambia los empleados si están desordenados
                    Empleado temp = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, temp);
                }
            }
        }
    }
	
	public void ordenarPorSalario() {
        for (int i = 0; i < empleados.size() - 1; i++) {
            for (int j = i + 1; j < empleados.size(); j++) {
                if (empleados.get(i).getSalario() > empleados.get(j).getSalario()) {
                    // Intercambia los empleados si están desordenados
                    Empleado temp = empleados.get(i);
                    empleados.set(i, empleados.get(j));
                    empleados.set(j, temp);
                }
            }
        }
    }
	
}
