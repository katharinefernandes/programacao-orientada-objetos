package repositorio.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RepositorioProduto implements IRepositorio<Produto> {

	List<Produto> lista = new ArrayList<Produto>();

	@Override
	public void adicionar(Produto item) {
		lista.add(item);

	}

	@Override
	public void remover(Produto item) {
		lista.remove(item);

	}

	@Override
	public List<Produto> listarTodos() {
		return lista;
	}

	@Override
	public List<Produto> filtroPor(Predicate<Produto> criterio) {
		// stream -> leitura da lista
		// filter -> filtra a lista de acordo com o criterio passado
		// collect coleta a parte que extraiu do filtro
		return lista.stream().filter(criterio).collect(Collectors.toList());
	}

}
