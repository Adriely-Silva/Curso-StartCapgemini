package Questao23;

import java.util.Scanner;

/*Faça um algoritmo que receba um número e mostre uma mensagem caso este número segue maior que 80,
menor que 25 ou igual a 40;*/
public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		Integer num = entrada.nextInt();
		
		if (num == 40) {
			System.out.println("O número é igual a 40");
		} else if (num < 25) {
			System.out.println("O número é menor que 25");
		} else if (num > 80) {
			System.out.println("O número é maior que 80");
		} else {
			System.out.println("O número não se enquadra");
		}
		
		entrada.close();
	}
}
