/*
 * FPP assignment lesson 3
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question 1 for Date Assignment
 *
 */
//What happens when you add one year to LocalDate.of(2000, 2, 29)? 
//Four years? Four times one year? 

package lesson3;

import java.time.LocalDate;

public class DateAssignment1 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2000, 2, 29);
		System.out.print("Adding 1 year to 2000, 2, 29:"+localDate.plusYears(1)+"\n");
		System.out.print("Adding 4 year to 2000, 2, 29:"+localDate.plusYears(4)+"\n");
		System.out.print("Adding 4 times 1 year to 2000, 2, 29:"+(((localDate.plusYears(1)).plusYears(1)).plusYears(1).plusYears(1)));
		
	}

}
