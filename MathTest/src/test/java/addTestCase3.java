import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase3 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(52, 9);
		assertEquals(61,addition);
	}

}
