package Questao12;

import java.text.DecimalFormat;
import java.util.Scanner;

/*12. O custo de um carro novo ao consumidor � a soma do custo de f�brica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos s�o aplicados sobre o custo de f�brica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de f�brica de um carro e informe o custo ao consumidor do
mesmo; */
public class Carro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o custo de f�brica do carro:");
		Double custoFabrica = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		Double custoConsumidor = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		
		DecimalFormat df = new DecimalFormat("0.00"); 
		
		System.out.println("O custo final do carro �: " + df.format(custoConsumidor));
		
		entrada.close();
	}
}
