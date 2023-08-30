package BankAccount;

//Account Number Class

public class AccountNumber {
	private String accountNumber;
	
	//Constructor
	public AccountNumber(String number) {
		this.accountNumber = number;
	}
	
	//Get Account Number
	public String getNumber() {
		return accountNumber;
	}
	
	//Set Account Number
	public void setNumber(String number) {
		this.accountNumber = number;
	}

}
