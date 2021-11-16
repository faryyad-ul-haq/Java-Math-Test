import static org.junit.Assert.*;

import org.junit.Test;

public class subTestCase4 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(95, 4);
		assertEquals(91, subtract);
	}

}
