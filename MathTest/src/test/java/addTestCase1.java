import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase1 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(11, 5);
		assertEquals(16,addition);
	}

}
