package Questao15;

import java.util.Scanner;

/*15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;*/
public class Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		Integer num = entrada.nextInt();
		
		if ((num > 100) && (num < 200)) {
			System.out.println("O número está no intervalo entre 100 e 200");
		} else {
			System.out.println("O número não está no intervalo entre 100 e 200");
		}
		
		entrada.close();
	}
}
