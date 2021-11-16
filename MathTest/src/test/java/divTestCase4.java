import static org.junit.Assert.*;

import org.junit.Test;

public class divTestCase4 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(190, 2);
		assertEquals(95, divide);
	}

}
