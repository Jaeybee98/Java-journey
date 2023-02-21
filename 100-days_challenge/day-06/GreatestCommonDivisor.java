//import scanner
import java.util.Scanner;

class GreatestCommonDivisor {
	public static void main(String[] args) {
		//initialise scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		//display result
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is: " + gcd(n1, n2));
	}

	//define the method
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 2;

		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}

		return gcd;
	}
}
