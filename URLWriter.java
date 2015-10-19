import java.io.FileWriter;
import java.io.IOException;

public class URLWriter {
	
	public static void writeContentToHTMLFile(String content) throws IOException {
		if (content == null) {
			throw new IllegalArgumentException();
		}
		
		FileCreator.createNewHTMLFile();
<<<<<<< HEAD
		FileWriter urlWriter = new FileWriter("src/VocabHTMLTest.html", true);
=======
		FileWriter urlWriter = new FileWriter(new FileWriter("src/VocabHTMLTest.html", true));
>>>>>>> 9d9f0d5b5bbb08a85c7241d0165bf110e6b5fbb2
		urlWriter.write(content);
		urlWriter.close();
	}

}
