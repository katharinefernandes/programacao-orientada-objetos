package br.com.fiap.cafeteria.enums;

public enum TipoLeiteEnum {

	INTEGRAL("I", "Integral"), DESNATADO("D", "Desnatado"), VEGETAL("V", "Vegetal"), SEM_LEITE("S", "Sem Leite");

	private String valor;
	private String descricao;

	TipoLeiteEnum(String valor, String descricao) {
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
