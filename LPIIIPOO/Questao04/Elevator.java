package Questao04;

public class Elevator {
	
	private Integer currentFloor;
	
	private Integer totalOfFloors;
	
	private Integer capacityOfTheElevator;
	
	private Integer numberOfPeoplePresent;
	
	public Elevator(Integer currentFloor, Integer numberOfPeoplePresent) {
		super();
		this.currentFloor = currentFloor;
		this.numberOfPeoplePresent = numberOfPeoplePresent;
	}

	public Elevator() {
		
	}

	public Integer getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(Integer currentFloor) {
		this.currentFloor = currentFloor;
	}

	public Integer getTotalOfFloors() {
		return totalOfFloors;
	}

	public void setTotalOfFloors(Integer totalOfFloors) {
		this.totalOfFloors = totalOfFloors;
	}

	public Integer getCapacityOfTheElevator() {
		return capacityOfTheElevator;
	}

	public void setCapacityOfTheElevator(Integer capacityOfTheElevator) {
		this.capacityOfTheElevator = capacityOfTheElevator;
	}

	public Integer getNumberOfPeoplePresent() {
		return numberOfPeoplePresent;
	}

	public void setNumberOfPeoplePresent(Integer numberOfPeoplePresent) {
		this.numberOfPeoplePresent = numberOfPeoplePresent;
	} 
	
	//Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
	public void enterAnElevator() {
		Integer numberOfPeople = getNumberOfPeoplePresent();
		if (numberOfPeople <= getCapacityOfTheElevator()) {
			System.out.println("Sucesso");
			numberOfPeople++;			
		} else {
			System.out.println("Elevador cheio");
		}	
	}
	
	//Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
	public void getOffTheElevator() {
		Integer numberOfPeople = getNumberOfPeoplePresent();
		System.out.println("Sucesso");
		numberOfPeople--;			
	}
	
	//Sobe: para subir um andar (não deve subir se já estiver no último andar);
	public void goUp(Integer floor) {
		Integer currentFloor = getCurrentFloor();
		if (currentFloor == getTotalOfFloors()) {
			System.out.println("Você está no último andar");
		}else {
			Integer count = currentFloor - floor;
			currentFloor = currentFloor + count;
			System.out.println("Chegou no andar");
		}
	}
	
	//Desce: para descer um andar (não deve descer se já estiver no térreo);
	public void goDown(Integer floor){
		Integer currentFloor = getCurrentFloor();
		if (currentFloor == 0) {
			System.out.println("Você está no térreo");
		}else {
			Integer count = currentFloor - floor;
			currentFloor = currentFloor - count;
			System.out.println("Chegou no andar");
		}
	}
	
	
}
