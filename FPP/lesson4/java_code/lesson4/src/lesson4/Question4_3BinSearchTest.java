package lesson4;
/**
 * @author PatiRam
 * FPP assignment lesson 4
 * student id 984928
 * created date 11/30/2015
 * due date 12/01/2015
 * question 4.3 test case
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Question4_3BinSearchTest {
	private Question4_3BinSearch sut;
	@Before
    public void setUp() throws Exception {
        sut = new Question4_3BinSearch();
    }
	// covers the 'true' cases above
	@Test
    public void shouldReturnTrue() {
		String test1="abcdefghi";
        assertEquals(true,
                sut.binarySearch(test1,'d',0,test1.length()-1));
    }
	// covers the 'false' cases above
	@Test
    public void shouldReturnFalse() {
		String test2="abcdefghi";
        assertEquals(false,
                sut.binarySearch(test2,'z',0,test2.length()-1));
    }
}
