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
			return "O número é positivo";
		} else if(getNumero() < 0) {
			return "O número é negativo";
		}else {
			return "O número é zero";
		}	
	}
	
	@Override
	public String toString() {
		return getNumero() + " | "+ getDescricao();
	}
}
