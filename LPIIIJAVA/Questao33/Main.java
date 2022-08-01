package Questao33;

import java.util.Scanner;

/*33. A escola �APRENDER� faz o pagamento de seus professores por hora/aula. Fa�a um algoritmo que
calcule e exiba o sal�rio de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
a. Professor N�vel 1 R$12,00 por hora/aula;
b. Professor N�vel 2 R$17,00 por hora/aula;
c. Professor N�vel 3 R$25,00 por hora/aula. */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome do professor:");
		String nome = entrada.next();

		System.out.println("Seu n�vel:");
		Integer nivel = entrada.nextInt();

		System.out.println("Sua jornada de trabalho(hora):");
		Integer jornadaTrabalho = entrada.nextInt();

		System.out.println("Total de dias que trabalhou no m�s:");
		Integer totalDias = entrada.nextInt();

		Professor professor = new Professor(nome, nivel, jornadaTrabalho, totalDias);
		
		System.out.println(professor.toString());
		
		entrada.close();
	}
}
