package modelo;

public class Vehiculo {

    private String modelo;
    private String marca;
    private String tipo;
    private int anio;
    private int vecesReservado;

    // Constructor
    public Vehiculo(String modelo, String marca, String tipo, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.anio = anio;
        this.vecesReservado = 0;  // Inicialmente, el vehículo no ha sido reservado
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVecesReservado() {
        return vecesReservado;
    }

    public void incrementarVecesReservado() {
        this.vecesReservado++;  // Incrementa el contador de veces que el vehículo ha sido reservado
    }

    @Override
    public String toString() {
        return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", tipo=" + tipo + ", anio=" + anio + ", vecesReservado=" + vecesReservado + "]";
    }
}
