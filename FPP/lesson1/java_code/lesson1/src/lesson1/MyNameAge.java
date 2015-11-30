/*
 * FPP assignment lesson 1
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question Write a program to print your name and age.
 *
 */
package lesson1;

import java.time.LocalDate;

public class MyNameAge {

	public static void main(String[] args) {
		System.out.print("My name is 'Pati Ram Yadav'\n");
		System.out.print("I am 25 years old, without using java.time.LocalDate\n"); // without using java.time.LocalDate
		LocalDate birthDate = LocalDate.of(1990, 05, 8);
		LocalDate todayDate = LocalDate.now();
		System.out.print("I am "+(todayDate.getYear()-birthDate.getYear())+" years old, with using java.time.LocalDate");
	}

}
