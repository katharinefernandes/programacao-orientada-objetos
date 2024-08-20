package br.com.fiap.conta;

public class Tela {

	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		Cliente cli1  = new Cliente("Caio","36454437888","3074501801","(11) 952487777");
		System.out.println(cli1.toString());
		c1.setCliente(cli1);
		cli1.setNome("Caio de Carvalho");	
		System.out.println(c1.getCliente());
		
		Cliente cli2 = new Cliente();
		
		c1.deposito(1000);
		double v = c1.consultaSaldo();
		
		
		System.out.println("Seu saldo atual é " + v);
		
		ContaCorrente c2 = new ContaCorrente();
		double v2 = c2.consultaSaldo();
		System.out.println(v2);
		
		if (c1.fazTransferencia(c2, 350)) {
			System.out.println("Transferencia realizada!!");
		}
		else {
			System.out.println("Transferencia não realizada");
		}
		
		System.out.println("O saldo da conta 1 "+ c1.consultaSaldo());
		System.out.println("O saldo da conta 2 "+ c2.consultaSaldo());
		
		
		c1.saque(100);
		c2.saque(400);
		System.out.println("O saldo da conta 1 "+ c1.consultaSaldo());
		System.out.println("O saldo da conta 2 "+ c2.consultaSaldo());
		
		

	}
}
