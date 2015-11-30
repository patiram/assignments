/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question10.3
 *
 */

package lesson2;

import java.util.Scanner;

public class Question10_3PrintStars {

	public static void main(String[] args) {

		int lineNumber;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter nos of line you want to print stars : ");
			lineNumber = sc.nextInt();
			if (lineNumber % 2 == 0)
				continue;
			else
				break;
		}
		sc.close();

		int spaces = lineNumber - 1, last, min = 1, max;

		for (int i = 0; i < lineNumber; i++) {
			last = 2 * i + 1;
			max = spaces + last;

			for (int j = min; j <= max; j++) {
				if (j == spaces + 1 || j == max || i == lineNumber - 1)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
			spaces--;
		}

	}

}
