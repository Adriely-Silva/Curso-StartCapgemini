package Questao34;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Nadador {

	private String nome;

	private LocalDate dataNascimento;

	public Nadador(String nome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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

	public Integer getIdade() {
		LocalDate hoje = LocalDate.now();
		Long diferenca = hoje.getLong(ChronoField.EPOCH_DAY) - getDataNascimento().getLong(ChronoField.EPOCH_DAY);
		Double loucura = Math.floor(((double) diferenca) / 365);
		return loucura.intValue();
	}

	public String getCategoriaNadador() {
		String classificao = "";
		Integer idade = getIdade();
		
		if ((idade >= 5) && (idade <= 7)) {
			classificao = "Infatil A";
		} else if ((idade >= 8) && (idade <= 10)) {
			classificao = "Infatil B";
		} else if ((idade >= 11) && (idade <= 13)) {
			classificao = "Juvenil A";
		} else if ((idade >= 14) && (idade <= 17)) {
			classificao = "Juvenil B";
		} else if ((idade >= 18) && (idade <= 25)) {
			classificao = "Sênior";
		} else {
			classificao = "Idade fora da faixa etária";
		}
		return classificao;	
	}

	@Override
	public String toString() {
		return "Sua categoria: " + getCategoriaNadador();
	}
}
