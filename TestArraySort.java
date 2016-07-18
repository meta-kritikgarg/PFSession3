import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author KRITIK GARG
 *
 */
public class TestArraySort {
	ArraySort as = new ArraySort();

	/**
	 * Test cases for QuickSort
	 */
	@Test
	public void testReArrangeByQuickSort() {
		//Test 1
		int[] in = {79,2,5,8,9,10, 77,104};
		int[] out = {2,5,8,9,10, 77, 79,104};
		assertArrayEquals(out, as.reArrangeByQuickSort(in));

		//Test 2
		int[] in2 = new int[90];
		//Generate random array of length 90
		for(int i = 0; i < in2.length; i++) {
		    in2[i] = (int)(Math.random()*100);
		}
		
		int[] out2=as.reArrangeByQuickSort(in2);
		//Check array is sorted or not
		assertEquals(true, checkArray(out2));
	}
	
	
	/**
	 * Method to check array is sorted or not
	 * @param a int[] input array for test
	 * @return true if array is sorted, else false
	 */
	public boolean checkArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] > a[i + 1]) {
	            return false; // It is proven that the array is not sorted.
	        }
	    }
	    return true; //array must be sorted.
	}
		

}
