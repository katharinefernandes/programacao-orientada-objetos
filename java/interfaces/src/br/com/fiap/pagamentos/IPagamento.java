package br.com.fiap.pagamentos;

public interface IPagamento {
	
	void realizarPagamento(double valor);

	String obterTipoPagamento();

}
