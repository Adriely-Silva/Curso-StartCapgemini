package Questao08;

import java.util.Scanner;

/*8. Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em
d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares
dispon�veis com o usu�rio; */
public class Conversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor em dol�r: US$");
		Double valorDolar = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe a cota��o do dol�r hoje: R$");
		Double valorCotacao = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorReal = valorDolar * valorCotacao;

		System.out.println("O valor em reais: R$" + valorReal);

		entrada.close();
	}
}
