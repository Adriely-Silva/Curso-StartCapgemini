package Questao02;

public class CheckingAccount {
	
	private String ownerName;
	
	private Integer accountNumber;
	
	private Double balance;

	public CheckingAccount(String ownerName, Integer accountNumber, Double balance) {
		super();
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance != null ? balance : 0.0;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public void changeName(String ownerName) {
		setOwnerName(ownerName);
	}
	
	public void deposit(Double value) {		
		setBalance(getBalance() + value);
	}	
	
	public void withdraw(Double value) {
		setBalance(getBalance() - value);	
	}
}
