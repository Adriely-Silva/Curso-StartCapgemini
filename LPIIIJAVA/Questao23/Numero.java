package Questao23;

import java.util.Scanner;

/*Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero segue maior que 80,
menor que 25 ou igual a 40;*/
public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		Integer num = entrada.nextInt();
		
		if (num == 40) {
			System.out.println("O n�mero � igual a 40");
		} else if (num < 25) {
			System.out.println("O n�mero � menor que 25");
		} else if (num > 80) {
			System.out.println("O n�mero � maior que 80");
		} else {
			System.out.println("O n�mero n�o se enquadra");
		}
		
		entrada.close();
	}
}
