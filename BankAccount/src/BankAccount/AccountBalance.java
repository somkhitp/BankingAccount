package BankAccount;

//Account Balance Class

public class AccountBalance {
	private double balance;
	
	//Constructor
	public AccountBalance(double balance) {
		this.balance = balance;
	}
	
	//Get Account Balance
	public double getBalance() {
		return balance;
	}
	
	// Deposit Method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit: $" + amount + " successful. New Balance: $" + balance);
		}
		else {
			System.out.println("Deposit is Invalid!!");
		}
	}
	
	//Withdrawal Method
	public void withdrawal(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal: $" + amount + " successful. New Balance: $" + balance);
		}
		else {
			System.out.println("Withdrawal Invalid!!");
		}
	}
}
