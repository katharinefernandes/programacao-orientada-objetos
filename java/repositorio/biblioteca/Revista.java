package repositorio.biblioteca;

public class Revista {

	private int id;
	private String titulo;
	private int edicao;
	private String mesPublicacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getMesPublicacao() {
		return mesPublicacao;
	}

	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

	@Override
	public String toString() {
		return "Revista [id=" + id + ", titulo=" + titulo + ", edicao=" + edicao + ", mesPublicacao=" + mesPublicacao
				+ "]";
	}

}
