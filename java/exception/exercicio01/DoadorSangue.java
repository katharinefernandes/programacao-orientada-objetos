package br.com.fiap.exception.exercicio01;

public class DoadorSangue {

	private String nome;
	private Integer idade;
	private Double peso;

	public DoadorSangue() {
		super();
	}

	public DoadorSangue(String nome, Integer idade, Double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public void validaDoacao() throws MinhaException {
		if (this.idade <= 16 || this.idade >= 69 || this.peso <= 50) {
			throw new MinhaException("A pessoa não possui a idade e peso o suficiente para ser doador!");
		}
	}

	public void validaNome() throws MinhaException {
		if (this.nome == null) {
			throw new MinhaException("O nome precisa ser prenchido!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "DoadorSangue [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}

	
}
