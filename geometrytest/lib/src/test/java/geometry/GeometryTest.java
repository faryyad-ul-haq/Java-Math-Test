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
	  Assert.assertEquals(20,peri);
  }
  
  @Test
  public void testVolumeSphere() {
	  
	  geometry geo = new geometry();
	  float vol = geo.volumeSPhere(4);
	  Assert.assertEquals(64,vol);
  }
  
  @Test
  public void testSUrfaceAreashpere() {
	  
	  geometry geo = new geometry();
	  float sur = geo.surfaceAreaSphere(6);
	  Assert.assertEquals(314.2857142857142857142857142857,sur);
  }
  
}
