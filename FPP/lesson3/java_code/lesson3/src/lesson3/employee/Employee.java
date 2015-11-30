/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.2 Employee for Date Assignment
 *
 */

package lesson3.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	AccountType acctType;
	//private Object savaingsAcct;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = 
		new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}
	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIRMENT, startAmount);
		
	}

	public double deposit(AccountType acctType, double amt){
		double balance;
		if(acctType==AccountType.CHECKING){
			balance = checkingAcct.makeDeposit(amt);
		}
		else if(acctType==AccountType.SAVINGS) {
			balance = savingsAcct.makeDeposit(amt);
		}
		else {
			balance = retirementAcct.makeDeposit(amt);
		}
		return balance;
	}
	public double withdraw(AccountType acctType, double amt){
		double balance = 0;
		if((acctType==AccountType.CHECKING) && checkingAcct.makeWithdrawal(amt)){
			balance = checkingAcct.getBalance() - amt;
		}
		else if((acctType==AccountType.SAVINGS) && savingsAcct.makeWithdrawal(amt)) {
			balance = savingsAcct.getBalance() - amt;
		}
		else if((acctType==AccountType.RETIRMENT) && retirementAcct.makeWithdrawal(amt)) {
			balance = retirementAcct.getBalance() - amt;
		}
		return balance;
	}

	public List<String> getFormattedAcctInfo() {
		// implement
		List<String> acc = new ArrayList<String>();
		acc.add("name= "+this.name+" hireday= "+this.hireDate+" account type= "+this.checkingAcct.getAcctType()+" balance= "+this.checkingAcct.getBalance());
		acc.add("name= "+this.name+" hireday= "+this.hireDate+" account type= "+this.savingsAcct.getAcctType()+" balance= "+this.savingsAcct.getBalance());
		acc.add("name= "+this.name+" hireday= "+this.hireDate+" account type= "+this.retirementAcct.getAcctType()+" balance= "+this.retirementAcct.getBalance());
		
		System.out.println("ACCOUNT INFO FOR "+this.name);
		System.out.println(this.savingsAcct.toString());
		System.out.println(this.checkingAcct.toString());
		System.out.println(this.retirementAcct.toString());
		return acc;
		
	}

}
