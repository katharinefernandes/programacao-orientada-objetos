package br.com.fiap.banco;

public class Agencia {

	private String numAgencia;
	private String nomeAgencia;
	private Endereco endereco;

	public Agencia() {

	}

	public Agencia(String numAgencia, String nomeAgencia, Endereco endereco) {
		super();
		this.numAgencia = numAgencia;
		this.nomeAgencia = nomeAgencia;
		this.endereco = endereco;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agencia [numAgencia=" + numAgencia + ", nomeAgencia=" + nomeAgencia + "]";
	}

}
