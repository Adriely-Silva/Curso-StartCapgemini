package Questao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/
public class Main {

	public static void main(String[] args) {
		List<CheckingAccount> list = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);

		Integer choice = 0;
		
		while (choice != 3) {
			showMenu();
			choice = scanner.nextInt();
			switch (choice) {
				case 1 :
					register(list, scanner);
					break;
				case 2 :
					consult(list, scanner);
					break;
			}
		}	
		scanner.close();
	}
	
	public static void showMenu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1- Registrar conta");
		System.out.println("2- Consultar conta");
		System.out.println("3- Sair");
	}
	
	public static void showSubMenu(CheckingAccount account, Scanner scanner) {
		Integer task = 0;
		
		while (task != 4) {
			System.out.println("Qual tarefa deseja fazer:");
			System.out.println("1- Alterar nome");
			System.out.println("2- Depositar");
			System.out.println("3- Sacar");
			System.out.println("4- Sair");

			task = scanner.nextInt();
			switch (task) {
				case 1 :
					changeName(account, scanner);
					break;
				case 2 :
					deposit(account, scanner);
					break;
				case 3 :
					withdraw(account, scanner);
					break;
			}
		}				
	}
	
	public static void register(List<CheckingAccount> list, Scanner scanner) {
		System.out.println("Informe o nome:");
		String name = scanner.next();
		
		System.out.println("Informar o número da conta:");
		Integer accountNumber = scanner.nextInt();
		
		System.out.println("Informar o saldo:");
		Double balance = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		list.add(new CheckingAccount(name, accountNumber, balance));
	}
	
	public static void consult(List<CheckingAccount> list, Scanner scanner) {
		System.out.println("Informe o número da conta:");
		Integer answer = scanner.nextInt();
		
		Boolean found = false;
		CheckingAccount accountCurrent = null;

		for (CheckingAccount account : list) {
			if (answer.equals(account.getAccountNumber())) {
				found = true;
				accountCurrent = account;
			}
		}
		
		if (found) {
			showSubMenu(accountCurrent, scanner);
		} else {
			System.out.println("Cliente não existe");
		}
	}
	
	public static void changeName(CheckingAccount account, Scanner scanner) {		
		System.out.println("Informe o novo nome:");
		String nameNew = scanner.next();
		
		account.setOwnerName(nameNew);
		
		System.out.println(account.getOwnerName());
	}
	
	public static void deposit(CheckingAccount account, Scanner scanner) {
		System.out.println("Informe o valor do depósito:");
		Double valueDeposit = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		account.deposit(valueDeposit);
		System.out.println("O saldo depois do depósito: R$" + account.getBalance());
	}
	
	public static void withdraw(CheckingAccount account, Scanner scanner) {
		System.out.println("Informe o valor do saque:");
		Double valueWithdraw = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		account.withdraw(valueWithdraw);
		System.out.println("O saldo depois do saque: R$" + account.getBalance());
	}
}
