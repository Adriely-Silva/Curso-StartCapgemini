package Questao24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;*/
public class Main {

	public static void main(String[] args) {
		List<Numero> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		Integer resposta = 0;
		
		while (resposta != 2) {
			System.out.println("Adicionar número: \n1-Sim \n2-Não");
			resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println("Digite um número:");
				Integer num = entrada.nextInt();
				
				lista.add(new Numero(num));
			}
		}
		
		
		for (Numero numero : lista) {
			System.out.println(numero.toString());
		}
		
		entrada.close();
	}
}
