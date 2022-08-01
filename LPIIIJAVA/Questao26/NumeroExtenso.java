package Questao26;

import java.util.Scanner;

/*26. Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido; */
public class NumeroExtenso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		Integer num = entrada.nextInt();
		
		switch (num) {
			case 1: {
				System.out.println("Um");
				break;
			}
			case 2: {
				System.out.println("Dois");
				break;
			}
			case 3: {
				System.out.println("Três");
				break;
			}
			case 4: {
				System.out.println("Quatro");
				break;
			}
			case 5: {
				System.out.println("Cinco");
				break;
			}
			default:
				System.err.println("Número inválido");
		}
		entrada.close();
	}
}
