package generics;

import java.util.List;

public class RepositorioCliente implements IRepositorio<Cliente> {

	private final Repositorio<Cliente> repo = new Repositorio<Cliente>();

	@Override
	public void salvar(Cliente entidade) {
		this.repo.salvar(entidade);
	}

	@Override
	public Cliente buscar(int id) {
		return this.repo.buscar(id);
	}
	
	@Override
	public List<Cliente> buscarTodos() {
		return this.repo.buscarTodos();
	}

}
