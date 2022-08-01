package Questao28;

import java.util.Scanner;

/*28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcion�rios de acordo
com os seguintes crit�rios:
a. 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
b. 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos;
c. 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos;
d. 10% para os demais funcion�rios.

Leia o nome do funcion�rio, seu sal�rio e o valor do sal�rio m�nimo. Calcule o seu novo sal�rio
reajustado. Escrever o nome do funcion�rio, o reajuste e seu novo sal�rio. Calcule quanto � empresa
vai aumentar sua folha de pagamento;*/
public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Scanner entrada = new Scanner(System.in);

		Integer opcao = 0;

		while (opcao != 3) {
			System.out.println("Escolha uma das op��es:");
			System.out.println("1-Cadastrar");
			System.out.println("2-Consultar lista de funcion�rios e aumento na folha de pagamento");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1:
					cadastrarFuncionario(empresa, entrada);			
					break;
				case 2:
					consultarEmpresa(empresa);
					break;
			}
		}	
		entrada.close();
	}
	
	public static void cadastrarFuncionario(Empresa empresa, Scanner entrada) {
		System.out.println("O sal�rio m�nimo:");
		Double salarioMinimo = Double.parseDouble(entrada.next().replaceAll(",", "."));

		empresa.setSalarioMinimo(salarioMinimo);
		for (int i = 0; i < 4; i++) {
			System.out.println("Nome do funcion�rio:");
			String nomeFuncionario = entrada.next();

			System.out.println("S�lario:");
			Double salarioFuncionario = Double.parseDouble(entrada.next().replaceAll(",", "."));

			empresa.cadastrarFuncionario(new Funcionario(nomeFuncionario, salarioFuncionario));
		}
	}
	
	public static void consultarEmpresa(Empresa empresa) {
		empresa.reajustarSalarios();
		System.out.println(empresa);
	}
}