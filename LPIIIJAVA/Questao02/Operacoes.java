package Questao02;

import java.util.Scanner;

/*2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos; */
public class Operacoes {

	public static void main(String[] args) {
		Double soma, subtracao, multiplicacao, divisao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		Double a = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("Digite outro valor:");
		Double b = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		soma = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		
		entrada.close();
	}
}
