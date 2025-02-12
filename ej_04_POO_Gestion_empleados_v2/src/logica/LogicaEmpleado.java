package logica;

import modelo.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LogicaEmpleado {

	private List<Empleado> empleados;
	
	public LogicaEmpleado() {
        this.empleados = new ArrayList<>();
    }
	
	public void registrarEmpleado(String nombre, String telefono, String puesto, double salario) {
        empleados.add(new Empleado(nombre, telefono, puesto, salario));
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
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
