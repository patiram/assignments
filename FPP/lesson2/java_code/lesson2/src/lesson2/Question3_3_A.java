/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question3.3
 *
 */
//Write a Java expression that computes each of the following:
//a. Given the radius r of a circle, compute the area of the circle, and store it in a
//variable A.


package lesson2;

import java.util.Scanner;

public class Question3_3_A {

	public static void main(String[] args) {
		float radius;
		double A; //area of circle
		Scanner in = new Scanner(System.in);
		//taking radius of circle
		System.out.print("Enter your radius of circle:");
		radius = in.nextFloat();
		//computing the area of circle
		A = Math.PI*Math.pow(radius, 2);
		System.out.print("Area of circle with radius: "+radius+" is "+A+"\n");
		in.close();
		
	}

}
