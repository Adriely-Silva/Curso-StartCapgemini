package Questao32;

import java.util.Scanner;

/*32. Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo.
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno.
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos
outros dois lados.
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
c. Triângulo equilátero é também isóscele;
d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes; */
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe três valores inteiros para determinar se é um triângulo e qual tipo do mesmo.");
		System.out.println("Primeiro valor inteiro:");
		Integer lado1 = entrada.nextInt();

		System.out.println("Segundo valor inteiro:");
		Integer lado2 = entrada.nextInt();

		System.out.println("Terceiro valor inteiro:");
		Integer lado3 = entrada.nextInt();
		
		if (ehTriangulo(lado1, lado2, lado3)) {
			System.out.println("É triângulo!");
			if (ehEquilatero(lado1, lado2, lado3)) {
				System.out.println("Triângulo Equilátero");
			} else if (ehIsoscele(lado1, lado2, lado3)) {
				System.out.println("Triângulo Isóscele");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é triângulo!");
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
