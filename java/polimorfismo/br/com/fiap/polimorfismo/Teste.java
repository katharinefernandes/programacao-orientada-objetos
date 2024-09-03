package br.com.fiap.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();
		c1.somar(1.2, 2.1);

		Cachorro dog = new Cachorro();
		dog.falar();

		List<Cachorro> dogs = new ArrayList<Cachorro>();
		
		Cachorro dog1 = new Cachorro();
		dog1.setIdade(1);
		dog1.setRaca("Spitz");
		
		Cachorro dog2 = new Cachorro();
		dog2.setIdade(2);
		dog2.setRaca("York");
		
		Cachorro dog3 = new Cachorro();
		dog3.setIdade(3);
		dog3.setRaca("Vira Lata");
		
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		
		for (Cachorro cachorro : dogs) {
			System.out.println(cachorro);
		}
			
	}

}
