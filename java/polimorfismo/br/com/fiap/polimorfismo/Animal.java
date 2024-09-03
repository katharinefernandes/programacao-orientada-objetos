package br.com.fiap.polimorfismo;

public class Animal {

	private String raca;
	private int idade;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void falar() {
		System.out.println("Som do animal");
	}


}
