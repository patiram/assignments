/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question3.3
 *
 */
//Write a Java expression that computes each of the following:
//b. Given the length len and width wid of a rectangle, compute the length of the
//diagonal of the rectangle, and store it in a variable diag.

package lesson2;

import java.util.Scanner;

public class Question3_3_B {

	public static void main(String[] args) {
		float len, wid; //dimension of rectangle
		double diag; // for diagonal of rectangle
		Scanner in = new Scanner(System.in);
		//taking parameters for rectangle
		System.out.print("Enter length of rectangle:");
		len = in.nextFloat();
		System.out.print("Enter width of rectangle:");
		wid = in.nextFloat();
		//computing the diagonal of circle
		diag = Math.sqrt(Math.pow(len, 2)+ Math.pow(wid, 2));
		System.out.print("The diagonal of rectangle having lenght: "+len+" and width: "+wid+" is: "+diag);
		in.close();

	}

}
