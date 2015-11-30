/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question4
 *
 */

//Write a program that asks the user to enter a String.
//The program then writes to console all substrings of this String. 
//(By "substring", we mean any sequence of characters that occur consecutively 
//and in the same order in the given String. 
//Therefore, "erg" is a substring of "energy", but "gre" and "eng" are not. 
//Note that the empty string "" is considered a substring of every string.) 
//Note: You will need to make sure that you do not output the same substring twice. 
//For instance, if the user types in "abbab", you might accidentally output the String 
//"ab" twice, since it occurs in two places in this String. Here is typical output: 
//Type in a string: what Substrings of length 0 [] 
//Substrings of length 1 [w] [h] [a] [t] Substrings of length 2 [wh] [ha] [at] 
//Substrings of length 3 [wha] [hat] Substrings of length 4 [what] 


package lesson2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner in = new Scanner(System.in);
		String userString = in.next();//getting string from user
		int len = userString.length(); 
		List<String> tempListOfSubstring = new ArrayList<String>();
		for(int i=len+1; i>0; i--) {
			for(int j=0; j<i; j++){
				if (!tempListOfSubstring.contains(userString.substring(j,len-i+j+1))) {
					System.out.printf("%d-%d [%s]",j, len-i+j+1, userString.substring(j,len-i+j+1));
					System.out.println();
					tempListOfSubstring.add(userString.substring(j,len-i+j+1));
				}
			}
			tempListOfSubstring.clear();
			System.out.println("~~~~~~~~~");
		}
		in.close();
	}
}