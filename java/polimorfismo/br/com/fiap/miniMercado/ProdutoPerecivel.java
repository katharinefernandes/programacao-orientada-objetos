package br.com.fiap.miniMercado;

public class ProdutoPerecivel extends Produto {

	private int diasParaVencimento;

	public int getDiasParaVencimento() {
		return diasParaVencimento;
	}

	public void setDiasParaVencimento(int diasParaVencimento) {
		this.diasParaVencimento = diasParaVencimento;
	}

	@Override
	public double calcularPrecoFinal() {
		double precoFinal = super.getPrecoBase();

		if (this.diasParaVencimento <= 3) {
			precoFinal = precoFinal * 0.9;
		}
		return precoFinal;
	}

	@Override
	public String toString() {
		return "ProdutoPerecivel [diasParaVencimento=" + diasParaVencimento + ", getNome()=" + getNome()
				+ ", getPrecoBase()=" + getPrecoBase() + "]";
	}

}
