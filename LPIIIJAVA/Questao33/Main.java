package Questao33;

import java.util.Scanner;

/*33. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula. */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do professor:");
		String nome = entrada.next();

		System.out.println("Seu nível:");
		Integer nivel = entrada.nextInt();

		System.out.println("Sua jornada de trabalho(hora):");
		Integer jornadaTrabalho = entrada.nextInt();

		System.out.println("Total de dias que trabalhou no mês:");
		Integer totalDias = entrada.nextInt();

		Professor professor = new Professor(nome, nivel, jornadaTrabalho, totalDias);
		
		System.out.println(professor.toString());
		
		entrada.close();
	}
}
