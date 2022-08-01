package Questao13;

import java.util.Scanner;

/* Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;*/
public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor:");
		Double numero = Double.parseDouble(entrada.next().replaceAll(",", "."));

		if (numero > 10) {
			System.out.println("O número é maior que 10!");
		} else {
			System.out.println("O número é menor ou igual a 10!");
		}

		entrada.close();
	}
}
