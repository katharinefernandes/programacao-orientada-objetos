package br.com.fiap.conta;

public class ContaCorrente extends Conta {

	// Cartão de Crédito
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void saque(double valor) {
		double saldo = super.getSaldo();
		
		if(valor > (this.limite+saldo)) {
			System.out.println("Nao e possivel realizar o saque. Limite insuficiente!");
			return;
		}
		
		System.out.println("Saque realizado!");
		super.setSaldo(saldo- valor);
	}

}
