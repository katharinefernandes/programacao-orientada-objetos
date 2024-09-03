package br.com.fiap.polimorfismo;

public class Cachorro extends Animal {

	@Override
	public void falar() {
		super.falar();
		System.out.println("Au au");
	}

	@Override
	public String toString() {
		return "Cachorro [getRaca()=" + getRaca() + ", getIdade()=" + getIdade() + "]";
	}

}
