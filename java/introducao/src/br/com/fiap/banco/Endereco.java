package br.com.fiap.banco;

public class Endereco {

	private String codEndereco;
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;
	private String lobradouro;
	private String numero;
	private String complemento;

	public Endereco() {
	}

	public Endereco(String codEndereco, String cidade, String bairro, String estado, String cep, String lobradouro,
			String numero, String complemento) {
		super();
		this.codEndereco = codEndereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
		this.lobradouro = lobradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public String getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(String codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLobradouro() {
		return lobradouro;
	}

	public void setLobradouro(String lobradouro) {
		this.lobradouro = lobradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [codEndereco=" + codEndereco + ", cidade=" + cidade + ", bairro=" + bairro + ", estado="
				+ estado + ", cep=" + cep + ", lobradouro=" + lobradouro + ", numero=" + numero + ", complemento="
				+ complemento + "]";
	}

}
