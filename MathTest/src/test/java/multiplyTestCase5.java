import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTestCase5 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int multiply = mymath.myMultiply(13, 3);
		assertEquals(39, multiply);
	}

}
