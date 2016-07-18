import static org.junit.Assert.*;

import org.junit.Test;

public class TestArraySearch {
	ArraySearch as = new ArraySearch();


	/**
	 * Test case for linear search
	 */
	@Test
	public void testLinearSearch() {

		int[] in = {2,5,8,9,10, 77, 55, 11};
		assertEquals(5, as.findElementByLinear(in, 77));
		//Negative Test case
		assertEquals(as.NOT_FOUND, as.findElementByLinear(in, 100));
	}
	
	
	/**
	 * Test case for binary search
	 */
	@Test
	public void testBinarySearch() {
		int[] in = {2,5,8,9,10, 77, 79,104};
		assertEquals(5, as.findElementByBinarySearch(in, 77));
		//Negative test case
		assertEquals(as.NOT_FOUND, as.findElementByBinarySearch(in, 100));
	}

}
