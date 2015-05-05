package Database;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class User {

	private static  String name;
	private static  String password;
	private  static List<Show> myShows;
	private static  String email;
	private static List<Episode> episodeswatched;
	private static FileWriter fw;
	
	
	
	public User()
	{
		name = null;
		password = null;
		myShows = null;
		email = null;
	}
	
	public static String addPassword(String password)
	{
		String thing = password;
		//new Encoder hi = Encoder("credentials.txt");
		//hi.write(password)
		return thing;
	}
	
	public static String addUsername(String username)
	{
		String thing = username;
		//new Encoder hi = Encoder("credentials.txt");
		//hi.write(username);
		return thing;
	}
	
	public static  String addUserEmail(String email)
	{
		String thing = email;
		//add to text file
		return thing;
	}
	
	public static void addEpisodeWatched(Episode thing)
	{
		episodeswatched.add(thing);
	}
	
	public static  String addShow(Show show)
	{
		String thing = show.getName();
		//add show to text file
		return thing;
	}
	
	public static  List<Show> getShows(){
		return myShows;
	}
	
	public static  String getEmail()
	{
		return email;
	}
	
	public static  String getUsername()
	{
		return name;
	}
	
	public static  String getPassword()
	{
		return password;
	}
	
	public static List<Episode> getEpisodesWatched()
	{
		return episodeswatched;
	}
	
	public static void addUsertoCredentials(String username, String password){
		String filename = "credentials.txt";
		FileWriter fw = new FileWriter(filename, true);
		Encoder thing = new Encoder(filename);
		fw.write(username + " , ");
		thing.write(password);
		fw.write("\n");
		
	}
	
	public static void addUsertoUserFile(String username, String email, List<Show> mines, List<Episode> ep) throws IOException{
		String filename = "users.txt";
		fw = new FileWriter(filename, true);
		fw.write(username + "\n" + email + "\n[Show:");
		for (int i = 0; i < mines.size(); i ++)
		{
			String name = mines.get(i).getName();
			String info = mines.get(i).getInfo();
			Integer seasons = mines.get(i).getNumOfSeasons();
			
			
			fw.write("(" + name + info + seasons + ")");
		}
		
		
		
		
	}
	
}
