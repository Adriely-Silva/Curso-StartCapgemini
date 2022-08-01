package Questao01;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Person {
	
	private String name;
	
	private LocalDate birthDate;
	
	private Double height;

	public Person(String name, LocalDate birthDate, Double height) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Integer getAge() {
		LocalDate today = LocalDate.now();
		Long difference = today.getLong(ChronoField.EPOCH_DAY) - getBirthDate().getLong(ChronoField.EPOCH_DAY);
		Double age = Math.floor(((double) difference) / 365);
		return age.intValue();
	}
	 
	@Override
	public String toString() {
		return "Os dados da pessoa" + "\nNome: " + getName() + "\nData de nascimento: " + getBirthDate() + "\nAltura: " + getHeight() + " m" + "\nIdade: " + getAge() + " anos";
	}
}
