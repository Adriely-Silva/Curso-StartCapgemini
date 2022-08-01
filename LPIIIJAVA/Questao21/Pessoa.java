package Questao21;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Pessoa {
	
	private String nome;
	
	private LocalDate dataNascimento;
	
	private Genero genero;
	
	private Saude saude;

	public Pessoa(String nome, LocalDate dataNascimento, Genero genero, Saude saude) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.saude = saude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Saude getSaude() {
		return saude;
	}

	public void setSaude(Saude saude) {
		this.saude = saude;
	}
	
	public Integer getIdade() {
		LocalDate hoje = LocalDate.now();
		Long diferenca = hoje.getLong(ChronoField.EPOCH_DAY) - getDataNascimento().getLong(ChronoField.EPOCH_DAY);
		Double loucura = Math.floor(((double) diferenca) / 365);
		return loucura.intValue();
	}
	
	public String getEstadoSaude() {
		return getSaude() == Saude.SAUDAVEL ? "Pode" : "Não pode";
	}
	
	public String getEstarApto() {
		Integer idade = getIdade();
	    String estado = getEstadoSaude();
		if ((idade >= 18) && (estado == "Pode")) {
			return "Está apto";
		} else {
			return "Não estar apto";
		}
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " |  Resultado: " + getEstarApto();
	}
}
