package Questao32;

import java.util.Scanner;

/*32. Escreva um algoritmo que leia tr�s valores inteiros e verifique se eles podem ser os lados de um tri�ngulo.
Se forem, informar qual o tipo de tri�ngulo que eles formam: equil�tero, is�scele ou escaleno.
Propriedade: o comprimento de cada lado de um tri�ngulo � menor do que a soma dos comprimentos dos
outros dois lados.
a. Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais;
b. Tri�ngulo Is�scele: aquele que tem os comprimentos de dois lados iguais.
c. Tri�ngulo equil�tero � tamb�m is�scele;
d. Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes; */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe tr�s valores inteiros para determinar se � um tri�ngulo e qual tipo do mesmo.");
		System.out.println("Primeiro valor inteiro:");
		Integer lado1 = entrada.nextInt();

		System.out.println("Segundo valor inteiro:");
		Integer lado2 = entrada.nextInt();

		System.out.println("Terceiro valor inteiro:");
		Integer lado3 = entrada.nextInt();
		
		if (ehTriangulo(lado1, lado2, lado3)) {
			System.out.println("� tri�ngulo!");
			if (ehEquilatero(lado1, lado2, lado3)) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (ehIsoscele(lado1, lado2, lado3)) {
				System.out.println("Tri�ngulo Is�scele");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("N�o � tri�ngulo!");
		}

		entrada.close();
	}

	private static boolean ehIsoscele(Integer lado1, Integer lado2, Integer lado3) {
		return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
	}

	private static boolean ehEquilatero(Integer lado1, Integer lado2, Integer lado3) {
		return (lado1 == lado2) && (lado2 == lado3);
	}

	private static boolean ehTriangulo(Integer lado1, Integer lado2, Integer lado3) {
		return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
	}
}
