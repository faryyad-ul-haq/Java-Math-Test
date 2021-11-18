package geometry;

import org.testng.annotations.Test;

public class TestCase4Allfunctions {
	  @Test
	  public void testareaRect() {
		  
		  geometry geo = new geometry();
		  float area = geo.areaRect(14,4);
		  Assert.assertEquals(64,area);
	  }
	  
	  @Test
	  public void testPerimeterRect() {
		  
		  geometry geo = new geometry();
		  float peri = geo.perimeterRect(10,10);
		  Assert.assertEquals(40,peri);
	  }
	  
	  @Test
	  public void testVolumeSphere() {
		  
		  geometry geo = new geometry();
		  float vol = geo.volumeSPhere(7);
		  float expected = (4/3)*(22/7)*(7*7*7);
		  Assert.assertEquals(expected,vol);
	  }
	  
	  @Test
	  public void testSUrfaceAreashpere() {
		  
		  geometry geo = new geometry();
		  float sur = geo.surfaceAreaSphere(3);
		  float expected = 4 *(22/7)*(3*3);
		  Assert.assertEquals(expected,sur);
	  }
}
