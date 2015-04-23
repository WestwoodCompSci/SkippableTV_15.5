import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.json.stream;

public class DataEntry {

	public void urlConnection()
	{
		try{
		URL url = new URL("http://api.tvmaze.com/search/shows?q=sherlock");
		URLConnection apiConnection = url.openConnection();
		DataInputStream dis = new DataInputStream(apiConnection.getInputStream());
	      String inputLine;

          while ((inputLine = dis.readLine()) != null) {
              System.out.println(inputLine);
          }
          dis.close();
      } catch (MalformedURLException me) {
          System.out.println("MalformedURLException: " + me);
      } catch (IOException ioe) {
          System.out.println("IOException: " + ioe);
      }
	}
	
	public void parse()
	{
		 URL url = new URL("http://api.tvmaze.com/search/shows?q=sherlock");
		 try (InputStream is = url.openStream()
				 {
			 		
				 }
	
	}
}
