import java.util.Scanner;

public class TextUI {
	private Scanner scanner;
	private SimpleDictionary dict;

	public TextUI(Scanner scanner, SimpleDictionary dict) {
		this.scanner = scanner;
		this.dict = dict;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			if (command.contains("end")) {
				System.out.println("Bye bye!");
				break;
			}
			else if (command.contains("add")) {
				System.out.print("Word: ");
				String word = scanner.nextLine();
				String translation = "Translation " +  dict.translate(word);
			}
			else if (command.contains("search")) {
				System.out.print("Word: ");
				String word = scanner.nextLine();
				String translation = "Translation " +  dict.translate(word);
			}
			else {
				System.out.println("Unknown command");
			}
		}
	}
}
