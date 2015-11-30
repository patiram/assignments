/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question10.2
 *
 */

package lesson2;

import java.util.Scanner;

public class Question10_2PrintStars {

	public static void main(String[] args) {
		int lineNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nos of line you want to print stars : ");
		lineNumber = sc.nextInt();
		sc.close();

		for (int i = 1; i <= lineNumber; i++) {
			for (int j = 1; j <= lineNumber; j++) {
				if (j == lineNumber || i + j == lineNumber + 1)
					System.out.print("*");
				else if (i == lineNumber)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
