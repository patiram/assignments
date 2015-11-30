/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 2 for Date Assignment
 *
 */
//Write a program that prints how many days you have been alive.
//(Use birthdate and current date to compute the same) 

package lesson3;

import java.time.LocalDate;

public class DateAssignment2NoOfDaysAlive {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1990, 05, 8);
		LocalDate todayDate = LocalDate.now();
		//System.out.println(todayDate.);
		System.out.print("I have been alive for "+(todayDate.toEpochDay()-birthDate.toEpochDay())+" days");

	}

}
