import static org.junit.Assert.*;

import org.junit.Test;

public class divTestCase5 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int divide = mymath.myDivide(88, 4);
		assertEquals(22, divide);
	}

}
