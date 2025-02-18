package br.com.fiap.exception;

public class Teste {
	public static void main(String[] args) {

		Operacoes op = new Operacoes();
		double divisao = 0;
		try {
			divisao = op.dividir(15, 0);
		} catch (MinhaException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(divisao);

	}
}
