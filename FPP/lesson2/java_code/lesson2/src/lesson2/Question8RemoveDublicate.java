/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question8
 *
 */
package lesson2;

import java.util.Scanner;

public class Question8RemoveDublicate {

	public static void main(String[] args) {

		int total;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many string you want to enter : ");
		total = sc.nextInt();

		String[] text = new String[total];

		for (int i = 0; i < total; i++) {
			System.out.printf("Enter string [%d] :", i);
			text[i] = sc.next();
		}
		sc.close();

		System.out.print("\nYour entered : \"");
		for (int i = 0; i < text.length; i++) {
			System.out.print(text[i] + " ");
		}
		System.out.print("\"");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length; i++) {
			boolean found = false;
			for (int j = i + 1; j < text.length; j++) {
				if (text[j].equals(text[i])) {
					found = true;
					break;
				}
			}

			if (!found) {
				if (sb.length() > 0)
					sb.append(' ');
				sb.append(text[i]);
			}
		}
		System.out.printf("\nThe non-repeated strings are: \"%s\"%n", sb);

	}

}
