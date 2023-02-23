//import scanner
import java.util.Scanner;

class AnalyzeNumbers {
	public static void main (String[ ] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//prompt user to input number of items
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		double sum = 0;

		//prompt the user to enter the numbers
		System.out.print("Enter the numbers: ");
		
		//store number in array
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}

		//get average 
		double average = sum / n;

		int count = 0;
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;

		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);
	}
}
