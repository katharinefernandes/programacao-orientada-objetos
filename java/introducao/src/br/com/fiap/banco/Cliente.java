package br.com.fiap.banco;

public class Cliente {

	private Long idCliente;
	private String nomeCliente;
	private String sexo;
	private Long idade;
	private String cpf;
	private Endereco endereco;

	public Cliente(Long idCliente, String nomeCliente, String sexo, Long idade, String cpf, Endereco endereco) {
		// atributos da classe mãe (por padrão recebe o Object)
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.sexo = sexo;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Cliente() {

	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", sexo=" + sexo + ", idade="
				+ idade + ", cpf=" + cpf + "]";
	}

}
