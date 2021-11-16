import static org.junit.Assert.*;

import org.junit.Test;

public class subTestCase1 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(9, 6);
		assertEquals(3, subtract);
	}

}
