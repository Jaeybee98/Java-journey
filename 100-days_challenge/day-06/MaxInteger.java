//import scanner
import java.util.Scanner;

class MaxInteger {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//prompt user to input two integers
		System.out.print("Enter first integer: ");
		int first = input.nextInt();
		System.out.print("Enter second integer: ");
		int second = input.nextInt();

		//display result
		System.out.println("The maximum number of " + first + " and " + second + " is: " + max(first, second));
	}

	//define the method
	public static int max(int num1, int num2) {
		int result;

		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}
}
