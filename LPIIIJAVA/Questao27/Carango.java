package Questao27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
– 14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
clientes;*/
public class Carango {

	public static void main(String[] args) {
		List<Veiculo> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		Integer opcao = 0;
		
		while (opcao != 3) {
			System.out.println("Escolha uma das opções: \n1- Adicionar cliente \n2-Consultar dados \n3-Sair");
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
		
		System.out.println("Informe o veículo:");
		String veiculo = entrada.next();
		
		System.out.println("A sua categoria 0-CARRO  1-MOTO  2-CAMINHÃO:");
		Integer categoria = entrada.nextInt();
		
		System.out.println("O valor do veículo:");
		Double valor = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		System.out.println("O tipo de combustível 0-ÁLCOOL  1-GASOLINA  2-DIESEL:");
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
