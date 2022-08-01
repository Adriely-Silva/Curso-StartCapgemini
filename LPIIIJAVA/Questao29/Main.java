package Questao29;

import java.util.Scanner;

/*29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido; */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número de mês:");
		Integer numero = entrada.nextInt();

		Mes mes = Mes.buscarPorNumero(numero);
		if (mes != null) {
			System.out.println(mes.getNome());
		} else {
			System.out.println("Mês não existe!");
		}

		entrada.close();
	}
}
