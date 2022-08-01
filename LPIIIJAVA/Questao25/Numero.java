package Questao25;

import java.util.Scanner;

/*25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
maior, e uma mensagem que são diferentes; */
public class Numero {

	public static void main(String[] args) {
		Integer num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		num1 = entrada.nextInt();
		
		System.out.println("Digite outro número:");
		num2 = entrada.nextInt();
		
		if (!num1.equals(num2)) {
			Integer maior = (num1 > num2) ? num1 : num2;
			System.out.println("Maior é " + maior);
			System.out.println("Eles são diferentes");
		} else {
			System.out.println("Números iguais");
		}
		entrada.close();
	}
}
