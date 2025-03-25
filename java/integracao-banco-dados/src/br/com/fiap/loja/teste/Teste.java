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
		System.out.println("4 - Pesquisar cliente.");
		System.out.println("5 - Incluir uma categoria.");
		System.out.println("6 - Alterar uma categoria.");
		System.out.println("7 - Exluir uma categoria.");
		System.out.println("8 - Pesquisar uma categoria.");
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
				System.out.println("Pesquisar Cliente....");
				break;
			}
			case 5: {
				adicionarCategoria();
				break;
			}
			case 6: {
				atualizarCategoria();
				break;
			}
			case 7: {
				removerCategoria();
				break;
			}
			case 8: {
				pesquisarCategorias();
				break;
			}
			default:
				System.out.print("Informe uma opcao valida (0, 1, 2 ou 3): ");
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