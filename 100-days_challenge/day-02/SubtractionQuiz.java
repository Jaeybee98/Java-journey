//import the scanner class
import java.util.Scanner;

class SubstractionQuiz {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//generate two random numbers
		int number1 = ((int)(Math.random() * 10));
		int number2 = ((int)(Math.random() * 10));

		//if statement to assign the highest number to number1
		if (number1 < number2) { 
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		//display and prompt user to answer the question
		System.out.println("What is " + number1 + " - " + number2 + "?");
		System.out.print("Answer: ");
		int answer = input.nextInt();

		//if statement to check if it's correct
		if (number1 - number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("You are wrong!");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}
}
