/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question11
 *
 */
package lesson2;

import java.util.Scanner;

public class Question11InputSequencePalidrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter input sequence liek 'A MUM A':");
		String yourString = in.nextLine();
		boolean isPalindrome = yourString.replaceAll("[^A-Za-z]", "").toLowerCase()
				.equals(new StringBuilder(yourString.replaceAll("[^A-Za-z]", "").toLowerCase()).reverse().toString());
		if (isPalindrome)
			System.out.println("It is Plaindrome");
		else
			System.out.println("It is not Plaindrome");
		in.close();
	}

}
