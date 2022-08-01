package Questao18;

public class Pessoa {
	
	private String nome;
	
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		String deMaior = (getIdade() >= 18) ? " 'Maior de idade'" : " 'Menor de idade'";

		return "Nome: " + getNome() + deMaior;
	}
}
