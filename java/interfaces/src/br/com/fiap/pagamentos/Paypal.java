package br.com.fiap.pagamentos;

public class Paypal implements IPagamento {

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ " + valor + " Realizado pelo PayPal");

	}

	@Override
	public String obterTipoPagamento() {
		return "Pay pal";
	}

}
