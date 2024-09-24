package br.com.fiap.pagamentos;

public class Teste {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		IPagamento credito = new CartaoCredito();
		IPagamento paypal = new Paypal();
		IPagamento transferencia = new TransferenciaBancaria();

		pedido.processarPagamento(credito, 100);
		pedido.processarPagamento(paypal, 200);
		pedido.processarPagamento(transferencia, 300);

	}

}
