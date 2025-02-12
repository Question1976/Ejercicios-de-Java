package metodosRetorno;

public class Numeros {

	public int calcularMayorNumero(int primerValor, int segundValor, int tercerValor) {
		int mayor;
		if (primerValor > segundValor && primerValor > tercerValor) {
			mayor = primerValor;
		} else if (segundValor > tercerValor && segundValor > primerValor) {
			mayor = segundValor;
		} else {
			mayor = tercerValor;
		}
		return mayor;			
	}
	
	public int calcularMenorNumero(int primerValor, int segundValor, int tercerValor) {
		int menor;
		if (primerValor < segundValor && primerValor < tercerValor) {
			menor = primerValor;
		} else if (segundValor < tercerValor && segundValor < primerValor) {
			menor = segundValor;
		} else {
			menor = tercerValor;
		}
		return menor;
	}
}
