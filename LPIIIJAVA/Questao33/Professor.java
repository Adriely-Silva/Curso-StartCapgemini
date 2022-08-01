package Questao33;

public class Professor {

	private String nome;

	private Integer nivel;

	private Integer jornadaTrabalho;

	private Integer totalDias;

	public Professor(String nome, Integer nivel, Integer jornadaTrabalho, Integer totalDias) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.jornadaTrabalho = jornadaTrabalho;
		this.totalDias = totalDias;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(Integer jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public Integer getTotalDias() {
		return totalDias;
	}

	public void setTotalDias(Integer totalDias) {
		this.totalDias = totalDias;
	}
	
	public Integer getHoraAula() {
		Integer nivelProfessor = 0;
		switch (getNivel()) {
			case 1 :
				nivelProfessor = 12;
				break;
			case 2 :
				nivelProfessor = 17;
				break;
			case 3:
				nivelProfessor = 25;
				break;
			default :
				System.err.println("Não existe o nível");
		}
		return nivelProfessor;
	}

	public Double getSalarioProfessor() { 
		return Double.valueOf(getHoraAula() * getJornadaTrabalho() * getTotalDias());	
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + " | Salário: R$" + getSalarioProfessor();
	}
}
