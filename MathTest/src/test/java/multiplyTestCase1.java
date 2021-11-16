import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestCase1 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(8, 7);
		assertEquals(56, multiply);
	}

}
