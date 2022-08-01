package Questao04;

import java.util.Scanner;

/*4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também
disponibilizar os seguintes métodos:

a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio); (Construtor)
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);*/
public class Main {

	public static void main(String[] args) {
		Elevator elevator = new Elevator(0,0);
		
		Scanner scanner = new Scanner(System.in);
		
		register(elevator, scanner);
		
		Integer choice = 0;
		while (choice != 5) {
			menu(scanner);	
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				elevator.enterAnElevator();
				break;
			case 2:
				up(elevator, scanner);
				break;
			case 3:
				down(elevator, scanner);
				break;
			case 4:
				elevator.getOffTheElevator();
				break;
			}
		}
		
		scanner.close();

	}
	
	public static void register(Elevator elevator, Scanner scanner) {
		System.out.println("Informe o total de andares do prédio:");
		Integer totalOfFloors = scanner.nextInt();
		
		System.out.println("Informe a capacidade do elevador:");
		Integer capacityOfTheElevator = scanner.nextInt();
		
		elevator.setTotalOfFloors(totalOfFloors);
		elevator.setCapacityOfTheElevator(capacityOfTheElevator);
	}
	
	public static void menu(Scanner scanner) {
		System.out.println("1 - Entrar no elevador");
		System.out.println("2 - Subir");
		System.out.println("3 - Descer");
		System.out.println("4 - Sair do elevador");
	}

	
	public static void up(Elevator elevator, Scanner scanner) {
		System.out.println("Informe o andar que estar:");
		Integer currentFloor = scanner.nextInt();
		
		System.out.println("Informe o andar que deseja ir:");
		Integer floor = scanner.nextInt();
		
		elevator.setCurrentFloor(currentFloor);
		elevator.goUp(floor);
	}
	
	public static void down(Elevator elevator, Scanner scanner) {
		System.out.println("Informe o andar que estar:");
		Integer currentFloor = scanner.nextInt();
		
		System.out.println("Informe o andar que deseja ir:");
		Integer floor = scanner.nextInt();
		
		elevator.setCurrentFloor(currentFloor);
		elevator.goDown(floor);
	}
	
	
}
