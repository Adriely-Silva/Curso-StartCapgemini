package Questao22;

public class Produto {

	private String nome;
	
	private Double precoCusto;
	
	private Double precoVenda;

	public Produto(String nome, Double precoCusto, Double precoVenda) {
		super();
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public String getDescricao() {
		if (getPrecoVenda() > getPrecoCusto()) {
			return "Descrição: lucro";
		} else if(getPrecoVenda() < getPrecoCusto()) {
			return "Descrição: prejuízo";
		} else {
			return "Descrição: empate";
		}
	}
	
	@Override
	public String toString() {
		return "Produto: " + getNome() + " | " + "Preço de Custo: R$" + getPrecoCusto() + " | "+  "Preço de venda: R$" + getPrecoVenda() + " | " + getDescricao();
	}
}
