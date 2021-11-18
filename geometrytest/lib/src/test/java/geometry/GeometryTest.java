package geometry;

import org.testng.annotations.Test;


public class GeometryTest {
  @Test
  public void testareaRect() {
	  
	  geometry geo = new geometry();
	  float area = geo.areaRect(5,4);
	  Assert.assertEquals(20,area);
  }
  
  @Test
  public void testPerimeterRect() {
	  
	  geometry geo = new geometry();
	  float peri = geo.perimeterRect(5,4);
	  Assert.assertEquals(18,peri);
  }
  
  @Test
  public void testVolumeSphere() {
	  
	  geometry geo = new geometry();
	  float vol = geo.volumeSPhere(4);
	  float expected = (4/3)*(22/7)*(4*4*4);
	  Assert.assertEquals(expected,vol);
  }
  
  @Test
  public void testSUrfaceAreashpere() {
	  
	  geometry geo = new geometry();
	  float sur = geo.surfaceAreaSphere(6);
	  float expected = 4 *(22/7)*(4*4);
	  Assert.assertEquals(expected,sur);
  }
  
}
