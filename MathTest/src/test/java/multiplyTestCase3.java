import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestCase3 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(100, 90);
		assertEquals(9000, multiply);
	}

}
