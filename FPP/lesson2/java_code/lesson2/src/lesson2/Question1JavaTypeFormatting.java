/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question1 Write program in Java to discuss different types of formatting options(at least 10)
 *
 */
package lesson2;

import java.util.Locale;
import java.text.*;

public class Question1JavaTypeFormatting {

	public static void main(String[] args) {
		int num=1245;
		double fraction=123444.0334;
		char c='P';
		String firstName="Pati Ram";
		String lastName="Yadav";
		// %d is used for decimal
		// %n is new line which is platform independent
		System.out.printf("Integer value with with new line: %d%n",num);
		// %f is used for float 
		System.out.printf("This is float %f%n",fraction);
		
		double pi = Math.PI;
		System.out.format("%f%n", pi); //display default value of pi in java
	    System.out.format("%.3f%n", pi); // display 3 precision value of pi
	    System.out.format("%10.3f%n", pi); // display from left to right with 3 precision by reserving 10 space
	    System.out.format(Locale.FRANCE,"%.4f%n%n", pi); //France style with the help of java.util.Locale
	    
	    System.out.printf("Charactor: %c%n",c); // display a character
	    System.out.printf("String full name: %n%s%6.5s%n%n",firstName,lastName); // Contacting first and last name separated by space
	    
	    
	    //Custom formating using DecimalFormat class from java.text.*
	    System.out.printf("Demostration for custom decimal format:%n");
	    //calling the custom method
	    customFormat("###,###.###", 123456.789);
	    customFormat("###.##", 123456.789);
	    customFormat("000000.000", 123.78);
	    customFormat("$###,###.###", 12345.67); 
	}
	//method declaration and definition for customFormat
	static public void customFormat(String pattern, double value ) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}
}

