package br.com.fiap.pagamentos;

public class TransferenciaBancaria implements IPagamento {

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ " + valor + " Realizado com transferencia bancaria");
	}

	@Override
	public String obterTipoPagamento() {
		return "Transferencia Bancaria";
	}

}
