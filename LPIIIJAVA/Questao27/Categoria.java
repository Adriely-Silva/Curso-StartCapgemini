package Questao27;

public enum Categoria {
	CARRO, MOTO, CAMINHAO;
	
	public static Categoria buscarPorOrdinal(Integer ordinal) {
		for (Categoria tipo : values()) {
			if (ordinal.equals(tipo.ordinal())) {
				return tipo;
			}
		}
		return null;
	}
}

