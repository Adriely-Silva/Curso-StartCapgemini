package Questao03;

import java.util.Scanner;

/*3. Escreva um algoritmo para determinar o consumo m�dio de um autom�vel sendo fornecida a dist�ncia
total percorrida pelo autom�vel e o total de combust�vel gasto; */
public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a dist�ncia total:");
		Double distanciaTotal = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("Digite o total de combust�vel gasto:");
		Double totalCombustivel = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		Double consumoMedio = distanciaTotal / totalCombustivel;
		
		System.out.println("O consumo m�dio do autom�vel: " + consumoMedio);
		
		entrada.close();
	}
}
