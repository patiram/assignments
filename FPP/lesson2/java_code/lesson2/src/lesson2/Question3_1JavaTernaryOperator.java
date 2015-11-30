/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question3.1 if age is greater than 65 then social security status eligible else ineligible using the Java ternary operator.
 *
 */
package lesson2;

import java.util.Scanner;

public class Question3_1JavaTernaryOperator {

	public static void main(String[] args) {
		int age=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age:");
		age=in.nextInt(); // taking age from user
		String socialSecurityStatus;
		socialSecurityStatus=(age>65)?"Eligible":"Ineligible"; // java ternary operator
		System.out.print("You are: "+socialSecurityStatus);
		in.close();
	}

}
