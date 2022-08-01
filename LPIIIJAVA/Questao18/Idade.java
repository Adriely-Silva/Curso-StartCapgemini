package Questao18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade; */
public class Idade {

	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 75; i++) {
			System.out.println("Informe o nome:");
			String nome = entrada.next();
			
			System.out.println("Informe a idade:");
			Integer idade = entrada.nextInt();
			
			lista.add(new Pessoa(nome, idade));
		}
		
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
		}
		
		entrada.close();
	}
}
