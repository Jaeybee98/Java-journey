//import scanner
import java.util.Scanner;

class OrderOfTwoCities {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter two cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();

		//comapre and arrange in order
		if (city1.compareTo(city2) < 0)
			System.out.println("The cities in alphabetical order are: " + city1 + " " + city2);
		else 
			System.out.println("The cities in alphabetical order are: " + city2 + " " + city1);
	}
}
