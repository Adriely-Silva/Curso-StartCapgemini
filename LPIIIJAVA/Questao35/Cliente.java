package Questao35;

public class Cliente {
	
	private String nome;
	
	private TipoCliente tipo;
	
	private Double usoDeEnergia;

	public Cliente(String nome, TipoCliente tipo, Double usoDeEnergia) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.usoDeEnergia = usoDeEnergia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public Double getUsoDeEnergia() {
		return usoDeEnergia;
	}

	public void setUsoDeEnergia(Double usoDeEnergia) {
		this.usoDeEnergia = usoDeEnergia;
	}
	
	public Double getCota() {
		Double valor = 0.0;
		switch (getTipo()) {
			case RESIDENCIA:
				valor = 0.60;
				break;
			case COMERCIO:
				valor = 0.48;
				break;
			case INDUSTRIA:
				valor = 1.29;
				break;
			default:
				System.err.println("Tipo de cliente não informado corretamente");
		}
		return valor;
	}
	
	public Double getValorDaConta() {
		return getCota() * getUsoDeEnergia();	
	}
	
	@Override
	public String toString() {
		return "Valor: R$" + getValorDaConta();
	}
}
