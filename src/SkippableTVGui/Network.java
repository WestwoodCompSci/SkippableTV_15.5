import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


public class Network {

	public static boolean connectAuthentication(String username, String password){
		List<String> response = connect("");
		
		return !(response.get(0).equals("ERROR: CONNECTION"));
		
	}
	
	public static boolean connectAddUser(String username, String password){
		List<String> response = connect("");
		
		return !(response.get(0).equals("ERROR: CONNECTION"));
	}
	
	public static List<String> connectShow(String username, String password, String show){
		List<String> response = connect("");
		return response;
	}
	
	private static List<String> connect(String url){
		URL u = null;
		List<String> ls = new ArrayList<String>();
		try {
			u = new URL("Place url here");
			URLConnection urlConnection = u.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			while(in.readLine() != null){
				ls.add(in.readLine());
			}
			
			return ls;
		} catch (Exception e) {
			ls.clear();
			ls.add("ERROR: CONNECTION");
			return ls;
		}
	}
}
