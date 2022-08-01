package Questao01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa.*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String name = scanner.next();
		
		System.out.println("Informe a data de nascimento:");
		String birthDate = scanner.next();
		
		System.out.println("Informe a altura:");
		Double height = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		LocalDate date = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Person person = new Person(name, date, height);
		
		System.out.println(person.toString());
		scanner.close();
	}
}
