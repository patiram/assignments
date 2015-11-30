package lesson4;


/**
 * @author PatiRam FPP 
 * assignment lesson 4 
 * student id 984928 
 * created date 11/30/2015 
 * due date 12/01/2015 
 * question 4.4 Divide sort
 */
public class Question4_4DivideSort {

	public void mergeSort(char[] A) {
		// if A has length 1, then done.
		if (A.length > 1) {
			// split into two halves, recursively sort, and then merge.

			// middle is the last entry in the left-hand side.
			int middle = (A.length - 1) / 2;
			char[] left = new char[middle + 1];
			char[] right = new char[A.length - (middle + 1)];

			for (int i = 0; i < middle + 1; i++) {
				left[i] = A[i];
			}

			int rightIndex = 0;
			for (int i = middle + 1; i < A.length; i++) {
				right[rightIndex] = A[i];
				rightIndex++;
			}

			mergeSort(left);
			mergeSort(right);

			merge(A, left, right);
		}

	}

	// Only call this when result.length = B.length + C.length!!!
	private void merge(char[] result, char[] B, char[] C) {
		int a = 0; // next available slot of result
		int b = 0; // next available slot of B (smallest remaining element)
		int c = 0; // next available slot of C (smallest remaining element)

		while (a < result.length) {
			if ((b < B.length) && (!(c < C.length) || B[b] < C[c])) {
				result[a] = B[b];
				a++;
				b++;
			} else {
				result[a] = C[c];
				a++;
				c++;
			}
		}
	}
//called from Lesson4AssignmentMain 
//if want to call from here then make other methods static as well

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = in.next();
//		char[] c = s.toCharArray();
//		System.out.println(s);
//		mergeSort(c);
//		String result = new String(c);
//		System.out.println(result);
//		in.close();
//	}
}
