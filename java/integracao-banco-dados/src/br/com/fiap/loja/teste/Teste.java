package br.com.fiap.loja.teste;

import java.util.Scanner;

import br.com.fiap.loja.model.Cliente;

public class Teste {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		System.out.print("Digite código do cliente: ");
		c1.setIdCliente(sc.nextLong());
		System.out.print("Informe o nome do cliente: ");
		c1.setNome(sc.next());
		System.out.print("Informe o email do cliente: ");
		c1.setEmail(sc.next());
		System.out.print("Informe o telefone do cliente: ");
		c1.setTelefone(sc.next());
		System.out.print("Informe o cpf do cliente: ");
		c1.setCpf(sc.next());
		
		c1.insereCliente();
		
		System.out.print("Deseja alterar um cadastro? S ou N: ");
		if (sc.next().equalsIgnoreCase("S")) {
			System.out.println("Informe o id do cliente que deseja alterar: ");
			c1.setIdCliente(sc.nextLong());
			System.out.println("Informe o novo email: ");
			c1.setNome(sc.next());
			System.out.println("Informe o novo telefone: ");
			c1.setEmail(sc.next());
			// falta fazer 
			// alterar cliente
		} else {
			System.out.println("Encerrando");
		}
	}

}
