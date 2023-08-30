package BankAccount;

//Account Name Class

public class AccountName {
	
	private String accountName;
	
	//Constructor For AccountName
	public AccountName(String name) {
		this.accountName = name;
	}

	//Get Account Name
	public String getName() {
		return accountName;
	}
	
	//Set AccountName
	public void setName(String name) {
		this.accountName = name;
	}

}
