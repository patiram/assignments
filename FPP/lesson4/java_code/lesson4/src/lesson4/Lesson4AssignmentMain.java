package lesson4;

import java.util.Scanner;
/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * lesson 4 main method. 
 * This includes main method for all the classes except factorial of 100.
 */
public class Lesson4AssignmentMain {
	

	public static void main(String[] args) {
		Question4_1Exponential exp = new Question4_1Exponential();
		Scanner in = new Scanner(System.in);
		System.out.println("***Question4_1: Compute Exponential using recursion***");
		System.out.println("Enter any real number:");
		double realNumber = in.nextDouble();
		System.out.println("Enter any natural Number x>0:");
		int naturalNumber = in.nextInt();
		System.out.println("The "+naturalNumber+" exponent of "+realNumber+"is "+exp.power(realNumber, naturalNumber));
		
		System.out.println("\n***Question4_2: MinSort of charaters in a string using using recursion***");
		Question4_2MinSort minsort = new Question4_2MinSort();
		String minString = "asakflkdasjfkljs";
		System.out.println("The MinSort for "+minString+" is "+minsort.sort("asakflkdasjfkljs"));
		
		System.out.println("\n***Question4_3: Binary Search for a character in an string, return true if found and return false if not found***");
		Question4_3BinSearch binsearch = new Question4_3BinSearch();
		String binString="dslafldf";
		System.out.println("The result is true if found and false if not found: "+binsearch.binarySearch(binString, 'a', 0, binString.length()-1));
		
		System.out.println("Question 4.6");
		Question4_6 obj46 = new Question4_6();
		String s = "I am Patiram";
		System.out.println("Length of string: " + obj46.stringLength(s));
		System.out.println("Substring of 'PATIRAM': " + obj46.getSubstring("Apple", ""));
		System.out.println("Characters in String 'Patiram':" + obj46.findCharacters("apple"));
		System.out.println("Sum of Integer: " + obj46.sumOfInteger("I am 25years and 54 days old"));
		System.out.println("Sutter for 'PATIRAM':" + obj46.stutter("PATIRAM"));
		System.out.println("Sutter for 'yadav':" + obj46.stutter("yadav"));
		System.out.println("Check Plaindrome 'mum':" + obj46.isPlaindrome("mum"));
		System.out.println("Check Plaindrome 'muma':" + obj46.isPlaindrome("muma"));
		
		System.out.println("***Question4_4: Divide Sort Algorithm for sorting***");
		Question4_4DivideSort dividesortObj = new Question4_4DivideSort();
		System.out.println("Please enter a string in either lower or upper only:");
		String str = in.next();
		char[] c = str.toCharArray();
		System.out.print("You entered: "+str);
		dividesortObj.mergeSort(c);
		String result = new String(c);
		System.out.print("\nAfter sorting using divide sort: "+result);
		
		in.close();
	}
}

