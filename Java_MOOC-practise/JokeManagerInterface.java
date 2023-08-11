import java.util.Scanner;
import java.util.Random;

public class JokeManagerInterface {
	private Scanner scanner = new Scanner(System.in);
	private JokeManager jokes = new JokeManager();
	
	public JokeManagerInterface(JokeManager joke, Scanner scanner) {
		this.jokes = joke;
		this.scanner = scanner;
	}

	public void start() {
		
		while (true) {
			System.out.println("Commands:");
    			System.out.println(" 1 - add a joke");
    			System.out.println(" 2 - draw a joke");
    			System.out.println(" 3 - list jokes");
    			System.out.println(" X - stop");

    			String command = scanner.nextLine();

			if (command.equals("X")) {
				break;
			}
			else if (command.equals("1")) {
				System.out.println("Write the joke to be added:");
        			String joke = scanner.nextLine();
        			jokes.addJoke(joke);
			}
			else if (command.equals("2")) {
				System.out.println("Drawing a joke.");
				jokes.drawJokes();
			}
			else if (command.equals("3")) {
				System.out.println("Printing the jokes.");
				jokes.printJokes();
			}
		}
	}
}
