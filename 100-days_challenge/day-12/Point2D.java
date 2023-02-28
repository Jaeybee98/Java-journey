//import scanner
import java.util.Scanner;

//import Point2D from the JavaFX geometry package.
import javafx.geometry.Point2D;

class Point2D {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to input point1 coordinates
		System.out.print("Enter point1's x-, y-coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//prompt user to input point2 coordinates
		System.out.print("Enter point2's x-, y-coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//create two point objects
		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		
		//covert to string by invoking toString().
		System.out.println("p1 is: " + p1.toString());
		System.out.println("p2 is: " + p2.toString());

		//display result
		System.out.println("The distance between p1 and p2 is: " + p1.distance(p2));
	}
}
