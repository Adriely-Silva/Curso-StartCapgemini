package Questao31;

import java.util.Scanner;

/*31. Dados tr�s valores A, B e C, em que A e B s�o n�meros reais e C � um caractere, pede-se para imprimir o
resultado da opera��o de A por B se C for um s�mbolo de operador aritm�tico; caso contr�rio deve ser
impressa uma mensagem de operador n�o definido. Tratar erro de divis�o por zero; */
public class Operacoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe dois valores e escolha uma opera��o com base no caracter, sendo:");
		System.out.println("Soma => + ");
		System.out.println("Subtra��o => - ");
		System.out.println("Multiplica��o => * ");
		System.out.println("Divis�o => / ");

		System.out.println("Digite um valor:");
		Double a = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Digite outro valor:");
		Double b = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Digite o caracter da opera��o que deseja:");
		Character c = entrada.next().charAt(0);
		
		switch (c) {
			case '+': 
				Double soma = a + b;
				System.out.println("Soma = " + soma);
				break;
			case '-':
				Double subtracao = a - b;
				System.out.println("Subtra��o = " + subtracao);
				break;
			case '*':
				Double multiplicacao = a * b;
				System.out.println("Multiplica��o = " + multiplicacao);
				break;
			case '/': 
				if (b == 0) {
					System.err.println("N�o existe divis�o com zero");
				} else {
					Double divisao = a/b;
					System.out.println("Divis�o = " + divisao);
				}
				break;
			default: 
				System.err.println("Operador n�o defenido");
		}
		
		entrada.close();
	}

}
