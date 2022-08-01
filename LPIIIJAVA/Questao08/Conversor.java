package Questao08;

import java.util.Scanner;

/*8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares
disponíveis com o usuário; */
public class Conversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor em dolár: US$");
		Double valorDolar = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe a cotação do dolár hoje: R$");
		Double valorCotacao = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorReal = valorDolar * valorCotacao;

		System.out.println("O valor em reais: R$" + valorReal);

		entrada.close();
	}
}
