package lesson4;
/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question 4.3
 */
public class Question4_3BinSearch {
	public boolean binarySearch(String a, char c, int start, int end) {
		if (end < start) {
			return false;
		}
		int ch = (start + end) / 2;
		if (a.charAt(ch) == c)
			return true;
		else if (a.charAt(ch) < c) {
			return binarySearch(a, c, ch + 1, end);
		} else if (a.charAt(ch) > c) {
			return binarySearch(a, c, start, ch-1);
		} else
			return false;
	}
}
