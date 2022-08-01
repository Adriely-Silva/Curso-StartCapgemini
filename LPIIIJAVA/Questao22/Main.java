package Questao22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*22. Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. Mostre como resultado
se houve lucro, preju�zo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
de venda de cada produto, a m�dia de pre�o de custo e do pre�o de venda;*/
public class Main {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 40; i++) {
			System.out.println("Informe a o produto:");
			String nome = entrada.next();
			
			System.out.println("Informe o pre�o de custo desse produto:");
			Double precoCusto = Double.parseDouble(entrada.next().replaceAll(",", "."));
			
			System.out.println("Informe o pre�o de venda desse produto:");
			Double precoVenda = Double.parseDouble(entrada.next().replaceAll(",", "."));
			
			lista.add(new Produto(nome, precoCusto, precoVenda));
		}		
		entrada.close();
		
		resultado(lista);
		System.out.println("M�dia de pre�o de custo: " + mediaCusto(lista));
		System.out.println("M�dia de pre�o de venda: " + mediaVenda(lista));
		
	}
	
	public static Double mediaCusto(List<Produto> lista) {
		Double soma = 0.0;
		for (Produto produto : lista) {
				soma = soma + produto.getPrecoCusto();
		}
		Double mediaCusto = soma / lista.size();
		return mediaCusto;	
	}
	
	public static Double mediaVenda (List<Produto> lista) {
		Double soma = 0.0;
		for (Produto produto : lista) {
			soma = soma + produto.getPrecoVenda();
		}
		Double mediaVenda = soma / lista.size();
		return mediaVenda;
	}
	
	public static void resultado(List<Produto> lista) {
		for (Produto produto : lista) {
			System.out.println(produto.toString());
		}
	}

}
