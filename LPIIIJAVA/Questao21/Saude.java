package Questao21;

public enum Saude {
	SAUDAVEL(1, "Saudável"), DOENTE(2, "Doente");
	
	private Integer numero;
	
	private String nome;

	private Saude(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
	public static Saude buscarPorNumero(Integer numero) {
		for (Saude saude : values()) {
			if (saude.getNumero().equals(numero)) {
				return saude;
			}
		}
		return null;
	}
}
