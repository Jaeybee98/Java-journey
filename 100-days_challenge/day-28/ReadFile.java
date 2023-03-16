//import Scanner
import java.util.Scanner;

//import File class
import java.io.File;

class ReadFile {
	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		Scanner input = new Scanner(file);

		//read data from file
		while (input.hasNext()) {
			String firstName = input.next();
			String middleName = input.next();
			String lastName = input.next();
			int score = input.nextInt();

			System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
		}

		//close the file
		input.close();
	}
}
