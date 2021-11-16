import static org.junit.Assert.*;

import org.junit.Test;

public class subTestCase3 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int subtract = mymath.mySubtract(55, 50);
		assertEquals(5, subtract);
	}

}
