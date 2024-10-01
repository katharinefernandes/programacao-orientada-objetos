package repositorio.biblioteca;

public class Teste {

	public static void main(String[] args) {

		RepositorioMemoria<Livro> repositorioLivro = new RepositorioMemoria<Livro>();
		RepositorioMemoria<Revista> repositorioRevista = new RepositorioMemoria<Revista>();
		RepositorioMemoria<Jornal> repositorioJornal = new RepositorioMemoria<Jornal>();

		Livro l1 = new Livro();
		l1.setId(1);
		l1.setTitulo("Livro 1");
		l1.setAutor("Autor 1");
		l1.setAnoPublicacao(2004);
		repositorioLivro.salvar(l1);

		Revista r1 = new Revista();
		r1.setId(1);
		r1.setTitulo("Resvista 1");
		r1.setEdicao(2);
		r1.setMesPublicacao("03");
		repositorioRevista.salvar(r1);

		Jornal j1 = new Jornal();
		j1.setId(1);
		j1.setTitulo("Jornal 1");
		j1.setDataPublicacao("02/09/2020");
		repositorioJornal.salvar(j1);

		System.out.println("------ LIVROS ------");
		for (Livro livro : repositorioLivro.listar()) {
			System.out.println(livro);
		}
		System.out.println("------ REVISTAS ------");
		for (Revista revista : repositorioRevista.listar()) {
			System.out.println(revista);
		}
		System.out.println("------ JORNAIS ------");
		for (Jornal jornal : repositorioJornal.listar()) {
			System.out.println(jornal);
		}
	}

}
