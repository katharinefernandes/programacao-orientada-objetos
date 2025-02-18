package br.com.fiap.exception.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DoadorSangue doador = new DoadorSangue("Doador 1", 10, 56.0);
		try {
			doador.validaNome();
			doador.validaDoacao();
		} catch (MinhaException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
		System.out.println(doador);
		
	}

}
