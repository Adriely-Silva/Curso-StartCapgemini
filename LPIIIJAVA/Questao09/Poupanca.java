package Questao09;

import java.util.Scanner;

/*9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês. Considere fixo o juro da poupança em 0,07% a.m;*/
public class Poupanca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor que foi depositado:");
		Double valorDepositado = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double valorMontante = valorDepositado + (valorDepositado * 0.0007);

		System.out.println("O valor com redimento após um mês: " + valorMontante);

		entrada.close();
	}
}
