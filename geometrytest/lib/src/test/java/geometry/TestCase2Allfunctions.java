package geometry;

import org.testng.annotations.Test;

public class TestCase2Allfunctions {
	 
		  @Test
		  public void testareaRect() {
			  
			  geometry geo = new geometry();
			  float area = geo.areaRect(9,9);
			  Assert.assertEquals(81,area);
		  }
		  
		  @Test
		  public void testPerimeterRect() {
			  
			  geometry geo = new geometry();
			  float peri = geo.perimeterRect(7,7);
			  Assert.assertEquals(28,peri);
		  }
		  
		  @Test
		  public void testVolumeSphere() {
			  
			  geometry geo = new geometry();
			  float vol = geo.volumeSPhere(15);
			  float expected = (4/3)*(22/7)*(15*15*15);
			  Assert.assertEquals(expected,vol);
		  }
		  
		  @Test
		  public void testSUrfaceAreashpere() {
			  
			  geometry geo = new geometry();
			  float sur = geo.surfaceAreaSphere(17);
			  float expected = 4 *(22/7)*(17*17);
			  Assert.assertEquals(expected,sur);
		  }
}
