package br.com.fiap.cafeteria.enums;

public enum SaborChaEnum {

	CAMOMILA("C", "Camomila"), HORTELA("H", "Hortelã"), CHA_PRETO("P", "Chá Preto"), CHA_VERDE("V", "Chá Verde");

	private String valor;
	private String descricao;

	SaborChaEnum(String valor, String descricao) {
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
