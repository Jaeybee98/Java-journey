//import scanner
import java.util.Scanner;

class GuessNumber {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//generate a random number to be guessed
		int number = ((int)(Math.random() * 100));

		System.out.println("Guess a number between 0 and 99 ");
		
		int guess = -1;
		while (guess != number) {

			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number) 
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}
	}
}
