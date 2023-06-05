package prjtTeste;

public class Calculadora1 {
	
	double numero1;
	double numero2;
	double resultado;	
	
	public void somar() {
		resultado = numero1 + numero2;
	}
	public double dividir() {
		resultado = numero1 / numero2; 
		return resultado;
	}
	public void subtrair(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		resultado = numero1 - numero2;
	}
	public double multiplicar(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		resultado = numero1 * numero2;
		return resultado;
		
	
		
	}
		
	
	
}


