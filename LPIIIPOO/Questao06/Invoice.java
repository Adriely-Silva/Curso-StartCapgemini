package Questao06;

public class Invoice {
	
	private Integer number;
	
	private String description;
	
	private Integer amount;
	
	private Double unitPrice;

	public Invoice(Integer number, String description, Integer amount, Double unitPrice) {
		super();
		this.number = number;
		this.description = description;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Double getInvoiceAmount() { 
		return getAmount() * getUnitPrice();	
	}

	@Override
	public String toString() {
		return "Número do item: " + getNumber() + "\nDescrição: " + getDescription() + "\nQuantidade: " + getAmount() + "\nPreço unitário: R$" + getUnitPrice() + "\nValor da fatura: R$" + getInvoiceAmount();
	}
}
