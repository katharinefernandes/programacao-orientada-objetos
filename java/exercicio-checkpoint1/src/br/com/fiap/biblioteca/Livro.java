package br.com.fiap.biblioteca;

public class Livro {

	private String id;
	private String titulo;
	private String autor;
	private boolean disponivel;

	public Livro() {

	}

	public Livro(String id, String titulo, String autor, boolean disponivel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void emprestar() {
		
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", disponivel=" + disponivel + "]";
	}

}
