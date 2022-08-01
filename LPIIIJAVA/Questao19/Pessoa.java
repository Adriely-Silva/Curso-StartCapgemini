package Questao19;

public class Pessoa {
	
	private String nome;
	
	private Genero genero;

	public Pessoa(String nome, Genero genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +  " | " + "Gênero: " + getGenero();
	}
}