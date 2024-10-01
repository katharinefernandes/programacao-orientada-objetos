package repositorio.biblioteca;

public class Jornal {

	private int id;
	private String titulo;
	private String dataPublicacao;

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

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	@Override
	public String toString() {
		return "Jornal [id=" + id + ", titulo=" + titulo + ", dataPublicacao=" + dataPublicacao + "]";
	}

}
