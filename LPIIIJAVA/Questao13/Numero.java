package Questao13;

import java.util.Scanner;

/* Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 10;*/
public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor:");
		Double numero = Double.parseDouble(entrada.next().replaceAll(",", "."));

		if (numero > 10) {
			System.out.println("O n�mero � maior que 10!");
		} else {
			System.out.println("O n�mero � menor ou igual a 10!");
		}

		entrada.close();
	}
}
