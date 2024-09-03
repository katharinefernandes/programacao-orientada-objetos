package br.com.fiap.miniMercado;

public class Cliente {

	private String nome;
	private boolean clienteFidelidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isClienteFidelidade() {
		return clienteFidelidade;
	}

	public void setClienteFidelidade(boolean clienteFidelidade) {
		this.clienteFidelidade = clienteFidelidade;
	}

	public double aplicarDesconto(double valorTotal) {
		if (this.clienteFidelidade) {
			return valorTotal * 0.95;
		}
		return valorTotal;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", clienteFidelidade=" + clienteFidelidade + "]";
	}

}
