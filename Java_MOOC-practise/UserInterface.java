import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	private TodoList todoList;
	private Scanner scanner;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			if (command.contains("stop")) {
				break;
			}
			else if (command.contains("add")) {
				System.out.print("To add: ");
				String add = scanner.nextLine();
				todoList.add(add);
			}
			else if (command.contains("list")) {
				todoList.print();
			}
			else if (command.contains("remove")) {
				System.out.print("Which one is removed? ");
				int removed = scanner.nextInt();
				todoList.remove(removed);
			}
		}
	}
}
