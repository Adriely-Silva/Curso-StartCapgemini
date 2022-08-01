package Questao16;

import java.util.Scanner;

/*Escreva um algoritmo que leia o nome e as tr�s notas obtidas por um aluno durante o semestre. Calcular a
sua m�dia (aritm�tica), informar o nome e sua men��o aprovado (media >= 7), Reprovado (media <= 5) e
Recupera��o (media entre 5.1 a 6.9); */
public class MediaFinal {

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

		if (mediaAluno >= 7) {
			System.out.println("Aluno(a): " + nomeAluno + "\nAprovado");
		} else if (mediaAluno <= 5) {
			System.out.println("Aluno(a): " + nomeAluno + "\nReprovado");
		} else {
			System.out.println("Aluno(a): " + nomeAluno + "\nRecupera��o");
		}

		entrada.close();
	}
}
