//import Date
import java.util.Date;

class Student {

	private int id;
	private String name;
	private Date dateCreated;

	public Student(int nin, String newName) {
		id = nin;
		name = newName;
		dateCreated = new Date();
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
}
