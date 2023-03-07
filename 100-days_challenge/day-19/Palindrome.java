//import scanner
import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter a String
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		//display result
		System.out.println("Ignoring nonalphanumeric characters,\nis  " + s + " a palindrome? " + isPalindrome(s));
	}

	//A method that returns true if a string is a palindrome
	public static boolean isPalindrome(String s) {
		//create a string eliminating nonalphanumeric characters
		String s1 = filter(s);

		//create a new string that is the reversal of s1
		String s2 = reverse(s1);

		//check if the reversal is the same as the original string
		return s2.equals(s1);
	}

	//A method that eliminates nonalphanumeric chars in a string
	public static String filter(String s) {
		//create a Stringbuilder
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}

		//return filtered string
		return stringBuilder.toString();
	}

	//A method that creates a new string by reversing a specified string
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();

		return stringBuilder.toString();
	}
}
