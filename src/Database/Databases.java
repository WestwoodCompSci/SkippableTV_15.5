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
		try {
			 
			myEpisode=new Episode();
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(myEpisode.getEpisodeName());
			bw.write(myEpisode.getEpisodeInfo());
			bw.write(myEpisode.getSkippability());
			bw.write(myEpisode.getNumEpisode());
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		try {
			 
			mySeason=new Season();
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(mySeason.getComments(username));
			bw.write(mySeason.getEpisodes(List<String>thing));
			
			bw.write(mySeason.getInfo());

			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			 
			myShow=new Show(Password, Password, 0, null, 0, null);
 
			File file = new File("database.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(myShow.getName());
			bw.write(myShow.getInfo());
			bw.write(myShow.getNumOfSeasons());
			bw.write(myShow.getEpisodes(List<String>Show));
			bw.write(myShow.getSeason(0));
			bw.write(myShow.getComments(Username));
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	}
	

