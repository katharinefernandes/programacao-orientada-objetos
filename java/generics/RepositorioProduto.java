package generics;

import java.util.List;

public class RepositorioProduto implements IRepositorio<Produto>{

	private final Repositorio<Produto> repo = new Repositorio<Produto>();

	@Override
	public void salvar(Produto entidade) {
		this.repo.salvar(entidade);
	}

	@Override
	public Produto buscar(int id) {
		return this.repo.buscar(id);
	}

	@Override
	public List<Produto> buscarTodos() {
		return this.repo.buscarTodos();
	}
	
	

}
