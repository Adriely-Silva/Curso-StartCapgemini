package Questao14;

import java.util.Scanner;

/* 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;*/
public class Comparacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		Integer num1 = entrada.nextInt();
		
		System.out.println("Digite outro número:");
		Integer num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("O número " + num1 + " é maior que o número " + num2);
		} else {
			System.out.println("O número " + num2 + " é maior que o número " + num1);
		}

		entrada.close();
	}
}
