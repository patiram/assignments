/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.1 Account for Date Assignment
 *
 */

package lesson3.account;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	//private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		//employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		//updates the balance field
		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		//updates the balance field and returns true, unless
		//withdrawal amount is too large; in that case,
		//it does not modify the balance field, and returns false
		if(amount>balance){
			return false;
		}
		balance -= amount;
		return true;
	}
	public AccountType getAcctType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}

}
