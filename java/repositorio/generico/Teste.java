package br.com.fiap.repositorio;

public class Teste {
	public static void main(String[] args) {
		
		RepositorioMemoria<Produto> repositorioProduto = new RepositorioMemoria<Produto>();
		RepositorioMemoria<Cliente> repositorioCliente = new RepositorioMemoria<Cliente>();
 		
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Celular");
		p1.setPreco(9999.10);
		repositorioProduto.salvar(p1);
		
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Relogio");
		p2.setPreco(100.00);
		repositorioProduto.salvar(p2);
		
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Caio Azevedo");
		c1.setEmail("caio.carvalho87@gmail.com");
		repositorioCliente.salvar(c1);
		
		System.out.println("------ CLIENTES ------");
		for (Cliente cliente : repositorioCliente.listar()) {
			System.out.println(cliente);
		}
		
		System.out.println("------ PRODUTOS ------");
		for (Produto produto : repositorioProduto.listar()) {
			System.out.println(produto);
		}
		
		System.out.println(repositorioProduto.buscar(1));
	}
	
	
}
