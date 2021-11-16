import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void testAdd() {
		MyMath mymath = new MyMath();
		int addition = mymath.myAdd(5, 3);
		assertEquals(8,addition);
	}

}
