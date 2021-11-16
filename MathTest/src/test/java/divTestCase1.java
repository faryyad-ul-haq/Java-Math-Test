import static org.junit.Assert.*;

import org.junit.Test;

public class divTestCase1 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(121, 11);
		assertEquals(11, divide);
	}

}
