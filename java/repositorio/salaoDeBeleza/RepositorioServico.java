package repositorio.salaoDeBeleza;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RepositorioServico implements IRepositorio<Servico> {

	List<Servico> lista = new ArrayList<Servico>();

	@Override
	public void adicionar(Servico item) {
		this.lista.add(item);
	}

	@Override
	public void remover(Servico item) {
		this.lista.remove(item);
	}

	@Override
	public List<Servico> listarTodos() {
		return lista;
	}

	@Override
	public List<Servico> filtrarPor(Predicate<Servico> criterio) {
		return lista.stream().filter(criterio).collect(Collectors.toList());
	}

}
