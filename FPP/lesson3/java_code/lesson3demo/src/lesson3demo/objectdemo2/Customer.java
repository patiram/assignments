package lesson3demo.objectdemo2;

public class Customer {
	String name;
	Account checkingAccount;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void createCheckingAccount() {
		checkingAccount = new Account();
	}

	public double getAccountBalance() {
		return checkingAccount.getBalance();
	}
	
	public void makeDeposit(double amount) {
		checkingAccount.updateBalance(amount);
	}
	public void withdraw(double amount) {
		checkingAccount.updateBalance(-amount);
	}
	
	public String getAccountId() {
		return checkingAccount.getId();
	}
	public String getName() {
		return name;
	}
}
