package lesson4;

import java.math.BigInteger;

/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question factorial of 100
 */
public class QuestionFactorialOf100 {
	public static void main(String[] args) {
		BigInteger number = fact(100);
		System.out.println("Factorial of 100 :" + number);
	}
	private static BigInteger fact(long n) {
	    BigInteger result = BigInteger.ONE;
		for (long i = 2; i <= n; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;		
	}
}
