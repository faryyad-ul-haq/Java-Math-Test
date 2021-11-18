package geometry;

import org.testng.annotations.Test;

public class TestCaseAllfunctions {
	  @Test
	  public void testareaRect() {
		  
		  geometry geo = new geometry();
		  float area = geo.areaRect(15,3);
		  Assert.assertEquals(45,area);
	  }
	  
	  @Test
	  public void testPerimeterRect() {
		  
		  geometry geo = new geometry();
		  float peri = geo.perimeterRect(9,2);
		  Assert.assertEquals(22,peri);
	  }
	  
	  @Test
	  public void testVolumeSphere() {
		  
		  geometry geo = new geometry();
		  float vol = geo.volumeSPhere(11);
		  float expected = (4/3)*(22/7)*(11*11*11);
		  Assert.assertEquals(expected,vol);
	  }
	  
	  @Test
	  public void testSUrfaceAreashpere() {
		  
		  geometry geo = new geometry();
		  float sur = geo.surfaceAreaSphere(2);
		  float expected = 4 *(22/7)*(2*2);
		  Assert.assertEquals(expected,sur);
	  }
}
