package generics;

import java.util.List;

public interface IRepositorio<T> {

	void salvar(T entidade);

	T buscar(int id);
	
	List<T> buscarTodos();

}
