package Questao34;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
a. Infantil A = 5 - 7 anos;
b. Infantil B = 8 - 10 anos;
c. Juvenil A = 11- 13 anos;
d. Juvenil B = 14 - 17 anos;
e. Sênior = 18 - 25 anos.
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado; */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do nadador:");
		String nome = entrada.next();

		System.out.println("Informe a data de nascimento:");
		String dataNascimento = entrada.next();

		LocalDate data = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Nadador nadador = new Nadador(nome, data);

		System.out.println(nadador.toString());

		entrada.close();
	}
}
