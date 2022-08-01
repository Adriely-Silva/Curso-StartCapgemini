package Questao11;

import java.util.Scanner;

/*11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;*/
public class Venda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("O preço de custo do produto:");
		Double precoProduto = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("O percentual de acréscimo que o preço do produto receberá:");
		Double percentual = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorVenda = precoProduto + (precoProduto * percentual);

		System.out.println("O valor da venda: R$" + valorVenda);

		entrada.close();
	}
}
