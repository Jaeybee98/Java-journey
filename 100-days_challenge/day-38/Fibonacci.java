import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		System.out.println("The Fibonacci number at index " + index + " is " + fibonacci(index));
	}

	//fibonacci method
	public static long fibonacci(long index) {
		if (index == 0) //base case
			return 0;
		else if (index == 1)
			return 1;
		else //reduction and recursive calls
			return fibonacci(index - 1) + fibonacci(index - 2);
	}
}
