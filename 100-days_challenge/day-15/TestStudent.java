class TestStudent {
	public static void main(String[] args) {

		Student student = new Student(3113129, "Jaeybee");
		java.util.Date dateCreated = student.getDateCreated();
		dateCreated.setTime(200000);
	}
}
