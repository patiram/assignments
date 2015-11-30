/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question10.1
 *
 */

package lesson2;

import java.util.Scanner;

public class Question10_1PrintStars {

	public static void main(String[] args) {
		int lineNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nos of line you want to print star: ");
		lineNumber = sc.nextInt();
		sc.close();
		for (int i = 1; i <= lineNumber; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
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
