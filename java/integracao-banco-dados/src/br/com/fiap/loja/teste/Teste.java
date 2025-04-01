package br.com.fiap.loja.teste;

import java.util.Scanner;

import br.com.fiap.loja.model.Categoria;
import br.com.fiap.loja.model.Cliente;

public class Teste {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("---------- MENU -----------");
		System.out.println("1 - Incluir novo cliente.");
		System.out.println("2 - Alterar um cliente.");
		System.out.println("3 - Excluir um cliente.");
		System.out.println("4 - Pesquisar um cliente por id.");
		System.out.println("5 - Pesquisar clientes.");
		System.out.println("6 - Pesquisar clientes por nome.");
		System.out.println("7 - Incluir uma categoria.");
		System.out.println("8 - Alterar uma categoria.");
		System.out.println("9 - Exluir uma categoria.");
		System.out.println("10 - Pesquisar uma categoria.");
		System.out.println("0 - Sair.");
		System.out.println("-----------------------");
		System.out.println("");
		System.out.print("Escolha qual eh a funcao desejada: ");
		int opcao = sc.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1: {
				adicionaCliente();
				break;
			}
			case 2: {
				alterarCliente();
				System.out.println("Cliente Alterado com Sucesso!");
				break;
			}
			case 3: {
				removerCliente();
				System.out.println("Cliente Removido com Sucesso!");
				break;
			}
			case 4: {
				pesquisarCliente();
				break;
			}
			case 5: {
				pesquisarClientes();
				break;
			}
			case 6: {
				pesquisarClientesPorNome();
				break;
			}
			case 7: {
				adicionarCategoria();
				break;
			}
			case 8: {
				atualizarCategoria();
				break;
			}
			case 9: {
				removerCategoria();
				break;
			}
			case 10: {
				pesquisarCategorias();
				break;
			}
			default:
				System.out.print("Informe uma opcao valida (0 a 10): ");
				opcao = sc.nextInt();
			}

			System.out.print("\nEscolha qual eh a funcao desejada: ");
			opcao = sc.nextInt();
		}

		System.out.println("Saindo...");

	}

	private static void adicionaCliente() {
		Cliente c1 = new Cliente();
		System.out.print("Digite codigo do cliente: ");
		c1.setIdCliente(sc.nextLong());
		System.out.print("Informe o nome do cliente: ");
		c1.setNome(sc.nextLine());
		System.out.print("Informe o email do cliente: ");
		c1.setEmail(sc.nextLine());
		System.out.print("Informe o telefone do cliente: ");
		c1.setTelefone(sc.nextLine());
		System.out.print("Informe o cpf do cliente: ");
		c1.setCpf(sc.nextLine());

		c1.insereCliente();
	}

	private static void alterarCliente() {
		Cliente c1 = new Cliente();
		System.out.print("Informe o id do cliente que deseja alterar: ");
		c1.setIdCliente(sc.nextLong());
		System.out.print("Informe o novo email: ");
		c1.setEmail(sc.nextLine());
		System.out.print("Informe o novo telefone: ");
		c1.setTelefone(sc.nextLine());
		c1.alteraCliente();
	}

	private static void removerCliente() {
		Cliente c1 = new Cliente();
		System.out.print("Digite o id do cliente que deseja excluir: ");
		c1.setIdCliente(sc.nextLong());
		c1.excluiCliente();
	}

	private static void pesquisarCliente() {
		Cliente c1 = new Cliente();

		System.out.print("Informe o id do cliente: ");
		c1.setIdCliente(sc.nextLong());

		System.out.println(c1.pesquisarCliente());
	}

	private static void pesquisarClientes() {
		Cliente c1 = new Cliente();

		for (Cliente cliente : c1.pesquisarClientes()) {
			System.out.println(cliente);
		}

	}

	private static void pesquisarClientesPorNome() {
		Cliente c1 = new Cliente();

		System.out.print("Informe o nome do cliente: ");

		for (Cliente cliente : c1.pesquisarClienteByName(sc.next())) {
			System.out.println(cliente);
		}

	}

	private static void adicionarCategoria() {
		Categoria cat = new Categoria();
		System.out.print("Informe o id da categoria: ");
		cat.setIdCategoria(sc.nextInt());
		sc.nextLine();
		System.out.print("Informe a descricao da categoria: ");
		cat.setDescricao(sc.nextLine());

		cat.inserirCategoria();
	}

	private static void atualizarCategoria() {
		Categoria cat = new Categoria();
		System.out.print("Informe o id da categoria: ");
		cat.setIdCategoria(sc.nextInt());
		sc.nextLine();
		System.out.print("Informe a descricao da categoria: ");
		cat.setDescricao(sc.nextLine());

		cat.alterarCategoria();
	}

	private static void removerCategoria() {
		Categoria cat = new Categoria();
		System.out.print("Informe o id da categoria: ");
		cat.setIdCategoria(sc.nextInt());

		cat.excluirCategoria();
	}

	private static void pesquisarCategorias() {
		Categoria cat = new Categoria();
		System.out.println("Categorias Cadastradas");
		for (Categoria categoria : cat.pesquisarCategorias()) {
			System.out.println(categoria);
		}

	}

}