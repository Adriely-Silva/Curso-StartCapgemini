package Questao07;

import java.util.Scanner;

/*7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;*/
public class Temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Temperatura em graus Celsius:");
		Double temperaturaC = Double.parseDouble(entrada.next().replaceAll(",", "."));

		Double temperaturaF = ((9 * temperaturaC) + 160) / 5;

		System.out.println("A temperatura em graus Fahrenhit: " + temperaturaF + "°F");
		
		entrada.close();
	}
}
