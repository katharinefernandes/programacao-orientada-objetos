package repositorio.biblioteca;

public class Livro {

	private int id;
	private String titulo;
	private String autor;
	private int anoPublicacao;

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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao
				+ "]";
	}

}
