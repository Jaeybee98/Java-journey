class TestCourse {
	public static void main(String[] args) {
		
		//create two course objects
		Course course1 = new Course("Data Structures");
		Course course2 =new Course("Database Systems");

		//add student for course1
		course1.addStudent("Fatoki Adewale");
		course1.addStudent("Junaid Ajibola");
		course1.addStudent("Oyewole Nimota");

		//add student for course2
		course2.addStudent("Soremekun Edward");	
		course2.addStudent("Oladeinde Ariz");

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) 
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
		System.out.println();
	}
}
