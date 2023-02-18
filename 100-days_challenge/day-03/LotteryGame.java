//This is a basic lottery game putting into practise what i've learnt on #day3 of the #100daysofcodechallenge.

//import scannner class
import java.util.Scanner;

class LotteryGame {
       public static void main(String[] args) {

	       //initialise scanner
	       Scanner input = new Scanner(System.in);

	       //generate a random number between 0 -100
	       int lottery = ((int)(Math.random() * 100));

	       //prompt user to input a lottery pick
	       System.out.print("Enter your lottery number(must be 2 digits): ");
	       int guess = input.nextInt();

	       //generate the lottery number
	       int lotteryDigit1 = lottery / 10;
	       int lotteryDigit2 = lottery % 10;

	       //get guess digit
	       int guessDigit1 = guess / 10;
	       int guessDigit2 = guess % 10;
	
	       //display lottery number
	       System.out.println("The lottery number is " + lottery);

	       if (guess == lottery)
		       System.out.println("Exact match: You win $10,000");
	       else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
		       System.out.println("Match all digits: You win $3,000");
	       else if (
			       guessDigit1 == lotteryDigit1
			   ||  guessDigit1 == lotteryDigit2
			   ||  guessDigit2 == lotteryDigit1
			   ||  guessDigit2 == lotteryDigit2
		       )
		       System.out.println("Match one digit: You win $1,000");
	       else
		       System.out.println("Sorry, there's no match");

	}
}
