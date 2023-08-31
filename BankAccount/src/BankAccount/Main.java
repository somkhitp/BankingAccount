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
		System.out.println("************************************************");
		System.out.println("***********| Account Holder |*******************");
		System.out.println("Account Name: " + accountName.getName());
		System.out.println("Account Number: " + accountNumber.getNumber());
		System.out.println("Account Balance: " + accountBalance.getBalance());
		
		//Deposits and Withdrawals
		accountBalance.deposit(20.34);
		accountBalance.withdrawal(50);
		
		
		// A Second Account
		AccountName accountNameTwo = new AccountName("Justin McFarley");
		AccountNumber accountNumberTwo = new AccountNumber("89234");
		AccountBalance accountBalanceTwo = new AccountBalance(540.54);
		
		//Prints out the Name, Number, and Balance
		System.out.println("************************************************");
		System.out.println("***********| Account Holder |*******************");
		System.out.println("Account Name: " + accountNameTwo.getName());
		System.out.println("Account Number: " + accountNumberTwo.getNumber());
		System.out.println("Account Balance: " + accountBalanceTwo.getBalance());
		
		//Deposits and Withdrawals
		accountBalanceTwo.deposit(100.34);
		accountBalanceTwo.withdrawal(10);
		
		
		// A Third Account
		AccountName accountNameThird = new AccountName("Russel Wong");
		AccountNumber accountNumberThird = new AccountNumber("12714");
		AccountBalance accountBalanceThird = new AccountBalance(3600.23);

		// Prints out the Name, Number, and Balance
		System.out.println("************************************************");
		System.out.println("***********| Account Holder |*******************");
		System.out.println("Account Name: " + accountNameThird.getName());
		System.out.println("Account Number: " + accountNumberThird.getNumber());
		System.out.println("Account Balance: " + accountBalanceThird.getBalance());

		// Deposits and Withdrawals
		accountBalanceThird.deposit(-123);
		accountBalanceThird.withdrawal(-12.34);
	}

}
