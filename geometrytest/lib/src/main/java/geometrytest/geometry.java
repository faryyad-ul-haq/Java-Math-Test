package geometrytest;

public class geometry {
	
	float areaRect(float height, float width) {
		return height*width;
	}
	
	float perimeterRect(float height, float width) {
		return 2*(height+width);
	}
	
	float volumeSphere(float radius) {
		return (4/3)*(22/7)*(radius*radius*radius);
	}
	
	float surfaceAreaSphere(float radius) {
		return 4*(22/7)*(radius*radius);
	}

}
