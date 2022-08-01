package Questao19;

public enum Genero {
	MASCULINO, FEMENINO;
	
	public static Genero buscaPorOrdinal(Integer ordinal) {
		for (Genero genero : values()) {
			if (ordinal.equals(genero.ordinal())) {
				return genero;
			}
		}
		return null;
	}
}
