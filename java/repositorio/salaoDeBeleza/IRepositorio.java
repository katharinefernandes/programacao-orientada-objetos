package repositorio.salaoDeBeleza;

import java.util.List;
import java.util.function.Predicate;

public interface IRepositorio<T> {

	public void adicionar(T item);

	public void remover(T item);

	public List<T> listarTodos();

	public List<T> filtrarPor(Predicate<T> criterio);

}
