package br.com.fiap.cafeteria;

import br.com.fiap.cafeteria.enums.TamanhoBebidaEnum;

public abstract class Bebida {

	protected String nome;
	protected double precoBase;
	protected TamanhoBebidaEnum tamanho;

	public Bebida() {
	}

	public Bebida(String nome, double precoBase, TamanhoBebidaEnum tamanho) {
		super();
		this.nome = nome;
		this.precoBase = precoBase;
		this.tamanho = tamanho;
	}

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

	public TamanhoBebidaEnum getTamanho() {
		return tamanho;
	}

	public void setTamanho(TamanhoBebidaEnum tamanho) {
		this.tamanho = tamanho;
	}

	public abstract double calcularPreco();

}
