package logica;

import modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

public class LogicaEmpleado {

	private List<Empleado> empleados;
	
	public LogicaEmpleado() {
        this.empleados = new ArrayList<>();
    }
	
	public void registrarEmpleado(String nombre, String puesto, double salario) {
        empleados.add(new Empleado(nombre, puesto, salario));
    }
	
	public Empleado buscarEmpleado(String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
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
	
}
