package Questao04;

import java.util.Scanner;

/*4. Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um
pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares no pr�dio (desconsiderando o
t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m
disponibilizar os seguintes m�todos:

a. Inicializa: que deve receber como par�metros a capacidade do elevador e o total de andares no
pr�dio (os elevadores sempre come�am no t�rreo e vazio); (Construtor)
b. Entra: para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
c. Sai: para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
d. Sobe: para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
e. Desce: para descer um andar (n�o deve descer se j� estiver no t�rreo);*/
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
		System.out.println("Informe o total de andares do pr�dio:");
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
