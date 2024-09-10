package br.com.fiap.cafeteria.enums;

public enum TamanhoBebidaEnum {
	
	PEQUENO("P", "Pequeno"), MEDIO("M", "Medio"), GRANDE("G", "Grande");
	
	private String valor;
	private String descricao;
	
	
	TamanhoBebidaEnum(String valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
