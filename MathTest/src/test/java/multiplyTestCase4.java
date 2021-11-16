import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestCase4 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(10, 15);
		assertEquals(150, multiply);
	}

}
