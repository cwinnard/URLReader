import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class URLReaderApp {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("Please copy and paste the desired URL: ");
				String urlInput = sc.nextLine();

				String urlContents = URLReader.getUrlContents(urlInput);

				String editedURLContents = WordReplace.wordReplace(urlContents);

				URLWriter.writeContentToHTMLFile(editedURLContents);

				System.out.println("Done!");
				
				File fileHTML = new File("src/VocabHTMLTest.html");
				Desktop.getDesktop().open(fileHTML);
				sc.close();
				break;
			}

			catch (IOException e) {
				System.out.println("Error!  Unacceptable URL.");
				continue;
			}
		}
	}
}
