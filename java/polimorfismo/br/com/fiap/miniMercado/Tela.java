package br.com.fiap.miniMercado;

import java.util.ArrayList;
import java.util.List;

public class Tela {

	public static void main(String[] args) {

		List<Produto> listaProduto = new ArrayList<Produto>();
		double valorCompra = 0;

		ProdutoPerecivel prodPerecivel = new ProdutoPerecivel();
		prodPerecivel.setNome("Produto Perecivel");
		prodPerecivel.setDiasParaVencimento(4);
		prodPerecivel.setPrecoBase(100);
		listaProduto.add(prodPerecivel);

		ProdutoNaoPerecivel prodNaoPerecivel = new ProdutoNaoPerecivel();
		prodNaoPerecivel.setNome("Produto Não Perecível");
		prodNaoPerecivel.setCaregoria("Salgadinho");
		prodNaoPerecivel.setPrecoBase(22);
		listaProduto.add(prodNaoPerecivel);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.setProdutos(listaProduto);

		System.out.println("------ CARRINHO ------");
		System.out.println(carrinho + "\n");

		Cliente cli1 = new Cliente();
		cli1.setNome("Cliente 1");
		cli1.setClienteFidelidade(true);
		valorCompra = cli1.aplicarDesconto(carrinho.calcularTotal(cli1));
		System.out.println(cli1);
		System.out.println("Valor Compra: " + valorCompra);
		System.out.println("");

		Cliente cli2 = new Cliente();
		cli2.setNome("Cliente 2");
		cli2.setClienteFidelidade(false);
		valorCompra = cli2.aplicarDesconto(carrinho.calcularTotal(cli2));
		System.out.println(cli2);
		System.out.println("Valor Compra: " + valorCompra);

	}

}
