package BankAccount;

//BankAccount Constructor

public class BankAccount {
	
	//Variables
	private AccountName accountName;
	private AccountNumber accountNumber;
	private AccountBalance balance;	
	
	
	//Assign Variables
	public BankAccount(String name, String number, double balance) {
		this.accountName = new AccountName(name);
		this.accountName.setName(name);
		this.accountNumber = new AccountNumber(number);
		this.accountNumber.setNumber(number);
		this.balance = new AccountBalance(balance);
		this.balance.deposit(balance);
		this.balance.withdrawal(balance);
	}
	
	//Get Account Name
	public String getAccountName() {
		return accountName.getName();
	}
	
	//Get AccountNumber
	public String getNumber() {
		return accountNumber.getNumber();
	}
	
	//Get Account Balance
	public double getBalance() {
		return balance.getBalance();
	}
	
	//Deposit
	public void deposit(double amount) {
		balance.deposit(amount);
	}
	
	//Withdrawal
	public void withdrawal(double amount) {
		balance.withdrawal(amount);
	}
}
