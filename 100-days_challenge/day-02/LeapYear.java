//import the scanner class to read input from keyboard.
import java.util.Scanner;

class LeapYear {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//prompt user to input the year
		System.out.print("Enter year: ");
		int year = input.nextInt();

		//use boolean to check if it's a leap year.
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		//display the results
		System.out.println(year + " is a leap year? " + isLeapYear);
	}
}
