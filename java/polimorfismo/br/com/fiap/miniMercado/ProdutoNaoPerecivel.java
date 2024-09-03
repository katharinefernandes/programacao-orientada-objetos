package br.com.fiap.miniMercado;

public class ProdutoNaoPerecivel extends Produto {

	private String caregoria;

	public String getCaregoria() {
		return caregoria;
	}

	public void setCaregoria(String caregoria) {
		this.caregoria = caregoria;
	}

	@Override
	public String toString() {
		return "ProdutoNaoPerecivel [caregoria=" + caregoria + ", getNome()=" + getNome() + ", getPrecoBase()="
				+ getPrecoBase() + ", calcularPrecoFinal()=" + calcularPrecoFinal() + "]";
	}



}
