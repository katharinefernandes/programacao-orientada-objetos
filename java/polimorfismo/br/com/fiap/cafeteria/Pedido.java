package br.com.fiap.cafeteria;

import java.util.List;

public class Pedido {

	private List<Bebida> bebidas;
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	
	public void adicionarBebida(Bebida bebida) {
		bebidas.add(bebida);
	}
	
	public void calcularTotal() {
		
	}
	
}
