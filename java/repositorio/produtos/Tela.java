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

		Livro livro1 = new Livro();
		livro1.setNome("Dom Casmurro");
		livro1.setPreco(29.90);
		rep.adicionar(livro1);

		Livro livro2 = new Livro();
		livro2.setNome("O Guarani");
		livro2.setPreco(34.90);
		rep.adicionar(livro2);

		Livro livro3 = new Livro();
		livro3.setNome("Memorias Postumas de Bras Cubas");
		livro3.setPreco(25.00);
		rep.adicionar(livro3);

		Livro livro4 = new Livro();
		livro4.setNome("A Moreninha");
		livro4.setPreco(27.50);
		rep.adicionar(livro4);

		Livro livro5 = new Livro();
		livro5.setNome("O Primo Basílio");
		livro5.setPreco(30.00);
		rep.adicionar(livro5);

		Livro livro6 = new Livro();
		livro6.setNome("Iracema");
		livro6.setPreco(22.50);
		rep.adicionar(livro6);

		Livro livro7 = new Livro();
		livro7.setNome("Senhora");
		livro7.setPreco(28.00);
		rep.adicionar(livro7);

		Livro livro8 = new Livro();
		livro8.setNome("A Escrava Isaura");
		livro8.setPreco(31.90);
		rep.adicionar(livro8);

		Livro livro9 = new Livro();
		livro9.setNome("Capitaes da Areia");
		livro9.setPreco(33.50);
		rep.adicionar(livro9);

		Livro livro10 = new Livro();
		livro10.setNome("Os Sertoes");
		livro10.setPreco(39.90);
		rep.adicionar(livro10);

		Livro livro11 = new Livro();
		livro11.setNome("O Alquimista");
		livro11.setPreco(25.90);
		rep.adicionar(livro11);

		Livro livro12 = new Livro();
		livro12.setNome("1984");
		livro12.setPreco(35.00);
		rep.adicionar(livro12);

		Livro livro13 = new Livro();
		livro13.setNome("A Revolucao dos Bichos");
		livro13.setPreco(24.90);
		rep.adicionar(livro13);

		Livro livro14 = new Livro();
		livro14.setNome("Brave New World");
		livro14.setPreco(36.50);
		rep.adicionar(livro14);

		Livro livro15 = new Livro();
		livro15.setNome("O Pequeno Principe");
		livro15.setPreco(19.90);
		rep.adicionar(livro15);

		Livro livro16 = new Livro();
		livro16.setNome("O Hobbit");
		livro16.setPreco(45.00);
		rep.adicionar(livro16);

		Livro livro17 = new Livro();
		livro17.setNome("Cem Anos de Solidao");
		livro17.setPreco(50.00);
		rep.adicionar(livro17);

		Livro livro18 = new Livro();
		livro18.setNome("Dom Quixote");
		livro18.setPreco(40.00);
		rep.adicionar(livro18);

		Livro livro19 = new Livro();
		livro19.setNome("A Divina Comedia");
		livro19.setPreco(55.00);
		rep.adicionar(livro19);

		Livro livro20 = new Livro();
		livro20.setNome("O Morro dos Ventos Uivantes");
		livro20.setPreco(42.00);
		rep.adicionar(livro20);

		// EXERCÍCIO - 01
		System.out.println("\nUsando filtro...");
		for (Produto p : rep.filtroPor(preco -> preco.getPreco() > 20)) {
			System.out.println(p);
		}

		// EXERCÍCIO - 02
		System.out.println("\nLista livro - Comecam com a letra O");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().startsWith("O"))) {
			System.out.println(p);
		}

		// EXERCÍCIO - 03
		System.out.println("\nLista Livro - Contem a palavra coracao");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().toLowerCase().contains("coracao"))) {
			System.out.println(p);

		}

		// EXERCÍCIO - 04
		System.out.println("\nLista Livros - Maior que R$ 40,00...");
		for (Produto p : rep.filtroPor(preco -> preco.getPreco() > 40)) {
			System.out.println(p);
		}

		// EXERCÍCIO - 05
		System.out.println("\nLista Livros - 20 Caracteres no Nome...");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().length() == 20)) {
			System.out.println(p);
		}

		// EXERCÍCIO - 06
		System.out.println("\nLista Livros - Termina com a letra a...");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().endsWith("a"))) {
			System.out.println(p);
		}

		// EXERCÍCIO - 07
		System.out.println("\nLista Livros - Termina com a letra e...");
		for (Produto p : rep.filtroPor(nome -> nome.getNome().toLowerCase().contains("e"))) {
			System.out.println(p);
		}

		// EXERCÍCIO - 08
		System.out.println("\nLista Livros - Com o preco entre R$30.00 e R$50.00...");
		for (Produto p : rep.filtroPor(preco -> preco.getPreco() >= 30 && preco.getPreco() <= 50)) {
			System.out.println(p);
		}

		// EXERCÍCIO - 09
		System.out.println("\nLista Livros - Maior que R$ 40,00...");
		for (Produto p : rep.filtroPor(preco -> preco.getPreco() >= 30 && preco.getPreco() <= 50)) {
			System.out.println(p);
		}

	}

}
