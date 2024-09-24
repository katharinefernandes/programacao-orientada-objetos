package br.com.fiap.pagamentos;

public class Pedido {

	public void processarPagamento(IPagamento formaPagamento, double valor) {
		formaPagamento.realizarPagamento(valor);
		System.out.println("Processando pagamento com " + formaPagamento.obterTipoPagamento());
	}

}
