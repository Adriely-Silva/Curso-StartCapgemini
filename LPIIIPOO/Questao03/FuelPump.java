package Questao03;

public class FuelPump {
	
	private FuelType fuelType;
	
	private Double valueForLiter;
	
	private Double fuelAmount;

	public FuelPump() {
		super();
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	public Double getValueForLiter() {
		return valueForLiter;
	}

	public void setValueForLiter(Double valueForLiter) {
		this.valueForLiter = valueForLiter;
	}

	public Double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(Double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	
	public Double getSupplyByValue(Double value) {
		return Math.floor(value / getValueForLiter());
	}
	
	public Double getSupplyByAmount(Double value) {
		return Math.ceil(value * getValueForLiter());	
	}
}
