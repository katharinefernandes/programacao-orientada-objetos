package repositorio.produtos;

public class Tela {

	public static void main(String[] args) {

		Livro l1 = new Livro();
		l1.setNome("Harry Potter");
		l1.setPreco(39.99);

		RepositorioProduto rep = new RepositorioProduto();
		rep.adicionar(l1);

		Livro l2 = new Livro();
		l2.setNome("Pequeno Principe");
		l2.setPreco(19.99);

		rep.adicionar(l2);

		// Lista produtos incluídos
		for (Produto p : rep.listarTodos()) {
			System.out.println(p);
		}

		// Excluí livro Harry Potter
//		rep.remover(l1);
//		rep.remover(l2);
//		System.out.println("Listar novamente...");
//		for (Produto p : rep.listarTodos()) {
//			System.out.println(p);
//		}
//		
		System.out.println("Usando filtro...");
		for (Produto p : rep.filtroPor(preco -> preco.getPreco() > 20)) {
			System.out.println(p);
		}

//		Listar os produtos com nome igual a Pequeno Principe
		System.out.println("Lista livro - Pequeno Principe");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().equalsIgnoreCase("Pequeno Principe"))) {
			System.out.println(p);
		}

	}

}
