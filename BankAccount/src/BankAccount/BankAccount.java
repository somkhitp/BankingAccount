package BankAccount;

public class BankAccount {
	private AccountName accountName;
	private AccountNumber accountNumber;
	private AccountBalance balance;	
	
	public BankAccount(String name, String number, double balance) {
		this.accountName = new AccountName("Somkhit Phosavath");
		this.accountName.setName(name);
		this.accountNumber = new AccountNumber("12154");
		this.accountNumber.setNumber(number);
		this.balance = new AccountBalance(90000);
		this.balance.deposit(balance);
		this.balance.withdrawal(balance);
	}
	
	public String getAccountName() {
		return accountName.getName();
	}
	
	public String getNumber() {
		return accountNumber.getNumber();
	}
	
	public double getBalance() {
		return balance.getBalance();
	}
	
	public void deposit(double amount) {
		balance.deposit(amount);
	}
	
	public void withdrawal(double amount) {
		balance.withdrawal(amount);
	}
}
