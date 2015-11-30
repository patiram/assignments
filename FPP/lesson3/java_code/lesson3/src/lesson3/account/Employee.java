/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 3.1 Account for Date Assignment
 *
 */
package lesson3.account;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	//private long hireDays;
	
	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
		// = LocalDate.now().toEpochDay()-LocalDate.of(aYear, aMonth, aDay).toEpochDay();
	}
		// instance methods
		public String getName() {
			return name;
		}

		public double getSalary() {
			return salary;
		}

		// needs to be improved!!
		public String getHireDay() {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
			String formattedDate = formatter.format(hireDay);
			return formattedDate;
			
//			hireDay.setTime(hireDays);
//			System.out.println(hireDay.getTime());
//			return hireDays;
		}

		public void raiseSalary(double byPercent) {
			double raise = salary * byPercent / 100;
			salary += raise;
		}
}
