package br.com.fiap.repositorio;

import java.util.List;

// qual objeto que vc vai utilizar ao implementar a interface <T>
public interface IRepositorio<T> {

	void salvar(T entidade);

	T buscar(int id);

	void remover(int id);

	List<T> listar();

}
