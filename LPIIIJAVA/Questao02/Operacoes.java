package Questao02;

import java.util.Scanner;

/*2. Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, subtra��o, multiplica��o e a divis�o
dos dois n�meros lidos; */
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
		System.out.println("Subtra��o: " + subtracao);
		System.out.println("Multiplica��o: " + multiplicacao);
		System.out.println("Divis�o: " + divisao);
		
		entrada.close();
	}
}
