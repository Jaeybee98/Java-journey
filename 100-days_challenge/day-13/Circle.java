class Circle {
	//radius of the circle
	double radius;

	//number of objects created
	static int numberOfObjects = 0;

	//construct a circle with radius 1
	Circle() {
		radius = 1;
		numberOfObjects++;
	}

	//construct a circle with a specified radius
	Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	//get number of objects
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	//return area of this circle
	double getArea() {
		return radius * radius * Math.PI;
	}
}
