class TestCircle {
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle object is " + Circle.numberOfObjects);

		//create object 1
		Circle c1 = new Circle();

		//display c1
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");

		//create object2
		Circle c2 = new Circle(5);

		//modify c1
		c1.radius = 9;

		//display c1 and c2
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
		System.out.println("c2: radius (" +c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
	}
}
