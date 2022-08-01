package Questao21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;*/
public class Main {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();
		
		Scanner entrada =  new Scanner(System.in);
		Integer opcao = 0;
		
		while (opcao != 3) {
			System.out.println("Escolha uma das opções:");
			System.out.println("1-Cadastrar pessoa");
			System.out.println("2-Consultar os dados");
			System.out.println("3-Sair");
			opcao = entrada.nextInt();
			
			switch (opcao) {
				case 1 : 
					cadastar(lista, entrada);
					break;
				case 2 : 
					consultar(lista);
					break;
			}
		}
		entrada.close();
	}
	
	public static void cadastar(List<Pessoa> lista, Scanner entrada) {
		System.out.println("Nome:");
		String nome = entrada.next();
		
		System.out.println("Data do nascimento:");
		String dataNascimento = entrada.next();
		
		System.out.println("Gênero  1-Masculino   2-Femenino");
		Integer genero = entrada.nextInt();
		
		System.out.println("Saúde  1-Saudável     2-Doente");
		Integer saude = entrada.nextInt();
		
		LocalDate data = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		lista.add(new Pessoa(nome, data, Genero.buscarPorNumero(genero), Saude.buscarPorNumero(saude)));
	}
	
	public static void consultar(List<Pessoa> lista) {
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
		}
	}

}
