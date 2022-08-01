package Questao30;

import java.util.Arrays;
import java.util.Scanner;

/*30. Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente; */
public class OrdemCrescente {

	public static void main(String[] args) {
		int[] vetor = new int[3];
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite três valores");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor:");
			vetor[i] = entrada.nextInt();
		}

		//Ordem crescente
		Arrays.sort(vetor);
		
		//Lista os valore na ordem crecente
		for (int j = 0; j < vetor.length; j++) {
			System.out.println( vetor[j] + " ");
		}
		entrada.close();
	}
}
