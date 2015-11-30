/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question7
 *
 */
package lesson2;

import java.util.Scanner;

public class Question7StringReverse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please a string: ");
		String getString = in.next();
		String tem="";
		// using charAt() method of string and one extra string
		for(int i=getString.length()-1;i>=0;i--){
			tem = tem + getString.charAt(i);
		}
		System.out.println(tem);
//		String first;
//		String last;
//		char middle = 'a';
//		if(getString.length()%2!=0) middle = getString.charAt((getString.length()-1)/2);
//		for(int i=0;i<getString.length()/2;i++){
//			first = String.valueOf(getString.charAt(i));
//			last = String.valueOf(getString.charAt(getString.length()-1-i));
//			getString=getString.replace(last, first);
//			getString=getString.replaceFirst(first, last);
//		}
//		if(getString.length()%2!=0) getString=getString.replaceFirst(String.valueOf(getString.charAt(((getString.length()-1)/2))), String.valueOf(middle));
//		System.out.println(getString);
//		
		in.close();
	}
}
