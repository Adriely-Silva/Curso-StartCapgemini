package Questao10;

import java.util.Scanner;

/*10. A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;*/
public class LojaMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("O valor total da compra:");
		Double valorCompra = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorPrestacao = valorCompra/ 5;

		System.out.println("O valor das prestações: R$" + valorPrestacao);

		entrada.close();
	}
}
