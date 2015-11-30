/*
 * FPP assignment lesson 2
 * @author 984928 (Pati Ram Yadav)
 * @created date 11/24/2015
 * @due date 11/30/2015
 * @question3.2
 *
 */

//Suppose a String s is initialized by
//String s = "a friendly face";
//a. Compute the value of the expression
//s.charAt(2);
//b. What is the value of
//s.length()?
//c. What is the value of
//s.substring(2,9)?
//s.substring(4)?

package lesson2;

public class Question3_2 {

	public static void main(String[] args) {
		String s = "a friendly face";
		// char at 2 using charAt() method
		System.out.print("Char at 2 using charAt() method: "+s.charAt(2)+"\n");
		// Char at 2 without using the charAt() method
		char[] str;
		str=s.toCharArray();
		System.out.print("Char at 2 without using the charAt() method: "+str[2]+"\n");
		
		//Using length() method
		System.out.print("The lenght of string using length() method is: "+s.length()+"\n");
		
		//Without using length()
		int lenght=0;
		for(char c:s.toCharArray()){
			lenght++;
		}		
		System.out.print("The lenght of string without using length() method is:"+lenght+"\n");
		
		// Sub string using substring() method
		System.out.print("The substring(2,9) is: "+s.substring(2, 9)+"\n");
		System.out.print("The substring(4) is: "+s.substring(4)+"\n");
		
		// Without using substring() method
		String substring="";
		int i=0;
		for(char c:s.toCharArray()){
			if(i>=2&&i<=9)
			substring=substring+c;
			i++;
		}
		System.out.print("The substring 2 to 9 without using substring() method is:"+substring+"\n");
		i=0;
		substring="";
		for(char c:s.toCharArray()){
			if(i>=4){
				substring=substring+c;
			}
			i++;
		}
		System.out.print("The substring 4 without using substring() method is:"+substring);
		
	}

}
