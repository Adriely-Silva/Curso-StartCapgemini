package Questao14;

import java.util.Scanner;

/* 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual � o maior;*/
public class Comparacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		Integer num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero:");
		Integer num2 = entrada.nextInt();
		
		if (num1 > num2) {
			System.out.println("O n�mero " + num1 + " � maior que o n�mero " + num2);
		} else {
			System.out.println("O n�mero " + num2 + " � maior que o n�mero " + num1);
		}

		entrada.close();
	}
}
