//import Scanner
import java.util.Scanner;

class TestLoan {
	public static void main(String[] args) {

		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter annual interest rate
		System.out.print("Enter annual Interest rate: ");
		double annualInterestRate = input.nextDouble();

		//prompt user to enter number of years
		System.out.print("Enter number of years (as an integer): ");
		int numberOfYears = input.nextInt();

		//prompt user to enter loan amount
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();

		//create Loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		//display the results
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}
