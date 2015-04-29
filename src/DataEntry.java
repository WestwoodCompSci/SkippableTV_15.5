import java.io.DataInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


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
		try{
			
		 URL url = new URL("http://api.tvmaze.com/search/shows?q=sherlock");
		 
		 try (InputStream is = url.openStream())
				 {
			 		FileReader reader = new FileReader("H:\\CompSci3\\SkippableTV_15.5\\sherlock.json");
			 		JSONParser parser = new JSONParser();
			 		JSONObject jsonObj = (JSONObject) parser.parse(reader);
			 		String showname = (String) jsonObj.get("epguide_name");
			 		//update database class
			 		int numofseasons;
			 		List<Integer> seasons = null;
			 		seasons.add((Integer) jsonObj.get("season"));
			 		for(int i=0; i<) 	
				 }
		}
		catch(Exception e){
			
		}
	
	}
}
