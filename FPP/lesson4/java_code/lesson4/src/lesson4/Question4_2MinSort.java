package lesson4;

/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question 4.2
 */

public class Question4_2MinSort {
	public String sort(String s){
		if(s.length() < 2) return s;
		
		char[] temp = s.toCharArray();
		char leastChar = leastCharacter(s);
		int minpos = s.lastIndexOf(leastChar);
		
		char tempChar = temp[0];
		temp[0] = temp[minpos];
		temp[minpos] = tempChar;
		
		String finalString = String.valueOf(temp[0]);
		String t = String.valueOf(temp).substring(1);
		return finalString+sort(t);
		
		
	}
	
	public char leastCharacter(String s){
		char ch = s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				if(ch > s.charAt(i)){
					ch = s.charAt(i);
				}
			}
		return ch;
	}
}
