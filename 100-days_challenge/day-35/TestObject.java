import java.io.*;
import java.util.Date;

class TestObject {
	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		try (
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
		) {
			String name = input.readUTF();
			double score = input.readDouble();
			Date date = (Date)(input.readObject());
			System.out.println(name + " " + score + " " + date);
		}
	}
}
