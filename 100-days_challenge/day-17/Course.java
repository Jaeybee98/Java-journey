class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	//add a course
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	//add students
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	//return students
	public String[] getStudents() {
		return students;
	}
	
	//return number of students
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	//return course name
	public String getCourseName() {
		return courseName;
	}
}
