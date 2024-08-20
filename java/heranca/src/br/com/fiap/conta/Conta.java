package br.com.fiap.conta;

// classe que não gera objeto (não pode ser instanciada)
// só pode ser herdada
// criada pelas mais especificas 
// para casos que a classe é muito genérica
public abstract class Conta {

	private String numAgencia;
	private String numConta;
	private double saldo;
	private Cliente cliente;

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double consultaSaldo() {
		return this.saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean fazTransferencia(Conta c, double valor) {
		if (this == c) {
			System.out.println("A conta destino não pode ser igual a conta origem");
			return false;
		} else if (this.saldo < valor) {
			System.out.println("O valor solicitado é maior que o saldo");
			return false;
		} else {

			this.saldo -= valor;
			c.deposito(valor);
			return true;
		}
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	// Métodos abstratos - Obriga a classe que herda a implementar os métodos
	// disponibilizados, e cada uma delas implemanta (ter lógica) da forma que acha necessário
	// Só podem existir em classes abstratas
	// A lógica do método fica especificamente nas demais classes que o herdam
	
	// Apenas transforma em abstrato se há necessidade de implementação diferente em outras classes, ou seja, polimorfismo 
	// Acões diferentes em classes diferentes
	public abstract void saque(double valor);

}
