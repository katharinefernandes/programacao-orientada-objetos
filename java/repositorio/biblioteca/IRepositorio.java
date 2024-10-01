package repositorio.biblioteca;

import java.util.List;

public interface IRepositorio<T> {

	void salvar(T item);

	T buscar(int id);

	void remover(int id);

	List<T> listar();

}
