package Questao03;

import java.util.Scanner;

/*3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto; */
public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a distância total:");
		Double distanciaTotal = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("Digite o total de combustível gasto:");
		Double totalCombustivel = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		Double consumoMedio = distanciaTotal / totalCombustivel;
		
		System.out.println("O consumo médio do automóvel: " + consumoMedio);
		
		entrada.close();
	}
}
