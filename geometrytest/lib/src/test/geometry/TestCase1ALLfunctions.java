package geometry;

import org.testng.annotations.Test;

public class TestCase1ALLfunctions {

	  @Test
	  public void testareaRect() {
		  
		  geometry geo = new geometry();
		  float area = geo.areaRect(9,4);
		  Assert.assertEquals(36,area);
	  }
	  
	  @Test
	  public void testPerimeterRect() {
		  
		  geometry geo = new geometry();
		  float peri = geo.perimeterRect(6,4);
		  Assert.assertEquals(20,peri);
	  }
	  
	  @Test
	  public void testVolumeSphere() {
		  
		  geometry geo = new geometry();
		  float vol = geo.volumeSPhere(9);
		  float expected = (4/3)*(22/7)*(9*9*9);
		  Assert.assertEquals(expected,vol);
	  }
	  
	  @Test
	  public void testSUrfaceAreashpere() {
		  
		  geometry geo = new geometry();
		  float sur = geo.surfaceAreaSphere(6);
		  float expected = 4 *(22/7)*(6*6);
		  Assert.assertEquals(expected,sur);
	  }
  }
}
