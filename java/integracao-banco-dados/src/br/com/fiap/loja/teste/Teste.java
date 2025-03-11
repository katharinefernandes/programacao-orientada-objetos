package br.com.fiap.loja.teste;

import java.util.Scanner;

import br.com.fiap.loja.model.Cliente;

public class Teste {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("---------- MENU -----------");
		System.out.println("1 - Incluir novo cliente.");
		System.out.println("2 - Alterar um cliente.");
		System.out.println("3 - Excluir um cliente.");
		System.out.println("0 - Sair.");
		System.out.println("-----------------------");
		System.out.println("");
		System.out.print("Escolha qual eh a funcao desejada: ");
		int opcao = sc.nextInt();

		while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.print("Informe uma opcao valida (0, 1, 2 ou 3): ");
			opcao = sc.nextInt();
		}

		while (opcao != 0) {
			Cliente c1 = new Cliente();

			switch (opcao) {
			case 1: {
				adicionaCliente(c1);
				break;
			}
			case 2: {
				alterarCliente(c1);
				System.out.println("Cliente Alterado com Sucesso!");
				break;
			}
			default:
				removerCliente(c1);
				System.out.println("Cliente Removido com Sucesso!");
				break;
			}

			System.out.print("\nEscolha qual eh a funcao desejada: ");
			opcao = sc.nextInt();
		}

		System.out.println("Saindo...");

	}

	private static void adicionaCliente(Cliente c1) {
		System.out.print("Digite codigo do cliente: ");
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
	}

	private static void alterarCliente(Cliente c1) {
		System.out.print("Informe o id do cliente que deseja alterar: ");
		c1.setIdCliente(sc.nextLong());
		System.out.print("Informe o novo email: ");
		c1.setEmail(sc.next());
		System.out.print("Informe o novo telefone: ");
		c1.setTelefone(sc.next());
		c1.alteraCliente();
	}

	private static void removerCliente(Cliente c1) {
		System.out.print("Digite o id do cliente que deseja excluir: ");
		c1.setIdCliente(sc.nextLong());
		c1.excluiCliente();
	}

}