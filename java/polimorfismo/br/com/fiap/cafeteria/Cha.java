package br.com.fiap.cafeteria;

import br.com.fiap.cafeteria.enums.SaborChaEnum;

public class Cha extends Bebida {

	private SaborChaEnum sabor;

	public SaborChaEnum getSabor() {
		return sabor;
	}

	public void setSabor(SaborChaEnum sabor) {
		this.sabor = sabor;
	}

	@Override
	public double calcularPreco() {
		double precoFinal = precoBase;

		switch (sabor) {
		case CHA_VERDE:
			precoFinal += 5;
			break;
		case HORTELA:
			precoFinal += 5;
			break;
		case CHA_PRETO:
			precoFinal += 8;
			break;
		default:
			precoFinal += 0;
		}
		
		switch (tamanho) {
		case PEQUENO:
			precoFinal += 2;
			break;
		case MEDIO:
			precoFinal += 5;
			break;
		default:
			precoFinal += 8;
		}

		return precoFinal;
	}

}
