//import File
import java.io.File;

//import PrintWriter
import java.io.PrintWriter;

class WriteData {
	public static void main(String[] args) throws Exception {
		File file = new File("scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try ( 
			PrintWriter output = new PrintWriter(file);
		    ) {
			output.print("Ajibola Q Junaid");
			output.println(90);
			output.print("Adewale M Fatoki");
			output.println(85);
		}
	}
}
