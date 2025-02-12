package modelo;

public class Empleado {

	private String nombre;
	private String telefono;
	private String puesto;
	private double salario;
	
	public Empleado(String nombre, String telefono, String puesto, double salario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.puesto = puesto;
        this.salario = salario;
    }
	
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', telefono='" + telefono + "', puesto='" + puesto + "', salario=" + salario + '}';
    }

}
