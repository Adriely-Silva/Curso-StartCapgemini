package Questao31;

import java.util.Scanner;

/*31. Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero; */
public class Operacoes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe dois valores e escolha uma operação com base no caracter, sendo:");
		System.out.println("Soma => + ");
		System.out.println("Subtração => - ");
		System.out.println("Multiplicação => * ");
		System.out.println("Divisão => / ");

		System.out.println("Digite um valor:");
		Double a = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Digite outro valor:");
		Double b = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Digite o caracter da operação que deseja:");
		Character c = entrada.next().charAt(0);
		
		switch (c) {
			case '+': 
				Double soma = a + b;
				System.out.println("Soma = " + soma);
				break;
			case '-':
				Double subtracao = a - b;
				System.out.println("Subtração = " + subtracao);
				break;
			case '*':
				Double multiplicacao = a * b;
				System.out.println("Multiplicação = " + multiplicacao);
				break;
			case '/': 
				if (b == 0) {
					System.err.println("Não existe divisão com zero");
				} else {
					Double divisao = a/b;
					System.out.println("Divisão = " + divisao);
				}
				break;
			default: 
				System.err.println("Operador não defenido");
		}
		
		entrada.close();
	}

}
