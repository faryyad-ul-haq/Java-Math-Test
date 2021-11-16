import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase2 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(78, 2);
		assertEquals(80,addition);
	}

}
