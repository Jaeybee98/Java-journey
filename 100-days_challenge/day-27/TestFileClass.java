//import File
import java.io.File;

class TestFileClass {
	public static void main(String[] args) {
		File file = new File("images.gif");

		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a fie? " + file.isFile());
	}
}
