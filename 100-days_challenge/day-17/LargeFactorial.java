//import scanner
import java.util.Scanner;

//import math package
import java.math.*;

class LargeFactorial {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter an integer
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		//display result
		System.out.println(n + "! is \n" + factorial(n));
	}
	
	//create a factorial method
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++)
			result = result.multiply(new BigInteger(i + ""));

		return result;
	}
}
