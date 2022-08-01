package Questao20;

public class Carro {
	
	private Double valor;
	private Integer ano;

	public Carro(Double valor, Integer ano) {
		super();
		this.valor = valor;
		this.ano = ano;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAnoCarro(Integer ano) {
		this.ano = ano;
	}
	
}
