package Questao15;

import java.util.Scanner;

/*15. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200;*/
public class Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		Integer num = entrada.nextInt();
		
		if ((num > 100) && (num < 200)) {
			System.out.println("O n�mero est� no intervalo entre 100 e 200");
		} else {
			System.out.println("O n�mero n�o est� no intervalo entre 100 e 200");
		}
		
		entrada.close();
	}
}
