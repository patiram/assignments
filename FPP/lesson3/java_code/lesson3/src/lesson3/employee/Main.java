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
import java.util.List;
import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
//		for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.print("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			List<String> info = getFormattedAcctInfo();
			//display info to console
			for(String str:info)
			System.out.println(str);
		}
		else {
			//do nothing..the application ends here
		}		
		sc.close();
	}
	private List<String> getFormattedAcctInfo() {
		// TODO Auto-generated method stub
		List<String> temp = new ArrayList<String>();
		for(int i=0;i<3;i++){
//			System.out.println("temp1: "+temp);
			temp.addAll(emps[i].getFormattedAcctInfo());
//			temp=temp+emps[i].getFormattedAcctInfo()+"\n";
//			System.out.println("temp2: "+temp);
		}
		return temp;
	}
}