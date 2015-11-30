package lesson3demo.objectdemo2;

public class Main {

	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		cust.createCheckingAccount();
		cust.makeDeposit(5000);
		cust.withdraw(1250);
		String id = cust.getAccountId();
		double bal = cust.getAccountBalance();
		System.out.println(cust.getName() + "'s ID: " + id +
				"\n"+cust.getName() + "'s balance: " + bal);

	}

}
