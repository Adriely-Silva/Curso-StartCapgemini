package Questao06;

import java.util.Scanner;

/*6. Leia dois valores para as vari�veis A e B, e efetuar as trocas dos valores de forma que a vari�vel A passe a
possuir o valor da vari�vel B e a vari�vel B passe a possuir o valor da vari�vel A. Apresentar os valores
trocados;*/
public class TrocaValores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor:");
		Integer a = entrada.nextInt();
		
		System.out.println("Informe outro valor:");
		Integer b = entrada.nextInt();
		
		Integer aux;
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("O valor de A: " + a);
		System.out.println("O valor de B: " + b);
		
		entrada.close();
	}
}
