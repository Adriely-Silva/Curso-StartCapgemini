package Questao04;

import java.util.Scanner;

/*4. Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas
por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas
efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.*/
public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do vendendor:");
		String nome = entrada.next();

		System.out.println("Informe o sal�rio fixo:");
		Double salarioFixo = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe o total de vendas no m�s em dinheiro:");
		Double totalVendas = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double salarioFinal = salarioFixo + (totalVendas * 0.15);

		System.out.println("Nome: " + nome);
		System.out.println("Sal�rio fixo: " + salarioFixo);
		System.out.println("Sal�rio final: " + salarioFinal);

		entrada.close();
	}
}
