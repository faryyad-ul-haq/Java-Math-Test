import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void testAdd() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(5, 3);
		assertEquals(8,addition);
	}
	
	@Test
	public void testSubtract() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(3, 6);
		assertEquals(-3, subtract);	
	}
	
	@Test
	public void testMultiply() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(7, 3);
		assertEquals(21, multiply);	
	}
	
	@Test
	public void testDivide() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(99, 3);
		assertEquals(33, divide);	
	}

}
