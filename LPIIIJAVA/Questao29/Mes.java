package Questao29;

public enum Mes {
	JANEIRO(1, "Janeiro"), FEVEREIRO(2, "Fevereiro"), MARCO(3, "Março"), ABRIL(4, "Abril"), MAIO(5, "Maio"), JUNHO(6, "Junho"),
	JULHO(7, "Julho"), AGOSTO(8, "Agosto"), SETEMBRO(9, "Setembro"), OUTUBRO(10, "Outubro"), NOVEMBRO(11, "Novembro"),
	DEZEMBRO(12, "Dezembro");
	
	private Integer numero;
	
	private String nome;
	
	private Mes(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public static Mes buscarPorNumero(Integer numero) {
		for (Mes mes : values()) {
			if (mes.getNumero().equals(numero)) {
				return mes;
			}
		}
		return null;
	}
}
