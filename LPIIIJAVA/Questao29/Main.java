package Questao29;

import java.util.Scanner;

/*29. Fa�a um algoritmo que receba o n�mero do m�s e mostre o m�s correspondente. Valide m�s inv�lido; */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um n�mero de m�s:");
		Integer numero = entrada.nextInt();

		Mes mes = Mes.buscarPorNumero(numero);
		if (mes != null) {
			System.out.println(mes.getNome());
		} else {
			System.out.println("M�s n�o existe!");
		}

		entrada.close();
	}
}
