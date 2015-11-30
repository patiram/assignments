/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question2 Write program in Java to discuss date formatting in Java.
 *
 */

package lesson2;

import java.util.Calendar;

public class Question2DateFormatting {

	public static void main(String[] args) {
		Calendar calen = Calendar.getInstance();
	    // %tB: A date & time conversion—locale-specific full name of month.
	    // %te: A date & time conversion—2-digit day of month. td has leading zeroes as needed, te does not.
	    // %tD: A date & time conversion—date as %tm%td%ty
	    // %tM: A date & time conversion—minutes in 2 digits, with leading zeroes as necessary.
	    System.out.format("Date: %tB %te, %tY%n", calen, calen, calen); // display format  "May 29, 2006"
	    System.out.format("Time: %tl:%tM %tp%n", calen, calen, calen);  // display format "2:34 am"
	    System.out.format("Date: %tD%n", calen);    // display format "05/29/06"
	    System.out.format("Date and Time: %tD %tl:%tM %tp", calen, calen, calen, calen); //today date with 12 hour time format
	}

}
