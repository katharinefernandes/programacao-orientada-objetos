package repositorio.salaoDeBeleza;

public class Tela {

	public static void main(String[] args) {

		CorteCabelo cc = new CorteCabelo();
		cc.setCodServico(1);
		cc.setNome("Corte de Cabelo");
		cc.setPreco(120);

		Manicure m = new Manicure();
		m.setCodServico(2);
		m.setNome("Manicure");
		m.setPreco(40);

		Pedicure p = new Pedicure();
		p.setCodServico(3);
		p.setNome("Pedicure");
		p.setPreco(35);

		RepositorioServico rep = new RepositorioServico();
		rep.adicionar(cc);
		rep.adicionar(m);
		rep.adicionar(p);

		System.out.println("--- LISTANDO TODOS OS SERVIÇOS --- ");
		for (Servico servico : rep.listarTodos()) {
			System.out.println(servico);
			System.out.println("");
		}

		System.out.println("--- LISTANDO POR PRECO > 50 ---");
		for (Servico servico : rep.filtrarPor(s -> s.getPreco() > 50)) {
			System.out.println(servico);
			System.out.println("");
		}

		System.out.println("--- LISTANDO POR PRECO > 20 E < 40 ---");
		for (Servico servico : rep.filtrarPor(s -> s.getPreco() > 20 && s.getPreco() < 40)) {
			System.out.println(servico);
			System.out.println("");
		}
		
		System.out.println("--- LISTANDO POR NOME QUE CONTÉM CORTE ---");
		for (Servico servico : rep.filtrarPor(s -> s.getNome().toLowerCase().contains("corte"))) {
			System.out.println(servico);
			System.out.println("");
			
		}

	}

}
