public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }

    public Person(String initialName, int height) {
	    this.name = initialName;
	    this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
	    return this.height;
    }

    public String toString() {
	    return this.name + " (" + getHeight() + " cm)";
    }
}
