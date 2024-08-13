package br.com.fiap.banco;

public class Tela {

	public static void main(String[] args) {

		// instanciar e criar o objeto na memória
		// gera o objeto na memória quando adicionamos o "new"
		// cria do menos específico para o mais específico (faz mais sentido quando
		// tratamos de herança)
		// construtor padrão () - todos os atributos são criados vazios
		Endereco end1 = new Endereco("1", "São Paulo", "Centro", "São Paulo", "12345123", "Rua Oriente Monti", "90",
				"apto 44");
		Cliente cli1 = new Cliente(1L, "Cliente 1", "Feminino", 20L, "123.123.123-12", end1);
		Endereco end2 = new Endereco("2", "São Paulo", "Centro", "São Paulo", "12312312", "Avenida Rebouças", "100",
				"conj. 11");
		Agencia agencia = new Agencia("00023", "Agencia Teste", end2);
		Conta c1 = new Conta();

		// passando o cliente para classe conta
		c1.setCliente(cli1);
		c1.setNumConta("123");
		c1.setAgencia(agencia);

		System.out.println(c1.getCliente().getNomeCliente());

		// tipos de dados primitivos double/int o == funciona, no caso de String é uma
		// classe, ou seja, um objeto no Java, portanto o que utilizamos é o equals para
		// saber se o conteúdo é iqual
		c1.deposito(500);
		// endereçamento da memória onde a JM guardou o objeto
		System.out.println(c1);
		c1.deposito(300);
		System.out.println("Saldo " + c1.getSaldo());
		System.out.println("Num Conta: " + c1.getNumConta());
		System.out.println("Num. Agencia " + c1.getAgencia().getNumAgencia());

		if (c1.transferencia("123", "00024", 800)) {
			System.out.println("Saldo apos transferencia: " + c1.getSaldo());
		} else {
			System.out.println("Nao foi possivel fazer a transferencia");
		}

		System.out.println(c1.getCliente());

	}

}
