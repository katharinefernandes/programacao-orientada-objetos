package br.com.fiap.polimorfismo;

public class Calculadora {
	
	// reescrita de um metodo da classe base, utiliza-se @Override
	// na classe derivada ou classe filha você precisa reescrever o método para a classe filha
	
	// para sobrecarga não é necessário adicionar anotação especifica, apenas os parâmetros devem ser diferentes ou com tipos de dados diferentes

	public int somar(int a, int b) {
		return a + b;
	}

	public double somar(double a, double b) {
		return a + b;
	}

	public double somar(int a, double b) {
		return a + b;
	}

	public double somar(double a, int b) {
		return a + b;
	}

	

}
