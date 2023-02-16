//Import Scanner
import java.util.Scanner;

class ConvertFahrenheitToCelsius {
	public static void main(String[] args) {
		//Read input from scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a degree in Fahreinheit: ");

		//Initialise to read input from keyboard
		double fahrenheit = input.nextDouble();

		//Compute to celsius
		double celsius = (5.0/9) * (fahrenheit - 32);

		//Display result
		System.out.print("Fahrenheit " + fahrenheit + " is " + celsius + " in celsius.\n");
	}
}
