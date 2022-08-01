package Questao03;

import java.util.Scanner;

/*3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classes deve conter os seguintes métodos.

a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.

Crie uma classe que contenha um método main para testar sua classe BombaCombustível */
public class Main {

	public static void main(String[] args) {
		FuelPump fuelPump = new FuelPump();
		
		Scanner scanner = new Scanner(System.in);
		
		register(fuelPump, scanner);
		Integer choice = 0;
		
		while (choice != 6) {
			window(scanner);
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				supplyByValue(fuelPump, scanner);
				break;
			case 2 :
				supplyByAmount(fuelPump, scanner);
				break;
			case 3 :
				changeValueForLiter(fuelPump, scanner);
				break;
			case 4 :
				changeFuelType(fuelPump, scanner);
				break;
			case 5 :
				changeAmountFuel(fuelPump, scanner);
				break;
			}
		}
		
		scanner.close();
	}
	
	public static void window(Scanner scanner) {
		System.out.println("1 - Abastecer por valor");
		System.out.println("2 - Abastecer por quantidade em litro");
		System.out.println("3 - Alterar o valor por litro");
		System.out.println("4 - Alterar o tipo de combustível");
		System.out.println("5 - Alterar a quantidade de combustível");
		System.out.println("6 - Sair");	
	}
		
	public static void register(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe o tipo de combustível");
		System.out.println("1- GASOLINA");
		System.out.println("2- ETANOL");
		System.out.println("3- DIESEL");
		Integer fuelType = scanner.nextInt();
		
		System.out.println("Informe o valor por litro:");
		Double valueForLiter = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("Informe a quatidade de combustível da bomba:");
		Double fuelAmount = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		fuelPump.setFuelType(FuelType.searchName(fuelType)); 
		fuelPump.setValueForLiter(valueForLiter);
		fuelPump.setFuelAmount(fuelAmount);
	}
	
	public static void supplyByValue(FuelPump fuelPump, Scanner scanner) {	
		System.out.println("Iforme o valor:");
		Double value = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("Quantidade de litros abastecidos: " + fuelPump.getSupplyByValue(value) + "L");
	}
	
	public static void supplyByAmount(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe a quatidade de combustível:");
		Double value = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("O valor a ser pago: R$" + fuelPump.getSupplyByAmount(value));
	}
	
	public static void changeValueForLiter(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe o valor por litro:");
		Double value = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		fuelPump.setValueForLiter(value);
		System.out.println("O valor passa a ser: R$" + fuelPump.getValueForLiter());		
	}
	
	public static void changeFuelType(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe qual tipo de combustível");
		System.out.println("1- GASOLINA");
		System.out.println("2- ETANOL");
		System.out.println("3- DIESEL");
		Integer fuelType = scanner.nextInt();
		
		fuelPump.setFuelType(FuelType.searchName(fuelType));
		System.out.println("O combustível vai passar ser: " + fuelPump.getFuelType());
	}
	
	public static void changeAmountFuel(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe a quatidade de combustível da bomba em litros:");
		Double fuelAmount = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		fuelPump.setFuelAmount(fuelAmount);
		System.out.println("A quantidade de litro passa a ser: " + fuelPump.getFuelAmount());
	}
}
