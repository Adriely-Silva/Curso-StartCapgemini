package Questao11;

import java.util.Scanner;

/*11. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda. Sabe-se que o
pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;*/
public class Venda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("O pre�o de custo do produto:");
		Double precoProduto = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("O percentual de acr�scimo que o pre�o do produto receber�:");
		Double percentual = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorVenda = precoProduto + (precoProduto * percentual);

		System.out.println("O valor da venda: R$" + valorVenda);

		entrada.close();
	}
}
