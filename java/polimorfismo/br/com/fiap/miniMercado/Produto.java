package br.com.fiap.miniMercado;

public class Produto {

	private String nome;
	private double precoBase;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	
	public double calcularPrecoFinal() {
		return this.precoBase;
	}
	
	

}
