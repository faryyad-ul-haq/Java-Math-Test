import static org.junit.Assert.*;

import org.junit.Test;

public class divTestCase3 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(160, 4);
		assertEquals(40, divide);
	}

}
