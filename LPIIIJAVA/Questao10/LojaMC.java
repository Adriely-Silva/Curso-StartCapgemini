package Questao10;

import java.util.Scanner;

/*10. A Loja Mam�o com A��car est� vendendo seus produtos em 5(cinco) presta��es sem juros. Fa�a um
algoritmo que receba um valor de uma compra e mostre o valor das presta��es;*/
public class LojaMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("O valor total da compra:");
		Double valorCompra = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorPrestacao = valorCompra/ 5;

		System.out.println("O valor das presta��es: R$" + valorPrestacao);

		entrada.close();
	}
}
