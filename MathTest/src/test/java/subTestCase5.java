import static org.junit.Assert.*;

import org.junit.Test;

public class subTestCase5 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(80, 11);
		assertEquals(69, subtract);
	}

}
