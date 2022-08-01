package Questao24;

public class Numero {
	
	private Integer numero;

	public Numero(Integer numero) {
		super();
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getDescricao() {
		if (getNumero() > 0) {
			return "O n�mero � positivo";
		} else if(getNumero() < 0) {
			return "O n�mero � negativo";
		}else {
			return "O n�mero � zero";
		}	
	}
	
	@Override
	public String toString() {
		return getNumero() + " | "+ getDescricao();
	}
}
