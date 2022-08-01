package Questao28;

public class Funcionario {
	
	private String nome;
	
	private Double salario;
	
	private Double reajuste;

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getReajuste() {
		return reajuste;
	}

	public void setReajuste(Double reajuste) {
		this.reajuste = reajuste;
	}
	
	public Double getSalarioNovo() {
		return getSalario() + getReajuste();
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + getNome() + ", reajuste=" + getReajuste() + ", salario novo=" + getSalarioNovo() + "]";
	}
}
