import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLReader {
	public static String getUrlContents(String theUrl) throws IOException {
		if (theUrl == null) {
			throw new IllegalArgumentException();
		}
		
		
	    StringBuilder content = new StringBuilder();
	      URL url = new URL(theUrl);
	      HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	      BufferedReader urlReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	      String line;
	      while ((line = urlReader.readLine()) != null)
	      {
	        content.append(line + "\n");
	      }
	      urlReader.close();
	    return content.toString();
	  }
}
