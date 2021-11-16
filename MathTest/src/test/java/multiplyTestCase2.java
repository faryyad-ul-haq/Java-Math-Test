import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestCase2 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(9, 6);
		assertEquals(54, multiply);
	}

}
