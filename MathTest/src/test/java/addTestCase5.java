import static org.junit.Assert.*;

import org.junit.Test;

public class addTestCase5 {

	@Test
	public void test() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(154, 6);
		assertEquals(160,addition);
	}

}
