package generics;

public class Teste {

	public static void main(String[] args) {
		// Criar um objeto cliente e adicionar na lista
		RepositorioCliente repoCli = new RepositorioCliente();

		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Cliente 1");
		c1.setCpf("123.123.123-12");
		
		repoCli.salvar(c1);
		
		Cliente c2 = new Cliente();
		c2.setId(2);
		c2.setNome("Cliente 2");
		c2.setCpf("123.123.123-12");
		
		repoCli.salvar(c2);
		
		System.out.println(repoCli.buscar(1));
		System.out.println(repoCli.buscarTodos());
	}
	
}
