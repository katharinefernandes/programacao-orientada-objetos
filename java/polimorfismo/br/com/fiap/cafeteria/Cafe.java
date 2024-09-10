package br.com.fiap.cafeteria;

import br.com.fiap.cafeteria.enums.TipoLeiteEnum;

public class Cafe extends Bebida {

	private TipoLeiteEnum tipoLeite;

	public TipoLeiteEnum getTipoLeite() {
		return tipoLeite;
	}

	public void setTipoLeite(TipoLeiteEnum tipoLeite) {
		this.tipoLeite = tipoLeite;
	}

	@Override
	public double calcularPreco() {

		double precoFinal = precoBase;

		switch (tipoLeite) {
		case INTEGRAL:
			precoFinal += 5;
			break;
		case DESNATADO:
			precoFinal += 5;
			break;
		case VEGETAL:
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
