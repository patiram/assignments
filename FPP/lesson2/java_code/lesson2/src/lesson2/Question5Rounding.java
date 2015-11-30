/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question5
 *
 */
//create float variables to store each of the following numbers:1.27, 3.881, 9.6               
//Output to the console the following two values:               
//a. the sum of the floats as an integer, obtained by casting the sum to type int               
//b. the sum of the floats as an integer, obtained by rounding the sum to the nearest                   integer, using the Math.round function. 

package lesson2;

public class Question5Rounding {

	public static void main(String[] args) {
		float num1 = 1.27f;
		float num2 = 3.881f;
		float num3 = 9.6f;
		int sumOfFloat;
		sumOfFloat = (int)(num1 + num2 + num3);
		System.out.println("Sum of flaots num1:"+num1+" num2:"+num2+" num3:"+num3+" is:"+sumOfFloat+"\nBut the float sum is:"+(num1+num2+num3));
		System.out.println("Sum of the floats as an integer using Math.round is:"+Math.round(num1+num2+num3));
		System.out.println("Sum of the floats as an integer using Math.floor is:"+Math.floor(num1+num2+num3));
		System.out.println("Sum of the floats as an integer using Math.ceil is:"+Math.ceil(num1+num2+num3));
		
	}

}
