package Questao27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*27. A concession�ria de ve�culos �CARANGO� est� vendendo os seus ve�culos com desconto. Fa�a um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto dever� ser
calculado sobre o valor do ve�culo de acordo com o combust�vel (�lcool � 25%, gasolina � 21% ou diesel
� 14%). Com valor do ve�culo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes;*/
public class Carango {

	public static void main(String[] args) {
		List<Veiculo> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		Integer opcao = 0;
		
		while (opcao != 3) {
			System.out.println("Escolha uma das op��es: \n1- Adicionar cliente \n2-Consultar dados \n3-Sair");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					adicionar(lista, entrada);
					break;
				case 2:
					consultar(lista);
					break;
			}
		}
		
		entrada.close();
	}
	
	public static void adicionar(List<Veiculo> lista, Scanner entrada) {
		System.out.println("Informe o nome do cliente:");
		String nome = entrada.next();
		
		System.out.println("Informe o ve�culo:");
		String veiculo = entrada.next();
		
		System.out.println("A sua categoria 0-CARRO  1-MOTO  2-CAMINH�O:");
		Integer categoria = entrada.nextInt();
		
		System.out.println("O valor do ve�culo:");
		Double valor = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("O tipo de combust�vel 0-�LCOOL  1-GASOLINA  2-DIESEL:");
		Integer tipoCombustivel = entrada.nextInt();
		
		lista.add(new Veiculo(nome, veiculo, Categoria.buscarPorOrdinal(categoria), valor, Combustivel.buscarOrdinal(tipoCombustivel)));
	}
	
	public static void consultar(List<Veiculo> lista) {
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.toString());
		}
		System.out.println("Total de descontos: R$" + totalDesconto(lista));
		System.out.println("Total pago pelos clientes: R$" + totalPagoClientes(lista));
	}
	
	public static Double totalDesconto(List<Veiculo> lista) {
		Double somaTotal = 0.0;
		for (Veiculo veiculo : lista) {
			somaTotal += veiculo.getDesconto();
		}
		return somaTotal;	
	}
	
	public static Double totalPagoClientes(List<Veiculo> lista) {
		Double somaTotal = 0.0;
		for (Veiculo veiculo : lista) {
			somaTotal += veiculo.getValorFinal();
		}
		return somaTotal;	
	}
	
}
