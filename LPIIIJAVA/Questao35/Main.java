package Questao35;

import java.util.Scanner;

/*35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de
luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29. */
public class Main {

	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("O nome do cliente:");
		String nome = entrada.next();
		
		System.out.println("Tipo de cliente  1- Residência   2- Comércio  3- Indústria :");
		Integer tipo = entrada.nextInt();
		
		System.out.println("A quantidade engeria(KW/h) que o cliente gastou:");
		Double energia = Double.parseDouble(entrada.next().replaceAll(",", "."));
		
		Cliente cliente = new Cliente(nome, TipoCliente.buscarPorOrdinal(tipo), energia);
		System.out.println(cliente.toString());
		
		entrada.close();
	}
}
