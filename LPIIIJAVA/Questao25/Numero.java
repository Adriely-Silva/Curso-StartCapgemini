package Questao25;

import java.util.Scanner;

/*25. Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes. Caso eles sejam iguais
imprima uma mensagem dizendo que eles s�o iguais. Caso sejam diferentes, informe qual n�mero � o
maior, e uma mensagem que s�o diferentes; */
public class Numero {

	public static void main(String[] args) {
		Integer num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		num1 = entrada.nextInt();
		
		System.out.println("Digite outro n�mero:");
		num2 = entrada.nextInt();
		
		if (!num1.equals(num2)) {
			Integer maior = (num1 > num2) ? num1 : num2;
			System.out.println("Maior � " + maior);
			System.out.println("Eles s�o diferentes");
		} else {
			System.out.println("N�meros iguais");
		}
		entrada.close();
	}
}
