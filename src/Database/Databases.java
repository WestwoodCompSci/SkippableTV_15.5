package Database;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Databases 
{
	//FIELDS TODO
	private String Username;
	private String Password;
	private String name;
	private User user;
	public void Database()
	{
		Username="";
		Password="";
		name="";
	}
	
	public String lookupPassword(String Password)
	{
		return Password;
	}
	public String lookupUsername(String Username)
	{
		return Username;
	}
	public User getUser(String Username, String password)
	{
		if(User.getUsername()==Username &&	User.getPassword() ==Password)
		{
			user=new User();
			User.addUsername(Username);
			User.addPassword(password);
			
			return user;
		}
		return null;
	}
	public List<Show> getShow(String name)
	{
		return User.getShows();
	}
	
	public void appendtoDatabaseFile(Show myShow,Season mySeason,Episode myEpisode)
	{
		File database=new File("Database.txt");
		
	}
	
	public static void addUsertoCredentials(String username, String password){
		String filename = "credentials.txt";
		FileWriter fw = new FileWriter(filename, true);
		BufferedWriter bw = new BufferedWriter(fw);
		Encoder thing = new Encoder(filename);
		bw.write(username + " , ");
		thing.write(password);
		bw.write("\n");
		
		bw.close();
	}
	
	public static void addUsertoUserFile(String username, String email, List<Show> mines, List<Episode> ep) throws IOException{
		String filename = "users.txt";
		FileWriter fw = new FileWriter(filename, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(username + "\n" + email + "\n[Show:");
		for (int i = 0; i < mines.size(); i ++)
		{	
			bw.write("(" + mines.get(i).getName() + ")");
		}
		bw.write("] \n" +  "[EpisodesWatched:");
		for (int j = 0; j< ep.size(); j ++)
		{
			bw.write("(" + ep.get(j).getEpisodeName() + ")");
		}	
	}
	
	
}
