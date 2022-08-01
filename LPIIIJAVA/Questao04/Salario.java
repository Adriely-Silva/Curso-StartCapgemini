package Questao04;

import java.util.Scanner;

/*4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês.*/
public class Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do vendendor:");
		String nome = entrada.next();

		System.out.println("Informe o salário fixo:");
		Double salarioFixo = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe o total de vendas no mês em dinheiro:");
		Double totalVendas = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double salarioFinal = salarioFixo + (totalVendas * 0.15);

		System.out.println("Nome: " + nome);
		System.out.println("Salário fixo: " + salarioFixo);
		System.out.println("Salário final: " + salarioFinal);

		entrada.close();
	}
}
