import static org.junit.Assert.*;

import org.junit.Test;

public class subTestCase2 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(15, 5);
		assertEquals(10, subtract);
	}

}
