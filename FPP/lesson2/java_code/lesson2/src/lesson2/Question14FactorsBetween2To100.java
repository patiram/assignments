/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question14 Write a program to find factors of numbers between 2 and 100.
 *
 */
package lesson2;

public class Question14FactorsBetween2To100 {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++){
			System.out.printf("%nThe factor of %d: ",i);
			for(int j=2;j<i;j++){
				if(i%j==0){
					System.out.print(j+" ");
				}
			}
		}

	}
}
