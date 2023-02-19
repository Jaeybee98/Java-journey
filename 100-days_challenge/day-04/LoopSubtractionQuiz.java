//import scanner
import java.util.Scanner;

class LoopSubtractionQuiz {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//number of questions
		final int NUMBER_OF_QUESTIONS = 5;
		
		//count the number of correct answers
		int correctCount = 0;

		//count the number of questions
		int count = 0;

		//start timer
		long startTime = System.currentTimeMillis();
		String output = " ";

		//set loop condition
		while (count < NUMBER_OF_QUESTIONS) {
			
			//generate two random numbers
			int number1 = ((int)(Math.random() * 100));
			int number2 = ((int)(Math.random() * 100));

			//swap number1 and number2 if number2 is > number1
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			//display question and prompt user to answer
			System.out.println("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			//grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				//increase the correct answer count
				correctCount++;
			}
			else
				System.out.println("Your answer is wrong! \nThe correct answer is: " + (number1 - number2));
			
			//increase the question count
			count++;

			output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
		}

		//end timer
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		//display results
		System.out.println("Correct count is: " + correctCount + "\nTest time is: " + testTime / 1000 + "seconds\n" + output);
	 }
}	
