package Questao03;

import java.util.Scanner;

/*3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combust�vel, valor por litro e quantidade de combust�vel. Al�m desses
atributos a classes deve conter os seguintes m�todos.

a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no ve�culo
b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combust�vel.
d. alterarCombustivel; //altera o tipo do combust�vel.
e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.

Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel */
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
		System.out.println("4 - Alterar o tipo de combust�vel");
		System.out.println("5 - Alterar a quantidade de combust�vel");
		System.out.println("6 - Sair");	
	}
		
	public static void register(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe o tipo de combust�vel");
		System.out.println("1- GASOLINA");
		System.out.println("2- ETANOL");
		System.out.println("3- DIESEL");
		Integer fuelType = scanner.nextInt();
		
		System.out.println("Informe o valor por litro:");
		Double valueForLiter = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("Informe a quatidade de combust�vel da bomba:");
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
		System.out.println("Informe a quatidade de combust�vel:");
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
		System.out.println("Informe qual tipo de combust�vel");
		System.out.println("1- GASOLINA");
		System.out.println("2- ETANOL");
		System.out.println("3- DIESEL");
		Integer fuelType = scanner.nextInt();
		
		fuelPump.setFuelType(FuelType.searchName(fuelType));
		System.out.println("O combust�vel vai passar ser: " + fuelPump.getFuelType());
	}
	
	public static void changeAmountFuel(FuelPump fuelPump, Scanner scanner) {
		System.out.println("Informe a quatidade de combust�vel da bomba em litros:");
		Double fuelAmount = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		fuelPump.setFuelAmount(fuelAmount);
		System.out.println("A quantidade de litro passa a ser: " + fuelPump.getFuelAmount());
	}
}
