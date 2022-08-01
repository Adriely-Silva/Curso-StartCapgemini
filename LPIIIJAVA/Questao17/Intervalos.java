package Questao17;

import java.util.Scanner;

/*. Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);*/
public class Intervalos {

	public static void main(String[] args) {
		Integer valor;
		Integer quant = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 80 ; i++) {
			System.out.println("Digite um valor:");
			valor = entrada.nextInt();
			if (valor > 9 && valor < 151) {
				quant++;
			}
		}
		
		System.out.println("Quantidade de valores no intervalo: " + quant);
		
		entrada.close();
	}

}
