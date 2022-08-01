package Questao01;

import java.util.Scanner;

/*1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma; */
public class Soma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		Double a = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("Digite outro valor:");
		Double b = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double soma = a + b;
		System.out.println("A soma dos dois valores: " + soma);
	
		entrada.close();
	}
}
