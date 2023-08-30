package BankAccount;

//Main Method, where all the banking magic happens

//import BankAccount.*;

public class Main {

	public static void main(String[] args) {
		
		//Creating Instances of Classes
		AccountName accountName = new AccountName("Craig Michaels");
		AccountNumber accountNumber = new AccountNumber("91846");
		AccountBalance accountBalance = new AccountBalance(100000);
		
		//Prints out the Name, Number, and Balance
		System.out.println("Account Name: " + accountName.getName());
		System.out.println("Account Number: " + accountNumber.getNumber());
		System.out.println("Account Balance: " + accountBalance.getBalance());
		
		//Deposits and Withdrawals
		accountBalance.deposit(50000);
		accountBalance.withdrawal(50);
	}

}
