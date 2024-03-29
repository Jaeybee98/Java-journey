import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
	private Scanner scanner;
	private ArrayList<String> jokes;

	public JokeManager() {
		this.scanner = new Scanner(System.in);
		this.jokes = new ArrayList<>();
	}

	public void addJoke(String joke) {
		jokes.add(joke);
	}

	public String drawJokes() {
		if (jokes.isEmpty()) {
			return "Jokes are in short supply.";
		} 
		else {
			Random draw = new Random();
			int index = draw.nextInt(jokes.size());
			return jokes.get(index);
		}
	}

	public void printJokes() {
		for (String joke : jokes) {
			System.out.println(joke);
		}
	}
}
