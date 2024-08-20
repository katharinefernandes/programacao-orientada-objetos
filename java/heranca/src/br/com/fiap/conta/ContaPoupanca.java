package br.com.fiap.conta;

// herança - Conta
// acesso aos atributos da classe base - Conta
public class ContaPoupanca extends Conta {

	// mudar para BigDecimal
	private double rendimento;

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public void calculaRendimento() {
		double saldo = super.getSaldo();
		this.deposito(saldo * rendimento);
	}

	@Override
	public void saque(double valor) {
		double saldo = super.getSaldo();

		if (valor > saldo) {
			System.out.println("Nao e possivel realizar o saque. Saldo insuficiente!");
			return;
		}

		System.out.println("Saque realizado!");
		super.setSaldo(saldo - valor);
	}

}
