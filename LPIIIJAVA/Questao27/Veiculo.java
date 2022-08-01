package Questao27;

public class Veiculo {
	
	private String cliente;
	
	private String modelo;
	
	private Categoria categoria;
	
	private Double valor;
	
	private Combustivel tipoCombustivel;
	
	public Veiculo(String cliente, String modelo, Categoria categoria, Double valor, Combustivel tipoCombustivel) {
		super();
		this.cliente = cliente;
		this.modelo = modelo;
		this.categoria = categoria;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getValorFinal() {
		Double valorFinal = getValor() - getDesconto();
		return valorFinal;
	}
	
	public Double getDesconto() {
		Double percentual = 0.0;
		switch (getTipoCombustivel()) {
		case ALCOOL:
			percentual = 0.25;
			break;
		case GASOLINA:
			percentual = 0.21;
			break;
		case DIESEL:
			percentual = 0.14;
			break;
		}
		Double desconto = getValor() * percentual;
		return desconto;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + getCliente() + " | Veículo: " + getModelo() + " | Categoria: " + getCategoria() +" | Tipo de combustível: " + getTipoCombustivel() + " | Valor Final: R$" + getValorFinal();	
	}
	
}