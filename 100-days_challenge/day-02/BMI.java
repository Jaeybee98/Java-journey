//This is a program that calculates the BMI after prompting the user to enter a weight in pounds and height in inches.

//import the scanner class to read input from keyboard
import java.util.Scanner;

class BMI {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);
		
		//initialise the constants for converting the weight and height.
		final double kilogram_per_pound = 0.45359237;
		final double meters_per_inch = 0.0254;

		//Prompt user to input weight from keyboard.
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		//Prompt user to input height from keyboard.
		System.out.print("Enter the height in inches: ");
		double height = input.nextDouble();

		//Convert the weight to Kilo
		double weight_in_kilo = weight * kilogram_per_pound;

		//Convert the height to meters
		double height_in_meters = height * meters_per_inch;

		//Compute the BMI
		double bmi = weight_in_kilo / (height_in_meters * height_in_meters);

		//display the result
		System.out.println("BMI is " + bmi);

		//selection statement to determine weight class
		if (bmi < 18.5)
			System.out.println("You are underweight!");
		else if (bmi < 25)
			System.out.println("Your weight is normal!");
		else if (bmi < 30)
			System.out.println("You are overweight!");
		else
			System.out.println("You are obese!");
	}
}
