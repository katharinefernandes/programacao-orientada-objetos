package repositorio.biblioteca;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.repositorio.IRepositorio;

public class RepositorioMemoria<T> implements IRepositorio<T> {

	public List<T> lista = new ArrayList<T>();

	@Override
	public void salvar(T entidade) {
		lista.add(entidade);
	}

	@Override
	public T buscar(int id) {
		return lista.get(id);
	}

	@Override
	public void remover(int id) {
		this.lista.remove(id);
	}

	@Override
	public List<T> listar() {
		return lista;
	}

}
