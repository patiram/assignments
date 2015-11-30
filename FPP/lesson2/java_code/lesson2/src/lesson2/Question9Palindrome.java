/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question9
 *
 */

package lesson2;

import java.util.Scanner;

public class Question9Palindrome {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string : ");
		String yourString = sc.nextLine();
		sc.close();
		isPlaindrome(yourString);
		
	}
	
	public static void isPlaindrome(String yourString){
		String myString = "";
		int textLen = yourString.length();
		
		for (int i = textLen -1; i >=0; i--) {
			myString = myString + yourString.charAt(i);
		}
		
		if(yourString.equals(myString)) System.out.println("Congrs! Your string is plaindrome");
		else System.out.println("Your string is not plaindrome");
	}

}
