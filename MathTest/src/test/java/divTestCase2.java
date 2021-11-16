import static org.junit.Assert.*;

import org.junit.Test;

public class divTestCase2 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(168, 2);
		assertEquals(84, divide);
	}

}
