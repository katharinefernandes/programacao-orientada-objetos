package generics;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {

	private List<T> dados = new ArrayList<>();

	public void salvar(T entidade) {
		this.dados.add(entidade);
	};

	public T buscar(int id) {
		return this.dados.get(id);
	}

	public List<T> buscarTodos() {
		return this.dados;
	}

}
