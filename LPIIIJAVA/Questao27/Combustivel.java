package Questao27;

public enum Combustivel {
	ALCOOL, GASOLINA, DIESEL;
	
	public static Combustivel buscarOrdinal(Integer ordinal) {
		for (Combustivel tipo : values()) {
			if (ordinal.equals(tipo.ordinal())) {
				return tipo;
			}
		}
		return null;
	}
}

