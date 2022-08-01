package Questao19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*19. Escreva um algoritmo que leia o nome e o sexo de 10 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres; */
public class Main {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		Integer opcao = 0;
		
		while (opcao != 4) {
			System.out.println("Escolha umas das opcões: \n1-Cadastrar \n2-Consultar dado \n3-Total de homem e mulheres \n4-Sair");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					cadastrar(lista, entrada);
					break;
				case 2:
					consultar(lista);
					break;
				case 3:
					numeroHomens(lista);
					numeroMulheres(lista);
					break;
			}
		}
		entrada.close();
	}
	
	public static void cadastrar(List<Pessoa> lista, Scanner entrada) {
		System.out.println("Informe o nome:");
		String nome = entrada.next();
		
		System.out.println("Informe o gênero 0 - MASCULINO ou 1 - FEMENINO:");
		Integer genero = entrada.nextInt();
		
		lista.add(new Pessoa(nome, Genero.buscaPorOrdinal(genero)));
	}
	
	public static void consultar(List<Pessoa> lista) {
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
		}
	}
	
	public static Integer numeroHomens(List<Pessoa> lista) {
		Integer quantidadeHomem = 0;
		for (Pessoa pessoa : lista) {
			if (Genero.MASCULINO.equals(pessoa.getGenero())) {
				quantidadeHomem++;
			}
		}
		System.out.println("Total de homens: " + quantidadeHomem);
		return quantidadeHomem;
	}
	
	public static Integer numeroMulheres(List<Pessoa> lista) {
		Integer quantidadeMulher = 0;
		for (Pessoa pessoa : lista) {
			if (Genero.FEMENINO.equals(pessoa.getGenero())) {
				quantidadeMulher++;
			}
		}
		System.out.println("Total de mulheres: " + quantidadeMulher);
		return quantidadeMulher;
	}

}