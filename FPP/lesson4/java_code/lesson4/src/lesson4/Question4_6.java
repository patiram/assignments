package lesson4;

/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question 4.6
 */
public class Question4_6 {
	int sum = 0;
	StringBuilder doubleString = new StringBuilder();

	public int stringLength(String s) {
		if (s.length() == 0)
			return 0;
		else {
			return stringLength(s.substring(1)) + 1;
		}
	}

	public String getSubstring(String s, String temp) {

		if (s.length() == 0)
			return temp;
		return (getSubstring(s.substring(1), temp + s.substring(0, 1)) + " | " + getSubstring(s.substring(1), temp));
	}

	public String findCharacters(String s) {
		if (s.length() == 1)
			return s;
		return s.charAt(0) + "\t" + findCharacters(s.substring(1));
	}

	public int sumOfInteger(String s) {
		if (s.length() == 0)
			return 0;
		return Character.isDigit(s.charAt(0))
				? (sum + Character.getNumericValue(s.charAt(0)) + sumOfInteger(s.substring(1)))
				: sumOfInteger(s.substring(1));
	}

	public boolean isPlaindrome(String s) {
		if (s.length() == 1 || s.length() == 0)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPlaindrome(s.substring(1, s.length() - 1));
		return false;
	}

	public String stutter(String s) {
		if (s.length() == 0)
			return "";
		return Character.toString(s.charAt(0)) + Character.toString(s.charAt(0)) + stutter(s.substring(1));
	}

}
