package Questao06;

import java.util.Scanner;

/*6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela
deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as
capacidades da classe Invoice.*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("O número do item:");
		Integer number = scanner.nextInt();
		
		System.out.println("Descrição:");
		String description = scanner.next();
		
		System.out.println("A quantidade comprada:");
		Integer amount = scanner.nextInt();
		
		System.out.println("O preço unitário:");
		Double unitPrice = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		Invoice invoice = new Invoice(number, description, amount, unitPrice);
		
		System.out.println("\nFATURA");
		System.out.println("--------------------------------");
		System.out.println(invoice.toString());
		System.out.println("--------------------------------");
		
		scanner.close();
	}

}
