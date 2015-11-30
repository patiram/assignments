package lesson3demo.objectdemo2;

public class Account {
	private String id = null;
	private double balance = 0.0;
	
	public Account() {
		id = generateId();
	}
	
	private String generateId() {
		return "" + RandomNumbers.getRandomInt(1000,9999);
	}
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public String getId() {
		return id;
	}
	
}
