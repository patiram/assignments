
package lesson4;
/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question 4.1 exponential
 */
public class Question4_1Exponential {
	double result;
	double power(double x, int n){
		if (n < 1) 
	        return 1; 
	    else
	        return x * power(x,n-1) ;
	}
}
