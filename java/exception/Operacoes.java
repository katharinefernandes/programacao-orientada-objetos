package br.com.fiap.exception;

public class Operacoes {

	public double somar(double a, double b) {
		return a + b;
	}

	public double dividir(int a, int b) throws MinhaException {
		double r = 0;
		try {
			r = a / b;
			return r;
		} catch(Exception ex) {
			throw new MinhaException("Valor invalido para divisao");
		}
	}

}
