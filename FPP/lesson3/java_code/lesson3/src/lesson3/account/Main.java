/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.1 Account for Date Assignment
 *
 */

package lesson3.account;


public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee("Lerman", 200, 1991, 1, 1);
		Account acctChk = new Account(emp, AccountType.CHECKING, 200);
		Account acctSav = new Account(emp, AccountType.SAVINGS, 300);
		Account acctRet = new Account(emp, AccountType.RETIRMENT, 300);
		System.out.println(acctChk.toString());
		System.out.println(acctSav.toString());
		System.out.println(acctRet.toString());
		System.out.println(emp.getHireDay());
	}

}
