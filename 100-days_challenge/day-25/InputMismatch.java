import java.util.*;

class InputMismatch {
	public static void main(String[] args) {

		//initialise scanner
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do {
			try {
				System.out.print("Enter an Integer: ");
				int number = input.nextInt();

				System.out.println("The number entered is " + number);

				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Try again. (" + "Incorrect input: an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
	}
}
