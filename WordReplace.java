import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordReplace {

	public static String wordReplace(String content) throws IOException {
		if (content == null) {
			throw new IllegalArgumentException();
		}

		BufferedReader vocabListReader = new BufferedReader(new FileReader("src/VocabWordList.txt"));
		String line;
		while ((line = vocabListReader.readLine()) != null)
	      {
			content = content.replaceAll(" " + line + " ", " <mark>"+line+"</mark> ");
	      }
		
		vocabListReader.close();
		return content;
	}
}
