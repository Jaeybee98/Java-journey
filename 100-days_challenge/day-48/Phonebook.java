import java.util.*;

class TestPhonebook {
	public static void main(String[] args) {
		System.out.println("Welcome to Ajibola's Phonebook");
		Phonebook phonebook = new Phonebook();
		boolean exit = false;


		while(!exit) {
			Scanner scan = new Scanner(System.in);
			TestPhonebook.menu();

			switch( scan.nextInt() ) {
				case 1:
					phonebook.list();
					break;
				case 2:
					phonebook.add();
					break;
				case 3:
					phonebook.show();
					break;
				case 4:
					phonebook.edit();
					break;
				case 5:
					phonebook.delete();
					break;
				default :
					System.out.println("INVALID");
					break;
			}

			System.out.println("Would you like to exit?");
			scan = new Scanner(System.in);

			if ( scan.nextLine().isEmpty() ) {
				exit = false;
			}
			else {
				exit = true;
			}
		}	
	}

	public static void menu() {
		System.out.println("MENU");
		System.out.println("[1] Show list of contact");
		System.out.println("[2] Create");
		System.out.println("[3] show");
		System.out.println("[4] edit");
		System.out.println("[5] delete");
	}

}

class Phonebook {

	Stack<Contact> contacts;

	Phonebook()
	{
		this.contacts = new Stack<Contact>();
	}


	public void list()
	{
		if( this.contacts.empty() )
		{
			System.out.println("Empty");
		}
		else
		{
			for(Enumeration<Contact> e = this.contacts.elements(); e.hasMoreElements();)
			{
				Contact contact = e.nextElement();
				System.out.println(contact.name + ", " + contact.number );
			}
		}

	}

	public void add() { }
	public void show() { }
	public void edit() { }
	public void delete() { }
}

class Contact {

	String name;
	String number;

	Contact(String name, String number){
		this.name = name;
		this.number = number;
	}
}
