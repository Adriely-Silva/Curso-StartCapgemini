package Questao28;

import java.util.Scanner;

/*28. Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo
com os seguintes critérios:
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos;
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa
vai aumentar sua folha de pagamento;*/
public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Scanner entrada = new Scanner(System.in);

		Integer opcao = 0;

		while (opcao != 3) {
			System.out.println("Escolha uma das opções:");
			System.out.println("1-Cadastrar");
			System.out.println("2-Consultar lista de funcionários e aumento na folha de pagamento");
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
		System.out.println("O salário mínimo:");
		Double salarioMinimo = Double.parseDouble(entrada.next().replaceAll(",", "."));

		empresa.setSalarioMinimo(salarioMinimo);
		for (int i = 0; i < 4; i++) {
			System.out.println("Nome do funcionário:");
			String nomeFuncionario = entrada.next();

			System.out.println("Sálario:");
			Double salarioFuncionario = Double.parseDouble(entrada.next().replaceAll(",", "."));

			empresa.cadastrarFuncionario(new Funcionario(nomeFuncionario, salarioFuncionario));
		}
	}
	
	public static void consultarEmpresa(Empresa empresa) {
		empresa.reajustarSalarios();
		System.out.println(empresa);
	}
}