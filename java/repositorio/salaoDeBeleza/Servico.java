package repositorio.salaoDeBeleza;

public class Servico {

	private int codServico;
	private String nome;
	private double preco;

	public int getCodServico() {
		return codServico;
	}

	public void setCodServico(int codServico) {
		this.codServico = codServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Servico [codServico=" + codServico + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
