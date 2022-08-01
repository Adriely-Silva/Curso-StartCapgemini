package Questao05;

import java.util.Scanner;

/*5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética); */
public class MediaAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do aluno:");
		String nomeAluno = entrada.next();

		System.out.println("Informe a primeira nota:");
		Double nota1 = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe a segunda nota:");
		Double nota2 = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe a terceira nota:");
		Double nota3 = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double mediaAluno = (nota1 + nota2 + nota3) / 3;

		System.out.println("Aluno(a): " + nomeAluno);
		System.out.println("Sua média: " + mediaAluno);

		entrada.close();	
	}
}
