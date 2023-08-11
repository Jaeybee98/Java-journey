import java.util.Scanner;

public class TestJokeManagerInterface {
	public static void main(String[] args) {
		JokeManager manager = new JokeManager();
		Scanner scanner = new Scanner(System.in);

		JokeManagerInterface ui = new JokeManagerInterface(manager, scanner);
		ui.start();
	}
}
