import java.io.FileWriter;
import java.io.IOException;

public class URLWriter {
	
	public static void writeContentToHTMLFile(String content) throws IOException {
		if (content == null) {
			throw new IllegalArgumentException();
		}
		
		FileCreator.createNewHTMLFile();
		FileWriter urlWriter = new FileWriter("src/VocabHTMLTest.html", true);
		urlWriter.write(content);
		urlWriter.close();
	}

}
