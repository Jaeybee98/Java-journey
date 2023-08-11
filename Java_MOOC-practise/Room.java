import java.util.ArrayList;

public class Room {
	private ArrayList<Person> rooms;

	public Room() {
		this.rooms = new ArrayList<>();
	}

	public void add(Person person) {
		rooms.add(person);
	}

	public boolean isEmpty() {
		return rooms.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return rooms;
	}

	public Person shortest() {
		if (rooms.isEmpty()) {
			return null;
		}

		Person shortestPerson = rooms.get(0);
		for (Person person : rooms) {
			if (person.getHeight() < shortestPerson.getHeight()) {
			       shortestPerson = person;
			}
		}
		return shortestPerson;
	}

	public Person take() {
		if (rooms.isEmpty()) {
			return null;
		}
		
		Person shortestPerson = rooms.get(0);
		for (Person person : rooms) {
			if (person.getHeight() < shortestPerson.getHeight()) {
				shortestPerson = person;
			}
		}
		rooms.remove(shortestPerson);
		return shortestPerson;
	}
}
