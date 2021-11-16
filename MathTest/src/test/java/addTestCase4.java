import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase4 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(99, 1);
		assertEquals(100,addition);
	}

}
