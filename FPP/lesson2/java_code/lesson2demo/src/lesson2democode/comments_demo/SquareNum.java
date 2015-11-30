package lesson2democode.comments_demo;
import java.io.*;
/**
 * This class demonstrate documentation comments
 * @author Herbert Schildt
 * @version 1.2
 * 
 * */
public class SquareNum {
	/**
	 * This method returns the square of num.
	 * this is a multiline description . You can use
	 * as many line as you like
	 * @param num The value to be squared
	 * @return num squared
	 * */
public double square(double num)
{
	return num*num;
}
/**
 * This method inputs a number from the user
 * @return The value input as a double 
 * @exception IOException on input error
 * @see IOException
 * */
public double getNumber() throws IOException
{
	//create a BufferedReader using System.in
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader inData=new BufferedReader(isr);
	String str;
	str=inData.readLine();
	return (new Double(str)).doubleValue();
}
/**
 * This method demonstrates square()
 * @param args Unused
 * @exception IOException on input error
 * @see IOException
 * */
public static void main(String args[]) throws IOException
{
	SquareNum ob=new SquareNum();
	double val;
	System.out.println("Enter value to be squared");
	val=ob.getNumber();
	val=ob.square(val);
	System.out.println("Squared value is"+val);
}
}
