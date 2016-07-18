import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumberOperation {
	
	NumberOperation numOp = new NumberOperation();

	//Test case for rem method
	@Test
	public void testRem() {
		assertEquals(1, numOp.rem(5, 2));
		assertEquals(0, numOp.rem(2, 1));
		//Invalid input
		assertEquals(-1, numOp.rem(2, 0));
		assertEquals(4, numOp.rem(100, 32));
	}
	
	
	//Test case for GCD method
	@Test
	public void testGcd() {
		assertEquals(6, numOp.gcd(12, 18));
		assertEquals(6, numOp.gcd(18, 12));
		assertEquals(1, numOp.gcd(2, 1));
		assertEquals(1, numOp.gcd(100, 3));
		assertEquals(4, numOp.rem(100, 32));
	}
	
	
	//Test case for largestDigit method
	@Test
	public void testlargestDigit() {
		assertEquals(2, numOp.largestDigit(2));
		assertEquals(9, numOp.largestDigit(654983));
		assertEquals(4, numOp.largestDigit(444));
		assertEquals(0, numOp.largestDigit(0));
	}

}
