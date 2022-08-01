package Questao21;


public enum Genero {
	MASCULINO(1, "Masculino"), FEMENINO(2, "Femenino");
	
	private Integer numero;
	
	private String genero;

	private Genero(Integer numero, String genero) {
		this.numero = numero;
		this.genero = genero;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getGenero() {
		return genero;
	}
	
	public static Genero buscarPorNumero(Integer numero) {
		for (Genero genero : values()) {
			if (genero.getNumero().equals(numero)) {
				return genero;
			}
		}
		return null;
	}
}
