package br.com.fiap.miniMercado;

import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double calcularTotal(Cliente cliente) {
		double totalCompra = 0;

		for (Produto produto : this.produtos) {
			totalCompra += produto.calcularPrecoFinal();
		}

		return cliente.aplicarDesconto(totalCompra);
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras [produtos=" + produtos + "]";
	}	

}
