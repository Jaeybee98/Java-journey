import java.util.Scanner;

public class TestUserInterface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TodoList list = new TodoList();

		UserInterface userInterface = new UserInterface(list, scanner);
		userInterface.start();
	}
}

