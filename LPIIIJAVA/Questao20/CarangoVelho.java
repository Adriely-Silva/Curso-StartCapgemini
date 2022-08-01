package Questao20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;*/
public class CarangoVelho {

	public static void main(String[] args) {
		List<Carro> catalago = new ArrayList<>();

		Scanner entrada = new Scanner(System.in);
		Integer opcao = 0;

		while (opcao != 3) {
			System.out.println("Escolha umas das opcões: \n1-Adicionar \n2-Consultar valor dos carros \n3-Quantidade de carros \n4-Sair");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				adicionarCarro(catalago, entrada);
				break;
			case 2:
				calcularValorFinal(catalago);
				break;
			case 3:
				quantidadeCarro2000(catalago);
				quantidadeGeral(catalago);
				break;
			}
		}

		entrada.close();
	}

	public static  void adicionarCarro(List<Carro> catalago, Scanner entrada) {
		System.out.println("Informe o valor do carro:");
		Double valor = Double.parseDouble(entrada.next().replaceAll(",", "."));

		System.out.println("Informe o ano do carro:");
		Integer ano = entrada.nextInt();

		catalago.add(new Carro(valor, ano));
	}

	public static void calcularValorFinal(List<Carro> catalago) {
		Double valor, desconto, percentual;
		for (Carro carro : catalago) {
			if (carro.getAno() <= 2000) {
				percentual = 0.12;
			} else {
				percentual = 0.07;
			}

			desconto = carro.getValor() * percentual;
			valor = carro.getValor() - desconto;
			
			System.out.println("Desconto: " + desconto + " | " + "Valor final: " + valor);
		}
	}

	public static void quantidadeCarro2000(List<Carro> catalago) {
		Integer quantidadeAte2000 = 0;
		for (Carro carro : catalago) {
			if (carro.getAno() <= 2000) {
				quantidadeAte2000++;
			}
		}
		System.out.println("Quantidade de carros até 2000: " + quantidadeAte2000);
	}
	
	public static void quantidadeGeral(List<Carro> catalago) {
		System.out.println("Total de carros: " + catalago.size());
	}
}
