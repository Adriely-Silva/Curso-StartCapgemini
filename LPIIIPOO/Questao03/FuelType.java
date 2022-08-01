package Questao03;

public enum FuelType {
	GASOLINE(1, "GASOLINA"), ETHANOL(2, "ETANOL"), DIESEL(3, "DIESEL");
	
	private Integer number;
	
	private String name;

	private FuelType(Integer number, String name) {
		this.number = number;
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	public static FuelType searchName(Integer number) {
		for (FuelType type : values()) {
			if (type.getNumber().equals(number)) {
				return type;
			}
		}
		return null;
	}
}
