package Questao09;

import java.util.Scanner;

/*9. Fa�a um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento ap�s um
m�s. Considere fixo o juro da poupan�a em 0,07% a.m;*/
public class Poupanca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor que foi depositado:");
		Double valorDepositado = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorMontante = valorDepositado + (valorDepositado * 0.0007);

		System.out.println("O valor com redimento ap�s um m�s: " + valorMontante);

		entrada.close();
	}
}
