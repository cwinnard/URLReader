import java.io.IOException;
import java.util.Scanner;

public class URLReaderApp {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please copy and paste the desired URL: ");
			String urlInput = sc.nextLine();

			String urlContents = URLReader.getUrlContents(urlInput);

			String editedURLContents = WordReplace.wordReplace(urlContents);

			URLWriter.writeContentToHTMLFile(editedURLContents);

			System.out.println("Done!");

			sc.close();
		}

		catch (IOException e) {
			System.out.println("Error!  Unacceptable URL.");
		}
	}

}
