package br.com.fiap.pagamentos;

public class CartaoCredito implements IPagamento {

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ " + valor + " Realizado com cartao de credito");
	}

	@Override
	public String obterTipoPagamento() {
		return "Cartao de credito";
	}

}
