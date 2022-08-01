package Questao35;

public enum TipoCliente {
	RESIDENCIA, COMERCIO, INDUSTRIA;
	
	public static TipoCliente buscarPorOrdinal(Integer ordinal) {
		ordinal--;
		for (TipoCliente tipo : values()) {
			if (ordinal.equals(tipo.ordinal())) {
				return tipo;
			}
		}
		return null;
	}
}
